import java.awt.Color
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import javax.swing.filechooser.FileSystemView
import org.openqa.selenium.WebElement
import com.kms.katalon.core.annotation.Keyword
import net.sourceforge.tess4j.ITesseract
import net.sourceforge.tess4j.Tesseract
import net.sourceforge.tess4j.TesseractException


public  class ocrResult {

	// 元素截图
	//@Keyword
	// 元素截图

//	public static String[] elementscreenShot(WebElement element )throws Exception {
//		WrapsDriver wrapsDriver = (WrapsDriver) element;
//		long time = System.currentTimeMillis();
//
//		// 截图整个页面
//		File screen = ((TakesScreenshot) wrapsDriver.getWrappedDriver()).getScreenshotAs(OutputType.FILE);
//		BufferedImage img = ImageIO.read(screen);
//		// 获得元素的高度和宽度
//		int width = element.getSize().getWidth();
//		int height = element.getSize().getHeight();
//		// 创建一个矩形使用上面的高度，和宽度
//		Rectangle rect = new Rectangle(width, height);
//		// 得到元素的坐标
//		Point p = element.getLocation();
//		BufferedImage dest = img.getSubimage(p.getX(), p.getY(),(int) rect.getWidth(), (int) rect.getHeight());
//		// 存为png格式
//		ImageIO.write(dest, "png", screen);
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmss");
//		FileSystemView fsv = FileSystemView.getFileSystemView();
//		File com = fsv.getHomeDirectory(); // 这便是读取桌面路径的方法了
//		String url = com.getPath() + "/test";
//		File location = new File(url);
//		if (!location.exists()) {
//			location.mkdirs();
//		}
//		String imgPathurl = location.getAbsolutePath() + File.separator + 'pic_'+ time + '.jpg';
//		String cleanPath = location.getAbsolutePath();
//		//存了原图片和清楚后图片的地址
//
//		String[] imgpath = { imgPathurl, cleanPath };
//		File targetFile = new File(imgPathurl);
//		try {
//			FileUtils.copyFile(screen, targetFile);
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		//元素图片路径
//		return imgpath;
//	}


}