package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NotepadPage  extends PageObject {

    public static final Target BUTTON = Target.the("button")
            .located(By.id("richtextnote-tab"));

    public static final Target BUTTON_B = Target.the("button")
            .located(By.id("//*[@id='richtextnote']/main/div/div/div[1]/div/div[1]/button[1]"));

    public static final Target NOTEPAD = Target.the("hoja del notepad")
            .located(By.id("editor"));

    public static final Target BOTON_SAVE = Target.the("hoja del notepad")
            .located(By.xpath("//button[@class='btn save-file-btn saveNotesBtn plaintextnoteBtn']"));
}
