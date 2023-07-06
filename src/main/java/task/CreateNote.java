package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.screenplay.actions.Scroll;
import ui.NotepadPage;

public class CreateNote implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Click.on(NotepadPage.BUTTON));
        actor.attemptsTo(Click.on(NotepadPage.BUTTON_B));
        actor.attemptsTo(Click.on(NotepadPage.NOTEPAD));
        actor.attemptsTo(Enter.theValue("Texto en negrilla").into(NotepadPage.NOTEPAD));
        actor.attemptsTo(Click.on(NotepadPage.BOTON_SAVE));


    }

    public static CreateNote newNote(){
        return new CreateNote();
    }
}
