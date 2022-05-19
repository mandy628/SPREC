
import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.firefox.FirefoxOptions
import org.openqa.selenium.firefox.FirefoxProfile
import org.openqa.selenium.firefox.internal.ProfilesIni
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.driver.WebUIDriverType
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUIDriverType executedBrowser = DriverFactory.getExecutedBrowser()
switch(executedBrowser) {
	case WebUIDriverType.FIREFOX_DRIVER:

ProfilesIni profile = new ProfilesIni();

FirefoxProfile FF = profile.getProfile("for_katalon");

FirefoxOptions optionsFF = new FirefoxOptions().setProfile(FF);
optionsFF.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
//System.setProperty("webdriver.gecko.driver", "D:\\Katalon_Studio_Windows_64-6.1.2\\configuration\\resources\\drivers\\firefox_win64\\geckodriver.exe")
WebDriver driverFF = new FirefoxDriver(optionsFF);

DriverFactory.changeWebDriver(driverFF)
break
}
WebUI.navigateToUrl('http://test.sdcqjy.com/')
WebUI.waitForPageLoad(60)