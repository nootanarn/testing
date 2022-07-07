package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_class {
	public Base_class(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
