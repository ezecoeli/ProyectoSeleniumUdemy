package pages;
 
public class PaginaIntroduccionTesting extends BasePage {
 
    private String comprarAhoraLink = "//a[@class='sc-epnzzT fnnVGR']";
 
    public PaginaIntroduccionTesting() {
        super(driver);
    }
 
    public void clickcomprarAhoraLink() {
        clickElement(comprarAhoraLink);
    }
 
}
