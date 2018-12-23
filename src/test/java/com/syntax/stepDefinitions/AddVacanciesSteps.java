package com.syntax.stepDefinitions;

import org.openqa.selenium.interactions.Actions;

import com.syntax.pages.AddVacanciesPage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddVacanciesSteps extends BaseClass {
	AddVacanciesPage obj1;
	@When("^I click Recruitment Module and click Vacancies$")
	public void i_click_Recruitment_Module_and_click_Vacancies() {
		 obj1 = new AddVacanciesPage();

		CommonMethods.actions(obj1.recruitment);

		CommonMethods.actions(obj1.vacancies);
	}

	@When("^Click Add$")
	public void click_Add() {
		obj1.add.click();

	}

	@When("^Select Job Title to any job Title$")
	public void select_Job_Title_to_any_job_Title() {

		
		
		
	}

	@When("^Enter Vacancy Name$")
	public void enter_Vacancy_Name() {

	}

	@When("^Enter Hiring Manager to John Smith$")
	public void enter_Hiring_Manager_to_John_Smith() {

	}

	@When("^Enter Number Of Positions one$")
	public void enter_Number_Of_Positions_one() {
	}

	@When("^Enter Description$")
	public void enter_Description() {

	}

	@When("^I Click Save$")
	public void i_Click_Save() {

	}

	@Then("^I see vacancy details are displayed$")
	public void i_see_vacancy_details_are_displayed() {

	}
	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM()  {
		LoginPage logIn = new LoginPage();
		CommonMethods.enterValue(logIn.username, BaseClass.prop.getProperty("username"));
		CommonMethods.enterValue(logIn.password, BaseClass.prop.getProperty("password"));
		CommonMethods.click(logIn.btnLogin);
	   
	}


}