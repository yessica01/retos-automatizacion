package co.com.bancolombia.certification.utest.runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/registro_de_usuario_utest.feature",
		glue = {"co.com.bancolombia.certification.utest.stepdefinitions"},			
		snippets = SnippetType.CAMELCASE
		)
public class RegistroDeUsuarioEnUtest {

}
