package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static  final Target LOGGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static  final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.id("username"));
    public static  final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static  final Target ENTER_BUTTON = Target.the("button to comfirm login")
            .located(By.xpath("//button[contains(@class, 'btn btn-primary')]"));
}
