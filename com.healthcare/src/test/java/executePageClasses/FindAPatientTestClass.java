package executePageClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageClasses.FindAPatientClass;
import pageClasses.HomePageClass;
import pageClasses.LoginPageClass;
import pageClasses.RegisterAPatient;
import utilities.GeneralUtilities;

public class FindAPatientTestClass extends BaseClass {

	

	LoginPageClass lp;
	HomePageClass hp;
	RegisterAPatient rp;
	FindAPatientClass fp;
	
	

	@Test(dataProviderClass = DataProvider1.class, dataProvider = "login")

	
