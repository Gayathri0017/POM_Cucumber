package com.definitions;
import java.io.FileNotFoundException;
import org.testng.Assert;
import com.actions.HomePageActions;
import com.actions.LoginPageActions;
import com.utils.HelperClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginPageDefinition{
	LoginPageActions lpa=new LoginPageActions();
	HomePageActions hpa=new HomePageActions();
	@Given("the user is on Orange HRM Login page {string}")
	public void loginTest(String string) {
	   HelperClass.openPage(string);
	}
	@When("user enter username and password")
	public void goToHomePage() throws FileNotFoundException{
	    lpa.logIn();
	}
	@Then("the user shold be able to login sucessfully and new page open")
	public void verifyLogin(){
	   Assert.assertTrue(hpa.getHomeText().contains("Dashboard"));
	}
}
