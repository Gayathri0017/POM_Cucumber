package com.actions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.pages.HomePage;
import com.utils.HelperClass;
public class HomePageActions {
	HomePage hp=null;
	public HomePageActions() {
		this.hp=new HomePage();
		PageFactory.initElements(HelperClass.getDriver(), hp);
	}
	public String getHomeText() {
		return hp.tit.getText();
	}
}
