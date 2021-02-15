package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Form1Page {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that redirects to form page")
            .located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target SELECTED_FIRSNAME= Target.the("clic en el campo filename").located(By.xpath("//input[@id='firstName']"));
    public static final Target FIRST_NAME_INPUT = Target.the("insert first name").located(By.xpath("//input[@id='firstName']"));
}
