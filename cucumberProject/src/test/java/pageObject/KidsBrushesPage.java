package pageObject;


import resuable.WebDriverHelper;
import uistore.KidsBrushesUI;
import utilities.Logs;

public class KidsBrushesPage 
{
	WebDriverHelper helper;
	Logs logs;
	
	public KidsBrushesPage()
	{
		helper=new WebDriverHelper();
		logs=new Logs(KidsBrushesPage.class.getName());
	}

	public boolean findKidsBushes()
	{
		if(helper.findElement(KidsBrushesUI.kids))
		{
			Logs.log.info("Found Kids text on KidsBushesPage");
			return true;
		}
		else {
			Logs.log.info("Not Found Kids text on KidsBrushesPage");
			return false;
		}
	}
}
