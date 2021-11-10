package co.com.sofka.page.recruitment.vacancypage;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.model.vacancymodel.VacancyModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VacancyPage extends CommonActionsOnPages {

    private LoginModel loginModel;
    private VacancyModel vacancyModel;

    private final By userName = By.id("txtUsername");
    private final By password = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");
    private final By menuRecruitment = By.id("menu_recruitment_viewRecruitmentModule");
    private final By menuVacancies = By.id("menu_recruitment_viewJobVacancy");
    private final By btnAdd = By.id("btnAdd");
    private final By selectJobTitle = By.xpath("//*[@id=\"addJobVacancy_jobTitle\"]");
    private final By vacancyName = By.id("addJobVacancy_name");
    private final By hiringManager = By.id("addJobVacancy_hiringManager");
    private final By numOfPositions = By.id("addJobVacancy_noOfPositions");
    private final By description = By.id("addJobVacancy_description");
    private final By btnSave = By.id("btnSave");
    private final By listJobTitle = By.xpath("//*[@id=\"addJobVacancy_jobTitle\"]/option");

    //Constructor
    public VacancyPage(WebDriver driver, LoginModel loginModel, VacancyModel vacancyModel) {
        super(driver);
        this.loginModel = loginModel;
        this.vacancyModel = vacancyModel;
    }

    //Obetenr un JobTitle aleatorio
    private int optionJobTitle(){
        return (int)(Math.random()*(getListJobTitle(listJobTitle)-1));
    }

    public void llenarCamposDeLogin(){
        clear(userName);
        type(userName,loginModel.getUser());

        clear(password);
        type(password,loginModel.getPassword());

        doSubmit(btnLogin);
    }

    public void newVacancy(){

        clickOn(menuRecruitment);
        clickOn(menuVacancies);

        clickOn(btnAdd);

        //clear(selectJobTitle);
        clickOn(selectJobTitle);
        Select titleJob = new Select(driver.findElement(selectJobTitle));
        titleJob.selectByIndex(optionJobTitle());


        clear(vacancyName);
        type(vacancyName, vacancyModel.getVacancyName());

        clear(hiringManager);
        type1(hiringManager, vacancyModel.getHiringManager());

        clear(numOfPositions);
        type(numOfPositions, vacancyModel.getNumberPositions());

        clear(description);
        type(description, vacancyModel.getDescription());

        clickOn(btnSave);

    }

}
