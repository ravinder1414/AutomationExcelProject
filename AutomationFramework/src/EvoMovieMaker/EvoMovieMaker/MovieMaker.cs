using System;
using System.IO;
using System.Configuration;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

using AForge.Video.FFMPEG;
using System.Drawing;
using System.Drawing.Imaging;

namespace EvoMovieMaker
{
    public class MovieMaker
    {
        int frameWidth;
        int frameHeight;
        int framRate;
        string folder;

        public MovieMaker()
        {
            frameWidth = GetFrameWidth();
            frameHeight = GetFrameHeight();
            framRate = GetFramRate();

            folder = System.Configuration.ConfigurationManager.AppSettings["Foldername"];
        }

        public void CreateMovie(string fileName, string folderName)
        {
            //int width = 320;
            //int height = 240;
            //var framRate = 2;

            VideoFileWriter writer = new VideoFileWriter();

            try
            {
                if (File.Exists(fileName))
                {
                    File.Delete(fileName);
                }

                writer.Open(fileName, frameWidth, frameHeight, framRate, VideoCodec.Default);

                DirectoryInfo info = new DirectoryInfo(folderName);
                DirectoryInfo[] directoryes = info.GetDirectories().OrderBy(p => p.CreationTime).ToArray();

                foreach (DirectoryInfo dir in directoryes)
                {
                    ProcessFolder(writer, dir.FullName + @"\" + folder);
                }

                writer.Close();

                writer.Dispose();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.Message);
            }
        }

        private void ProcessFolder(VideoFileWriter writer, string folderName)
        {
            DirectoryInfo info = new DirectoryInfo(folderName);
            FileInfo[] files = info.GetFiles("*.png").OrderBy(p => p.CreationTime).ToArray();

            foreach (FileInfo file in files)
            {
                Image reportImg = Image.FromFile(file.FullName);
                using (MemoryStream stream = new MemoryStream())
                {
                    reportImg.Save(stream, ImageFormat.Bmp);
                }

                Bitmap imageEntity = new Bitmap(reportImg);

                string name = file.Name.Substring(0, file.Name.ToLower().IndexOf("_rowno_"));

                var bmpReduced = ReduceBitmap(imageEntity, frameWidth, frameHeight, name);

                writer.WriteVideoFrame(bmpReduced);

                bmpReduced.Dispose();
            }
        }
        
        private Bitmap ReduceBitmap(Bitmap original, int reducedWidth, int reducedHeight, string caption)
        {
            var reduced = new Bitmap(reducedWidth, reducedHeight);
            using (var dc = Graphics.FromImage(reduced))
            {
                // you might want to change properties like
                dc.InterpolationMode = System.Drawing.Drawing2D.InterpolationMode.HighQualityBicubic;
                dc.DrawImage(original, new Rectangle(0, 0, reducedWidth, reducedHeight), new Rectangle(0, 0, original.Width, original.Height), GraphicsUnit.Pixel);
                using (Font arialFont = new Font("Arial", 20, FontStyle.Bold))
                {
                    SizeF textSize = dc.MeasureString(caption, arialFont);
                    dc.DrawString(caption, arialFont, Brushes.Black, new Point((frameWidth - (int)textSize.Width) / 2, frameHeight - 100));
                }
            }

            return reduced;
        }

        private int GetFrameWidth()
        {
            int ret = 320;
            try
            {
                ret = SafeInt(System.Configuration.ConfigurationManager.AppSettings["FrameWidth"]);
            }
            catch
            {
                ret = 320;
            }
            return ret;
        }

        private int GetFrameHeight()
        {
            int ret = 240;
            try
            {
                ret = SafeInt(System.Configuration.ConfigurationManager.AppSettings["FrameHeight"]);
            }
            catch
            {
                ret = 240;
            }
            return ret;
        }

        private int GetFramRate()
        {
            int ret = 2;
            try
            {
                ret = SafeInt(System.Configuration.ConfigurationManager.AppSettings["FramRate"]);
            }
            catch
            {
                ret = 2;
            }
            return ret;
        }
        
        private int SafeInt(string value)
        {
            int ret = 0;
            try
            {
                ret = int.Parse(value);
            }
            catch 
            {
                ret = 0;
            }

            return ret;
        }
    }
}
