package hrm.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HrmElements {

	@FindBy(xpath = "//*[@id=\"header-navbar\"]/ul[1]/li[1]/a")
	public WebElement featureButton;
	
	
	
	@FindBy(xpath = "/html/body/div[4]/div/div[1]/h4")
	
	public WebElement text;
	
	
	
}
