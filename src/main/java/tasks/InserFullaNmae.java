package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.Form1Page;

public class InserFullaNmae implements Task {
    private String firsName;

    public InserFullaNmae(String firsName) {
        this.firsName = firsName;
    }




    public static InserFullaNmae the(String firsName) {
        return Tasks.instrumented(InserFullaNmae.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Form1Page.SELECTED_FIRSNAME),
                Enter.theValue(firsName).into(Form1Page.FIRST_NAME_INPUT)
                );

    }
}
