package appModules;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.Constant;
import utility.RandomGenerator;

public class functionLibary {
	
	static WebDriver driver = Constant.driver;
	public static void registration(String Title,String Forename,String Surname,String EmailAddress,String Postcode,String Street,String Town,String Country, 
			String PreferredContactNumber,String NINumber,String Proofofrighttowork,String Jobspecific,String RefNumber,String Preferredlocations,String JobRoleIndustry,String JobRole,String JobSkills,String Source,String 
			SourceOther,String Message) throws InterruptedException{
		try{
		if(!driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[1]/td/input")).isSelected())
			driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[1]/td/input")).click();
		if(!driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td/input")).isSelected())
			driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td/input")).click();
		driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[3]/td/input")).clear();
		driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[3]/td/input")).sendKeys(RefNumber);
		if(Preferredlocations.equals("null"))
			Preferredlocations = "";
		new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[4]/td/select"))).selectByVisibleText(Preferredlocations);
		if(Title.equals("null"))
			Title = "";
	   if(null != Title && !Title.isEmpty())
		   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[5]/td/div/span/select"))).selectByVisibleText(Title);
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[6]/td/div/input")).clear();
	   if(Forename.equals("null"))
		   Forename = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[6]/td/div/input")).sendKeys(Forename);
	   if(Surname.equals("null"))
		   Surname = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[7]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[7]/td/div/input")).sendKeys(Surname);
	   if(PreferredContactNumber.equals("null"))
		   PreferredContactNumber = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[8]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[8]/td/div/input")).sendKeys(PreferredContactNumber);
	   if(EmailAddress.equals("null"))
		   EmailAddress = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[9]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[9]/td/div/input")).sendKeys(EmailAddress);
	   if(NINumber.equals("null"))
		   NINumber = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[10]/td/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[10]/td/input")).sendKeys(NINumber);
	   if(Street.equals("null"))
		   Street = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[1]/td[2]/textarea")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[1]/td[2]/textarea")).sendKeys(Street);
	   if(Town.equals("null"))
		   Town = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[2]/td[2]/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[2]/td[2]/input")).sendKeys(Town);
	   //driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[3]/td[2]/input")).clear();
	  // driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[3]/td[2]/input")).sendKeys(Town);
	   if(Postcode.equals("null"))
		   Postcode = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[4]/td[2]/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[4]/td[2]/input")).sendKeys(Postcode);
	  // driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[5]/td[2]/input")).clear();
	  // driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[5]/td[2]/input")).sendKeys(Country);
	   if( null != JobRole && !JobRole.isEmpty())
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[3]/td/select"))).selectByVisibleText(JobRole);
	   //new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[4]/td/select"))).selectByVisibleText("Reach Forklift");
	   Thread.sleep(3000);
	 
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[6]/td/div/a")).click();
	  Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@class='detailList']//tbody/tr[10]/td[contains(@class,'data2Col')]")).sendKeys("mno");
	    //driver.findElement(By.xpath("xpath=//*[@class='detailList']//tbody/tr[7]/td[contains(@class,'data2Col')]")).sendKeys("def");
	  if( null != Source && !Source.isEmpty())
	  new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[1]/td/span/select"))).selectByVisibleText(Source);
	  if(SourceOther.equals("null"))
		  SourceOther = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[2]/td/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[2]/td/input")).sendKeys(SourceOther);
	   driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td/input[1]")).click();
	   Thread.sleep(2000);
		try{
			
			 WebElement we =driver.findElement(By.xpath("//div[@id='j_id0:j_id2:j_id3:j_id8:j_id9:j_id10:j_id11:0:j_id12:j_id13:j_id15']"));
			 WebElement web = null;
			    String exptxt =we.getText();
			    Constant.Vars.setTestdata("Expected result is"+" "+Constant.Vars.getTestdata() + " "+"and Actual result is"+exptxt);
			    //System.out.println(exptxt);
			   Boolean result = exptxt.toLowerCase().contains(Message.toLowerCase());
			   if(result){
				   
				   
				  System.out.println(exptxt+""+"is coming"+" "+"but it should be"+Message+" "+" so passed");
			   }
			  /* if(!result && null != exptxt){
				   loopForRegistration;
			   }*/
			   else if((!result)){
				   try{
				   web =driver.findElement(By.xpath("//input[@value='Ok']"));
				   if(web.isDisplayed()){
					   driver.findElement(By.linkText("Applicants")).click();
						driver.findElement(By.name("new")).click(); 
						System.out.println(exptxt+""+"is coming"+" "+"but it should be"+Message+" "+" so failed");
				   }
				   }catch(Exception ex){
						   System.out.println("message not matched");
						   System.out.println(exptxt+""+"is coming"+" "+"but it should be"+Message+" "+" so failed");
				   }
				   
			   }
			  
			
		}catch(Exception e){
			System.out.println("page not filled correctly");
		}
		Thread.sleep(3000);
		}catch(Exception e){
			
			System.out.println("Not able to identify the elements on page");
			
			
		}
	}	
	
	public static void medacsregistration(String Title,String Forename,String Surname,String EmailAddress,String Postcode,String Street,String Town,String StateProvince,String Country, 
			String PreferredContactNumber,String GMCGDCStatus,String GMCGDCNumber,String JobRole,String Grade,String Speciality,String SubSpecialty,String Source,String 
			SourceOther,String Message) throws InterruptedException{
		if(Title.equals("null"))
			Title = "";
        if(null != Title && !Title.isEmpty())
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[1]/td/div/span/select"))).selectByVisibleText(Title);
        if(Forename.equals("null"))
 		   Forename = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td/div/input")).sendKeys(Forename);
	   if(Surname.equals("null"))
		   Surname = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[3]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[3]/td/div/input")).sendKeys(Surname);
	   if(PreferredContactNumber.equals("null"))
		   PreferredContactNumber = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[4]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[4]/td/div/input")).sendKeys(PreferredContactNumber);
	   if(EmailAddress.equals("null"))
		   EmailAddress = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[5]/td/div/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[5]/td/div/input")).sendKeys(EmailAddress);
	   if(GMCGDCStatus.equals("null"))
		   GMCGDCStatus = "";
	   if( null != GMCGDCStatus && !GMCGDCStatus.isEmpty()  )
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[6]/td/div/span/select"))).selectByVisibleText(GMCGDCStatus);
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[7]/td/input")).clear();
	   Random rnd = new Random();
	   Integer gMCGDCNumberTemp = 100000 + rnd.nextInt(900000);
	   if(gMCGDCNumberTemp.toString().length() != GMCGDCNumber.length()){
		   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[7]/td/input")).sendKeys(GMCGDCNumber);
	   }else
		   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[3]/td/div/div/table/tbody/tr[7]/td/input")).sendKeys(gMCGDCNumberTemp.toString());
	   if(Street.equals("null"))
		   Street = "";
       driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[1]/td[2]/textarea")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[1]/td[2]/textarea")).sendKeys(Street);
	   if(Town.equals("null"))
		   Town = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[2]/td[2]/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[2]/td[2]/input")).sendKeys(Town);
	   if(StateProvince.equals("null"))
		   StateProvince = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[3]/td[2]/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[3]/td[2]/input")).sendKeys(StateProvince);
	   if(Postcode.equals("null"))
		   Postcode = "";
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[4]/td[2]/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[4]/td[2]/input")).sendKeys(Postcode);
	  // driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[5]/td[2]/input")).clear();
	   //driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[4]/td/div/div[2]/table/tbody/tr/td/span/table/tbody/tr[5]/td[2]/input")).sendKeys(Country);
	   //if(!JobRole.isEmpty() && null != JobRole)
	   //new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[3]/td/select"))).selectByVisibleText("");
	   if(Grade.equals("null"))
		   Grade = "";
	   if(null != Grade && !Grade.isEmpty())
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[3]/td/select"))).selectByVisibleText(Grade);
	   if(Speciality.equals("null"))
		   Speciality = "";
	   if(null != Speciality && !Speciality.isEmpty())
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[4]/td/select"))).selectByVisibleText(Speciality);
	   if(SubSpecialty.equals("null"))
		   SubSpecialty = "";
	   if(null != SubSpecialty && !SubSpecialty.isEmpty())
	   new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[5]/td/select"))).selectByVisibleText(SubSpecialty);
	   
       Thread.sleep(3000);
	  driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[5]/td/div/div[2]/table/tbody/tr[7]/td/div/a")).click();
	  Thread.sleep(2000);
	  if(Source.equals("null"))
		  Source = "";
      if(null != Source && !Source.isEmpty())
	  new Select( driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[1]/td/span/select"))).selectByVisibleText(Source);
      if(SourceOther.equals("null"))
    	  SourceOther = "";
	  driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[2]/td/input")).clear();
	   driver.findElement(By.xpath("//table[1][@class='detailList']/tbody/tr[6]/td/div/div[2]/table/tbody/tr[2]/td/input")).sendKeys(SourceOther);
	   
	   driver.findElement(By.xpath("//div[@class='pbBottomButtons']/table/tbody/tr/td/input[1]")).click();
	   Thread.sleep(2000);
		try{
			
			 WebElement we =driver.findElement(By.xpath("//div[@id='j_id0:j_id2:j_id3:j_id8:j_id9:j_id10:j_id11:0:j_id12:j_id13:j_id15']"));
			 WebElement web = null;
			    String exptxt =we.getText();
			    //System.out.println(exptxt);
			   Boolean result = exptxt.toLowerCase().contains(Message.toLowerCase());
			   if(result){
				   
				   
			  System.out.println(exptxt+""+"is coming"+" "+"but it should be"+" "+Message+" "+" so passed");
			   }
//			  /* if(!result && null != exptxt){
//				   loopForRegistration;
//			   }*/
			   else if((!result)){
				   try{
				   web =driver.findElement(By.xpath("//input[@value='Ok']"));
				   if(web.isDisplayed()){
					   driver.findElement(By.linkText("Applicants")).click();
						driver.findElement(By.name("new")).click(); 
						System.out.println(exptxt+""+"is coming"+" "+"but it should be"+" "+Message+" "+" so failed");
				   }
			   }catch(Exception ex){
					   System.out.println("message not matched");
						   System.out.println(exptxt+""+"is coming"+" "+"but it should be"+" "+Message+" "+" so failed");
				   }
			   
			   }
			  
			
		}catch(Exception e){
			System.out.println("page not filled correctly");
		}
		Thread.sleep(3000);
	
	}	
	
}


