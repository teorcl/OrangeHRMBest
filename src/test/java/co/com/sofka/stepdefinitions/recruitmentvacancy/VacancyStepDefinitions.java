package co.com.sofka.stepdefinitions.recruitmentvacancy;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.model.vacancymodel.VacancyModel;
import co.com.sofka.page.deleteuserpage.DeleteUserPage;
import co.com.sofka.page.recruitment.vacancypage.VacancyPage;
import co.com.sofka.stepdefinitions.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VacancyStepDefinitions extends WebUI {

    LoginModel admin;
    VacancyModel miVacante;
    VacancyPage vacancyPage;

    @Given("que el usuario admin se encuentra logueado como admin")
    public void queElUsuarioAdminSeEncuentraLogueadoComoAdmin() {
        try {
            generalSetUp();
            loginConfiguration();
            vacancyConfiguration();
        }catch (Exception exception){
            quitDriver();
        }

    }


    @When("el admin quiere crear una nueva vacante e ingresa los datos necesario")
    public void elAdminQuiereCrearUnaNuevaVacanteEIngresaLosDatosNecesario() {
        try {
            vacancyPage = new VacancyPage(driver, admin, miVacante );
            vacancyPage.llenarCamposDeLogin();
            vacancyPage.newVacancy();
        }catch (Exception exception){
            //quitDriver();
        }
    }

    @Then("el admin deberia ver la nueva vacante")
    public void elAdminDeberiaVerLaNuevaVacante() {

    }

    public void loginConfiguration(){
        admin = new LoginModel();
        admin.setUser("Admin");
        admin.setPassword("admin123");
    }

    public void vacancyConfiguration(){
        miVacante = new VacancyModel();
        miVacante.setVacancyName();
        miVacante.setHiringManager();
        miVacante.setNumberPositions("2");
        miVacante.setDescription("Ayudar a mejorar la company");
    }

}
