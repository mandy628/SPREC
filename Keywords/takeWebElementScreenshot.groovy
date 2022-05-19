
import java.awt.image.BufferedImage

import javax.imageio.ImageIO

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.driver.DriverFactory


public class ScreenShotElement {

	@Keyword
	//	public void takeWebElementScreenshot(TestObject object) {
	//		WebElement element = WebUiCommonHelper.findWebElement(object, 20)
	//		WebDriver driver = DriverFactory.getWebDriver();
	//		Screenshot screenshot = new AShot().takeScreenshot(driver,element);
	//		ImageIO.write(screenshot.getImage(),"jpg",new File(System.getProperty("user.dir")+"/Screenshot/Screenshot01.png"))
	//	}

	public static String  captureImage(){

		//		WebElement imageelement = DriverFactory.getWebDriver().findElement(By.xpath("//img[@class='identify-img fl']"))
//		WebElement imageelement = DriverFactory.getWebDriver().findElement(By.className("identify-img fl"))
//		String imgSrc = imageelement.getAttribute("src")
//
//		URL imageURL = new URL(imgSrc)
		File file = new File("C:\\Users\\lenovo-1811\\Downloads\\index.png")
		BufferedImage saveImage = ImageIO.read(file)

		ImageIO.write(saveImage, "jpg", new File("D:\\katalon_images\\code.jpg"))
		String codeurl ='D:\\katalon_images\\code.jpg'
		return codeurl
	}
}