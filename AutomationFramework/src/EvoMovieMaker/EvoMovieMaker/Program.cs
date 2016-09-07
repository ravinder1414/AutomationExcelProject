using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EvoMovieMaker
{
    class Program
    {
        static void Main(string[] args)
        {
            //string fileName = @"C:\tempImg\V2\A6.avi";

            //string folderName = @"C:\tempImg\V2";

            try
            {
                string fileName = args[0];
                string folderName = args[1];

                Console.WriteLine("Strat");

                MovieMaker movie = new MovieMaker();
                movie.CreateMovie(fileName, folderName);

                Console.WriteLine("Done");
            }
            catch
            {
                Console.WriteLine("Error");
            }
        }
    }
}
