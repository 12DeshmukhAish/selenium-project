import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	private WebDriver driver;

	@Before
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.example.com");
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@org.junit.Test
	public void testPageTitle() {
		String expectedTitle = "Example Domain";
		String actualTitle = driver.getTitle();
		org.junit.Assert.assertEquals(expectedTitle, actualTitle);
	}
}