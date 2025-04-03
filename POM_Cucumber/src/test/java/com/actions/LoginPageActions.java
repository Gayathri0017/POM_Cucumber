package com.actions;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import org.openqa.selenium.support.PageFactory;
import com.pages.LoginPage;
import com.utils.HelperClass;
public class LoginPageActions {
	LoginPage lp=null;
	String un,pw;
public LoginPageActions() {
	this.lp=new LoginPage();
	PageFactory.initElements(HelperClass.getDriver(),lp);
}
	public void setUserName(String un) {
		lp.username.sendKeys(un);
	}
	public void setPassword(String pw){
		lp.password.sendKeys(pw);
	}
	public void clickLogin() {
		lp.login.click();
	}
	public void logIn() throws FileNotFoundException {
		File file=new File("C:\\Users\\gayat\\eclipse-workspace\\POM_Cucumber\\src\\test\\resources\\Features\\testdata.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		try {
			prop.load(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		un=prop.getProperty("username");
		pw=prop.getProperty("password");
		this.setPassword(pw);
		this.setUserName(un);
		this.clickLogin();
	}
}
