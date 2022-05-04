package uistore;

import org.openqa.selenium.By;

public class HomeUI 
{
	public static By moreProducts=By.id("main-more-products");
	public static By kidBrushes=By.xpath("(//span[@class='submenu-prodname-text'])[6]");
	public static By searchIcon=By.xpath("//a[@data-search='quickSearch']");
	public static By serachBox=By.id("search_query");
	public static By flossFooter=By.xpath("//footer//a[@href='/en-us/products/compare/floss']");
}