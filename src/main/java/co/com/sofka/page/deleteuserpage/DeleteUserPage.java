package co.com.sofka.page.deleteuserpage;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteUserPage extends CommonActionsOnPages {
    private int beforeDelete;
    private int afterDelete;
        LoginModel loginModel;

    //=========================LOCALIZADORES========================
    private final By userName = By.id("txtUsername");
    private final By password = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");
    private final By menuAdmin = By.id("menu_admin_viewAdminModule");
    private final By userManagement = By.id("menu_admin_UserManagement");
    private final By userNameOnTable1 = By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[2]/a");
    private final By userNameOnTable2 = By.xpath("//*[@id=\"resultTable\"]/thead/tr/th[2]/a");
    private final By chkToDelete = By.xpath("//body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr[1]/td[1]/input[1]");
    private final By btnDelete = By.id("btnDelete");
    private final By btnConfirmationDelete = By.id("dialogDeleteBtn");


    //=========================LOCALIZADORES-PARA-LOS-ASSERTIONS========================
    private final By tableResult = By.xpath("//*[@id=\"resultTable\"]/tbody/tr");
    //*[@id="resultTable"]/tbody/tr


    //============================METODOS==================================
    public DeleteUserPage(WebDriver driver, LoginModel loginModel) {
        super(driver);
        this.loginModel = loginModel;
    }

    public void deleteUser(){
        clear(userName);
        type(userName,loginModel.getUser());

        clear(password);
        type(password,loginModel.getPassword());

        doSubmit(btnLogin);

        clickOn(menuAdmin);
        clickOn(userManagement);

        beforeDelete = getRows(tableResult);
        System.out.println("============USUARIOS ANTES DE ELIMINAR============"+beforeDelete);

        clickOn(userNameOnTable1);
        clickOn(userNameOnTable2);
        clickOn(chkToDelete);
        clickOn(btnDelete);
        clickOn(btnConfirmationDelete);

        afterDelete = getRows(tableResult);
        System.out.println("===========USUARIOS DESPUES DE ELIMINAR=========="+afterDelete);


    }

    public int getBeforeDelete() {
        return beforeDelete;
    }

    public int getAfterDelete() {
        return afterDelete;
    }

}
