package co.com.sofka.stepdefinitions.deleteuser;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.page.deleteuserpage.DeleteUserPage;
import co.com.sofka.stepdefinitions.setup.WebUI;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DeleteUserStepDefinitions extends WebUI {

    LoginModel admin;
    DeleteUserPage deleteUserPage;

    //===========================PASOS==========================

    @Given("que el admin se encuentra autenticado en el sitio de orangeHRM")
    public void queElAdminSeEncuentraAutenticadoEnElSitioDeOrangeHRM() {
        try {
            generalSetUp();
            admin = new LoginModel();
            admin.setUser("Admin");
            admin.setPassword("admin123");
        }catch (Exception exception){
            quitDriver();
        }
    }

    @When("el admin quiere eliminar a un usuario")
    public void elAdminQuiereEliminarAUnUsuario() {
        try {
            deleteUserPage = new DeleteUserPage(driver, admin);
            deleteUserPage.deleteUser();
        }catch (Exception exception){
            quitDriver();
        }
    }

    @Then("el sistema deberia eliminarlo de la tabla.")
    public void elSistemaDeberiaEliminarloDeLaTabla() {
        try {
            Assertions.assertTrue(deleteUserPage.getBeforeDelete()>deleteUserPage.getAfterDelete());
        }catch (Exception exception){
            quitDriver();
        }
        finally {
            quitDriver();
        }
    }


}
