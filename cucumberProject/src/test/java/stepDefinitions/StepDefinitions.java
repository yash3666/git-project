package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.FlossPage;
import pageObject.Homepage;
import pageObject.KidsBrushesPage;
import pageObject.SearchPage;
import resuable.WebDriverHelper;
import utilities.BaseClass;

public class StepDefinitions extends BaseClass
{
	Homepage home;
	FlossPage flossp;
	KidsBrushesPage kidsP;
	SearchPage searchP;
	WebDriverHelper helper;

@Given("^Navigate to Website$")
public void navigate_to_Website() throws Throwable {
	
	intializeDriver();
	home=new Homepage();
    flossp=new FlossPage();
	kidsP=new KidsBrushesPage();
	searchP=new SearchPage();
	helper=new WebDriverHelper();
	navigateURL();
}


@When("^Hover on More Products$")
public void hover_on_More_Products() throws Throwable {
	home.hoverMoreProducts();
	
}

@When("^Click Kid's Brushes'$")
public void click_Kid_s_Brushes() throws Throwable {
	
	home.clickKidsBrushes();
	
}

@Then("^Verify Kids text in BrushList$")
public void verify_Kids_text_in_BrushList() throws Throwable {
	if(kidsP.findKidsBushes())
	{
		System.out.println("Found Kids on KidsPage");
	}
}

@When("^Click on search icon$")
public void click_on_search_icon() throws Throwable {
     home.clickSearchIcon();
}
@When("^Enter search text \"([^\"]*)\"$")
public void enter_search_text(String text) throws Throwable {
    home.sendtextSearchBox(text);
}

@Then("^Verify the \"([^\"]*)\"$")
public void verify_the(String arg1) throws Throwable {
    searchP.find3DWhiteBatteryBrush();
}

@When("^Click \"([^\"]*)\" under \"([^\"]*)\" Category in Footer$")
public void click_under_Category_in_Footer(String arg1, String arg2) throws Throwable {
    home.clickFloss();
  
}

@Then("^Verify \"([^\"]*)\" in products page$")
public void verify_in_products_page(String text) throws Throwable {
	if(flossp.findFlossPicks())
    {
    	System.out.println("Found "+text+" in FlossPage");
    }
}

}
