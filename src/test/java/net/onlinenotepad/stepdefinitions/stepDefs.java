package net.onlinenotepad.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.Answer;
import task.CreateNote;

import utils.MyWebDriverFactory;


import static ui.NotepadPage.NOTEPAD;

public class stepDefs {

      public static Actor UserWeb;

    @Managed(uniqueSession = true)
    public WebDriver hisBrowser;


    @Before
    public void prepareStage() {

        UserWeb = Actor.named("The user");
        OnStage.setTheStage(new OnlineCast());
    }



    @Given("^el usuario ingresa a la pagina de notepad$")
    public void el_usuario_ingresa_a_la_pagina_de_notepad() {
        UserWeb.can(BrowseTheWeb.with(MyWebDriverFactory.web().onPage()));
    }


    @When("^el usuario crea una nota con letras en negrilla$")
    public void el_usuario_crea_una_nota_con_letras_en_negrilla() {
        UserWeb.attemptsTo(CreateNote.newNote());
    }

    @Then("^el usuario valida (.*)$")
    public void el_usuario_valida_el_texto(String texto) {
        UserWeb.should(GivenWhenThen.seeThat(Answer.message(NOTEPAD), Matchers.equalTo(texto)));
    }


}
