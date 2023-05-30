import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\App\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(500);
		driver.close();

	}

}
