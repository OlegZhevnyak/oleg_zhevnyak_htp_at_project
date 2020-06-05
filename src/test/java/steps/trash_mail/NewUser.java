package steps.trash_mail;

import pages.trash_mail.MainPage;

public class NewUser {

    public static void newUserTabClick() {
        MainPage.webElementNewUserTab().click();
    }

    public static void usernameType(String username) {
        MainPage.webElementUsernameTextField().sendKeys(username);
    }

    public static void passwordType(String password) {
        MainPage.webElementPasswordTextField().sendKeys(password);
    }

    public static void confirmPasswordType(String confirmPassword) {
        MainPage.webElementPasswordConfirmTextField().sendKeys(confirmPassword);
    }

    public static void realEmailType(String realEmail) {
        MainPage.webElementRealEmailTextField().sendKeys(realEmail);
    }

    public static void registerButtonClick() {
        MainPage.webElementRegisterButton().click();
    }

    public void printResult(){
        String resultAlertString = MainPage.ResultAlert().getText();
        System.out.println(resultAlertString);
    }

}
