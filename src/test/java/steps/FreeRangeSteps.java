
package steps;
 
import java.util.Arrays;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaCursos;
import pages.PaginaIntroduccionTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;
 
public class FreeRangeSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaIntroduccionTesting introduccionPage = new PaginaIntroduccionTesting();
    PaginaRegistro registro = new PaginaRegistro();
 
    @Given("I navigate to www.freerangetesters.com")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
 
    @When("I go to {word} using the navigation bar")
    public void navigationBarUse(String section) {
        landingPage.clickOnSectionNavigationBar(section);
    }

    @When("I select Elegir Plan")
    public void selectElegirPlan() {
        landingPage.clickOnElegirPlanButton();
    }

    @And("select Comprar ahora")
    public void navigateToIntro() {
        cursosPage.clickIntroduccionTestingLink();
        introduccionPage.clickcomprarAhoraLink();
    }

    @Then("I can validate the options in the checkout page")
    public void validateCheckoutPlans() {
        List<String> lista = registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("El Dojo - Prácticas intensivas de Testing y Automation: $30 / mes • 9 productos",
                "El Dojo - Prácticas intensivas de Testing y Automation: $240 / año • 9 productos",  
                "Academia: $16.99 / mes • 13 productos",
                "Academia: $176 / año • 13 productos", 
                "Free: Gratis • 3 productos");
 
        Assert.assertEquals(listaEsperada, lista);
    }

}