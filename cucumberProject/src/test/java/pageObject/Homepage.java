package pageObject;



import resuable.WebDriverHelper;
import uistore.HomeUI;
import utilities.Logs;

public class Homepage 
{
	WebDriverHelper helper;
	Logs logs;
	
	public Homepage()
	{
		helper=new WebDriverHelper();
		logs=new Logs(Homepage.class.getName());
	}
	
	public void clickKidsBrushes()
	{
		helper.clickButton(HomeUI.kidBrushes);
		Logs.log.info("clicked on searchIcon");
	}
	
	public void sendtextSearchBox(String text)
	{
		helper.sendText(HomeUI.serachBox, text);
		Logs.log.info(text+" entered in search Box");
	}
	
	public void clickFloss()
	{
		helper.clickButton(HomeUI.flossFooter);
		Logs.log.info("clicked on Floss in Footer");
	}

	public void hoverMoreProducts()
	{
		helper.hover(HomeUI.moreProducts);
	}
	
	public void clickSearchIcon()
	{
		helper.clickButton(HomeUI.searchIcon);
	}

}
