package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class RecruitementCandidatesPage extends BaseClass {

	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement passWord;
	
	@FindBy(id="menu_recruitment_viewRecruitmentModule")
	public WebElement recruitments;
	
	@FindBy(id="menu_recruitment_viewCandidates")
	public WebElement viewCandidates;
	
	@FindBy(id="btnAdd")
	public WebElement add;
	
	@FindBy(id="addCandidate_firstName")
	public WebElement firstName;
	
	@FindBy(id="addCandidate_middleName")
	public WebElement middleName;
	
	@FindBy(id="addCandidate_lastName")
	public WebElement lastName;
	
	@FindBy(id="addCandidate_email")
	public WebElement email;
	
	@FindBy(id="addCandidate_contactNo")
	public WebElement contactNumber;
	
	@FindBy(id="addCandidate_vacancy")
	public WebElement jobVacancy;
	
	@FindBy(id="addCandidate_keyWords")
	public WebElement keywords;
	
	@FindBy(id="addCandidate_comment")
	public WebElement comments;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]")
	public WebElement appliedDate;
	
	@FindBy(id="addCandidate_appliedDate")
	public WebElement appliedDate1;
	
	@FindBy(id="btnSave")
	public WebElement savebutton;
	
	@FindBy(xpath="//div[@id='tableWrapper']/table/tbody/tr/td[2]")
	public WebElement candidateHistory;
	
	//elements for second scenario
	
	
	
	@FindBy(name="candidateSearch[jobTitle]")
	public WebElement jobTitle;
	
	@FindBy(name="candidateSearch[jobVacancy]")
	public WebElement jobVacancy1;
	
	@FindBy(name="candidateSearch[hiringManager]")
	public WebElement hiringManager;
	
	@FindBy(name="candidateSearch[status]")
	public WebElement status;
	
	@FindBy(xpath="//input[@id='candidateSearch_candidateName']")
	public WebElement candidateName;
	
	@FindBy(id="candidateSearch_fromDate")
	public WebElement candidateSearchDate;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr[4]/td[5]")
	public WebElement appliedDate2;

	@FindBy(name="candidateSearch[modeOfApplication]")
	public WebElement modeOfApplication;
	
	@FindBy(id="btnSrch")
	public WebElement searchButton;
	
	@FindBy(xpath="//*[@id='resultTable']/tbody/tr[1]/td[3]")
	public WebElement verifyCandidate;
	

	public RecruitementCandidatesPage() {
		PageFactory.initElements(driver, this);
	}

}
