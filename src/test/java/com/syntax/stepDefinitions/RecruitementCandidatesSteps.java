package com.syntax.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.syntax.pages.LoginPage;
import com.syntax.pages.RecruitementCandidatesPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RecruitementCandidatesSteps extends BaseClass {

	RecruitementCandidatesPage obj4;
	Actions hover3;
	LoginPage login1;
	

	@When("^I click Recruitment Module and click Candidates$")
	public void i_click_Recruitment_Module_and_click_Candidates() {
		hover3 = new Actions(driver);
		obj4 = new RecruitementCandidatesPage();
		hover3.moveToElement(obj4.recruitments).click().perform();
		hover3.moveToElement(obj4.viewCandidates).click().perform();

	}

	@When("^Click Add$")
	public void click_Add() {
		obj4.add.click();
	}

	@When("^Enter First, Middle, Last Name$")
	public void enter_First_Middle_Last_Name() {
		obj4.firstName.sendKeys("Oscar");
		obj4.middleName.sendKeys("Tango");
		obj4.lastName.sendKeys("Whiskey");
	}

	@When("^Enter Email and Contact No$")
	public void enter_Email_and_Contact_No() {
		obj4.email.sendKeys("otw@syntaxtech.com");
		obj4.contactNumber.sendKeys("555-555-0000");
	}

	@Then("^I see Job Vacancy is displayed$")
	public void i_see_Job_Vacancy_is_displayed() {
		boolean expected = obj4.jobVacancy.isDisplayed();
		boolean actual = true;
		Assert.assertEquals(expected, actual);

	}

	@Then("^I enter any Keywords and any Comments$")
	public void i_enter_any_Keywords_and_any_Comments() {
		obj4.keywords.sendKeys("Employee");
		obj4.comments.sendKeys("New Hire");
	}

	@Then("^I select a Date Of Application$")
	public void i_select_a_Date_Of_Application() throws InterruptedException {
		obj4.appliedDate1.click();
		obj4.appliedDate.click();
	}

	@Then("^I click Save$")
	public void i_click_Save() {
		obj4.savebutton.click();
	}

	@Then("^I see Candidate appears in Candidates History$")
	public void i_see_Candidate_appears_in_Candidates_History() {

		boolean expected = obj4.candidateHistory.isDisplayed();
		boolean actual = true;
		Assert.assertEquals(expected, actual);
	}

	@Given("^I login into OrangeHRM$")
	public void i_login_into_OrangeHRM() {

		login1 = new LoginPage();
		CommonMethods.enterValue(login1.username, "Admin");
		CommonMethods.enterValue(login1.password, "admin123");
		CommonMethods.click(login1.btnLogin);
	}

	@When("^I Select All from Job Title$")
	public void i_Select_All_from_Job_Title() {
		
		CommonMethods.select(obj4.jobTitle, "All");
	}

	@When("^I Select All from Vacancy$")
	public void i_Select_All_from_Vacancy() {
		
		CommonMethods.select(obj4.jobVacancy1, "All");
	}

	@When("^I Select All from the Hiring Manager$")
	public void i_Select_All_from_the_Hiring_Manager() {
		
		CommonMethods.select(obj4.hiringManager, "All");
	}

	@When("^I Select All from Status$")
	public void i_Select_All_from_Status() {
		CommonMethods.select(obj4.status, "All");
	}

	@When("^I Enter Candidates Name from the previous entry$")
	public void i_Enter_Candidates_Name_from_the_previous_entry() {
		obj4.candidateName.sendKeys("Oscar Tango Whiskey");
	}

	@When("^Select Date of Application from the previous entry$")
	public void select_Date_of_Application_from_the_previous_entry() {
		obj4.candidateSearchDate.click();
		obj4.appliedDate2.click();
	}

	@When("^Select Methods of Application to Manual$")
	public void select_Methods_of_Application_to_Manual() {

		CommonMethods.select(obj4.modeOfApplication, "Manual");
		
	}

	@When("^Click Search$")
	public void click_Search() {
		obj4.searchButton.click();
	}

	@Then("^I see Candidate is present$")
	public void i_see_Candidate_is_present() {
		Assert.assertTrue(obj4.verifyCandidate.isDisplayed());
	}
}