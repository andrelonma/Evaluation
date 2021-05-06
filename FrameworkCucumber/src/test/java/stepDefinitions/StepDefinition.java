package stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import baseObjects.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class StepDefinition extends BaseClass{
	
	HomePage home = new HomePage(driver);;
	LoginPage login = new LoginPage(driver);
	
	 @Given("^usuario comprador esta en la pagina de inicio de sesion$")
	    public void usuario_comprador_esta_en_la_pagina_de_inicio_de_sesion() throws Throwable {

	        driver.get("http://automationpractice.com/index.php");
	        home.ClickLogin();
	    }

	    @When("el usuario ingresa su correo electronico {string}")
	    public void el_usuario_ingresa_su_correo_electronico(String strArg1) throws Throwable {
	        login.EnterEmail(strArg1);
	    }

	    @Then("^se inicia la sesion$")
	    public void se_inicia_la_sesion() throws Throwable {
	       home.CheckAccount("Andrea Londoño");
	    }

	    @When("el usuario ingresa su password {string}")
	    public void el_usuario_ingresa_su_password(String strArg1) throws Throwable {
	    	login.EnterPassword(strArg1);
	    	login.ClickLogIn();
	    }

}
