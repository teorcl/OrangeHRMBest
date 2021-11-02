package co.com.sofka.stepdefinitions.login;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.page.loginpage.LoginPage;
import co.com.sofka.stepdefinitions.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginOrangeStepDefinitions extends WebUI {
    LoginPage loginPage;
    LoginModel admin;
    private static final String ASSERTION_EXCEPTION_MESSAGE = "No se encuentra el elemento Dashboard";

    //===============================PASOS=================================

    @Given("que el empleado admin se encuentra la pagina de logueo del sitio web OrangeHRM")
    public void queElEmpleadoAdminSeEncuentraLaPaginaDeLogueoDelSitioWebOrangeHRM() {
        try {
            generalSetUp();
            admin = new LoginModel();
            admin.setUser("Admin");
            admin.setPassword("admin123");
        }catch (Exception exception){
            quitDriver();
        }
    }

    @When("el admin ingresa las credenciales correctas y confirma la accion")
    public void elAdminIngresaLasCredencialesCorrectasYConfirmaLaAccion() {
        try {
            loginPage = new LoginPage(driver,admin);
            loginPage.fillFormLogin();
        }catch (Exception exception){
            quitDriver();
        }
    }

    @Then("el admin deberia ver un boton con la palabra Dashboard")
    public void elAdminDeberiaVerUnBotonConLaPalabraDashboard() {
        try {
            Assertions.assertEquals(forSubmittedLogin(),loginPage.isLoginDone(),ASSERTION_EXCEPTION_MESSAGE);
        }catch (Exception exception){
            quitDriver();
        }
        finally {
            quitDriver();
        }
    }

    private String forSubmittedLogin(){
        return "Dashboard";
    }


}
