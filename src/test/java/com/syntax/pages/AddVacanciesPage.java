package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddVacanciesPage extends BaseClass {
	
	@FindBy(xpath="//*[@id='menu_recruitment_viewRecruitmentModule']/b")
	public WebElement recruitment;

	@FindBy(id="menu_recruitment_viewJobVacancy")
	public WebElement vacancies;
	
	@FindBy(id="btnAdd")
	public WebElement add;
	
	@FindBy(id="addJobVacancy_jobTitle")
	public WebElement addJobVacancy;
	
	@FindBy(id="addJobVacancy_name")
	public WebElement addJobVacancyName;
	
	@FindBy(id="addJobVacancy_hiringManager")
	public WebElement hiringManager;
	
	@FindBy(id="addJobVacancy_noOfPositions")
	public WebElement NumberOfPositions;
	
	@FindBy(id="addJobVacancy_description")
	public WebElement description;
	
	@FindBy(id="btnSave")
	public WebElement save;
	
	public AddVacanciesPage() {
		PageFactory.initElements(driver, this);
	}
	
}
