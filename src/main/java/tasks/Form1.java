package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.Form1Page;

public class Form1 implements Task {
    //private String first_name ;

  //  public Form1(String first_name) {
    //    this.first_name = first_name;
    //}

    public static Form1 fill() {
        return Tasks.instrumented(Form1.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Form1Page.JOIN_TODAY_BUTTON)
        );

    }


}
