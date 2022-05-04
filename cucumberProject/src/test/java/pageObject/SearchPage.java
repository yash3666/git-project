package pageObject;



import resuable.WebDriverHelper;
import uistore.SearchPageUI;
import utilities.Logs;

public class SearchPage
{
	WebDriverHelper helper;
	Logs logs;
	
	public SearchPage()
	{
		helper=new WebDriverHelper();
		logs=new Logs(SearchPage.class.getName());
	}

	public void clicknextPage()
	{
		helper.clickButton(SearchPageUI.nextPage);
	}
	public void find3DWhiteBatteryBrush()
	{
		if(helper.findElement(SearchPageUI.whitebattery))
		{
			Logs.log.info("3DWhiteBatteryBrush found");
		}
		else {
			clicknextPage();
			if(helper.findElement(SearchPageUI.whitebattery))
			{
				Logs.log.info("3DWhiteBatteryBrush found");
			}
			else {
				Logs.log.info("3DWhiteBatteryBrush not found");
			}
		}
	}
}
