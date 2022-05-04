package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class Screenshot extends BaseClass
{
	
	public static String takeScreenshot() throws IOException
	{
		TakesScreenshot scrnshot=(TakesScreenshot)driver;
		File sshot=scrnshot.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		String date=dateFormat.format(d);
		String timeStamp=System.getProperty("user.dir")+"/Screenshots/"+date.replaceAll("/","-").replaceAll(":","-").replaceAll(" ","_")+"_screenshot.png";
	    File dest=new File(timeStamp);
	    FileUtils.copyFile(sshot, dest);
	    return timeStamp;
	}

}
