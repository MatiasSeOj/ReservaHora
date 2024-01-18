package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.petSmile.AgendaTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/* Procurar dejar activo el Servidor Tomcat */

public class Steps {
	WebDriver driver;
	@Given("abrir navegador")
	public void abrir_navegador() {
		System.out.println("abriendo el navegador");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Matito\\Downloads\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8081/ReservaHora");
	}
	
	@When("ingresar nombre de usuario {string} y contrasenha {string}")
	public void ingresar_Usuario_y_Contrasenha(String string, String string2) {
		System.out.println("ingresando las credenciales de usuario");
		driver.findElement(By.name("username")).sendKeys(string);
		driver.findElement(By.name("password")).sendKeys(string2);
	}
	
	@Then("iniciar sesion")
	public void iniciar_sesion() {
		System.out.println("iniciando sesion");
		driver.findElement(By.name("Iniciar")).click();
	}
	
	@Then("ejecutar test")
	public void ejecutar_test() {
		System.out.println("Ejecuta AgendaTest ingresando atributos en la Base de Datos");
		AgendaTest as = new AgendaTest();
		as.f();
	}
}
