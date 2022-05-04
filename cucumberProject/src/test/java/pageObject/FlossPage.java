package pageObject;

import org.apache.logging.log4j.Logger;

import resuable.WebDriverHelper;
import uistore.FLossUI;
import utilities.Logs;

public class FlossPage 
{
	WebDriverHelper helper;
	Logs logs;
	Logger log;
	public FlossPage()
	{
		helper=new WebDriverHelper();
		logs=new Logs(FlossPage.class.getName());
	}
	
	public boolean findFlossPicks()
	{
		if(helper.findElement(FLossUI.flossPick))
		{
			Logs.log.info("Found FLOSS PICKS Keyword on FlossPage");
			return true;
		}
		Logs.log.info("Not Found FLOSS PICKS Keyword on FlossPage");
		return false;
	}

}
