package base_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pages.CompleteRegistrationPage;
import pages.DashboardPage;
import pages.EMailHomePage;
import pages.EMailLoginPage;
import pages.HomePage;
import pages.RegistrationPage;

public class BaseClass {

	private HomePage ObjHP;
	private RegistrationPage ObjRP;
	private CompleteRegistrationPage ObjCRP;
	private DashboardPage ObjDP;
	
	private EMailHomePage ObjEHP;
	private EMailLoginPage ObjELP;
	
	private WebElement wb;
	private Select sel;
	private WebDriver driver;
	
	private String driverPath = "/home/user/Downloads/Chrome Driver/";
	
	
	@Parameters(value="url")
	@BeforeClass()
	public void setUp(String url)
	{
		System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver");
		setDriver(new ChromeDriver());
		getDriver().get(url);
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public String getPageTitle()
	{
		return getDriver().getTitle();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWb() {
		return wb;
	}

	public void setWb(WebElement wb) {
		this.wb = wb;
	}

	public Select getSel() {
		return sel;
	}

	public void setSel(Select sel) {
		this.sel = sel;
	}

	public HomePage getObjHP() {
		return ObjHP;
	}

	public void setObjHP(HomePage objHP) {
		ObjHP = objHP;
	}

	public RegistrationPage getObjRP() {
		return ObjRP;
	}

	public void setObjRP(RegistrationPage objRP) {
		ObjRP = objRP;
	}

	public CompleteRegistrationPage getObjCRP() {
		return ObjCRP;
	}

	public void setObjCRP(CompleteRegistrationPage objCRP) {
		ObjCRP = objCRP;
	}

	public EMailHomePage getObjEHP() {
		return ObjEHP;
	}

	public void setObjEHP(EMailHomePage objEHP) {
		ObjEHP = objEHP;
	}

	public EMailLoginPage getObjELP() {
		return ObjELP;
	}

	public void setObjELP(EMailLoginPage objELP) {
		ObjELP = objELP;
	}

	public DashboardPage getObjDP() {
		return ObjDP;
	}

	public void setObjDP(DashboardPage objDP) {
		ObjDP = objDP;
	}

	/*@AfterClass
	public void close()
	{
		getDriver().close();
	}*/
}
