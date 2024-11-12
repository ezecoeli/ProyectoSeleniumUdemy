package pages;
 
public class PaginaIntroduccionTesting extends BasePage {
 
    private String comprarAhoraLink = "//a[@class='sc-epnzzT myfJh']";
 
    public PaginaIntroduccionTesting() {
        super(driver);
    }
 
    public void clickcomprarAhoraLink() {
        clickElement(comprarAhoraLink);
    }
 
}