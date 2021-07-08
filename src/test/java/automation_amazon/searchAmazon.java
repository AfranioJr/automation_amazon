package automation_amazon;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchAmazon {
    
    @Test
    public void buscaProduto(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/");

        driver.findElementById("twotabsearchtextbox").sendKeys("echo dot 3 geracao");
        driver.findElement(By.id("nav-search-submit-button")).click();
        String NomeProduto = driver.findElement(By.xpath("//span[contains(text(),'Echo Dot (3ª Geração): Smart Speaker com Alexa - C')]")).getText();
        System.out.println(NomeProduto);
        assertEquals("Echo Dot (3ª Geração): Smart Speaker com Alexa - Cor Preta", NomeProduto);

        driver.findElement(By.xpath("//span[contains(text(),'Echo Dot (3ª Geração): Smart Speaker com Alexa - C')]")).click();
        driver.findElement(By.xpath("//*[@id='a-autoid-11']/span/input")).click();
    }
    
}
