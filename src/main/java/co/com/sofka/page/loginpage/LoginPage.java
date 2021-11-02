package co.com.sofka.page.loginpage;

import co.com.sofka.model.loginmodel.LoginModel;
import co.com.sofka.page.common.CommonActionsOnPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends CommonActionsOnPages {

    LoginModel loginModel;

    //=========================LOCALIZADORES========================
    private final By userName = By.id("txtUsername");
    private final By password = By.id("txtPassword");
    private final By btnLogin = By.id("btnLogin");

    //=========================LOCALIZADORES-PARA-LOS-ASSERTIONS========================
    private final By dashboard = By.id("menu_dashboard_index");

    //=======================CONSTRUCTOR========================
    public LoginPage(WebDriver driver, LoginModel loginModel) {
        super(driver);
        this.loginModel = loginModel;
    }

    //=========================Acciones=sobre=los=localizadores========================
    public void fillFormLogin(){
        clear(userName);
        type(userName,loginModel.getUser());

        clear(password);
        type(password,loginModel.getPassword());

        doSubmit(btnLogin);
    }

    //=======VALORES EXPERIMENTALES=====
    public String isLoginDone(){
        String word = getTexto(dashboard);
        return word;
    }

}
