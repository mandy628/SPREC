import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.Image

import org.openqa.selenium.Keys

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable


WebUI.openBrowser('')
WebUI.navigateToUrl('http://test.sdcqjy.com/personal/#/log/login')
WebUI.delay(10)

WebUI.click(new TestObject().addProperty("text", ConditionType.EQUALS, "免费注册"))
WebUI.delay(3)

'企业注册'
WebUI.click(new TestObject().addProperty("text", ConditionType.EQUALS, "机构注册"))

//用户名
WebUI.setText(new TestObject().addProperty("placeholder", ConditionType.EQUALS, "请输入登录账号"), GlobalVariable.jigou_yhm)
WebUI.setText(new TestObject().addProperty("placeholder", ConditionType.EQUALS, "请设置你的登录密码"), GlobalVariable.loginpwd)
WebUI.setText(new TestObject().addProperty("placeholder", ConditionType.EQUALS, "请再次输入你的密码"), GlobalVariable.loginpwd)
WebUI.setText(new TestObject().addProperty("placeholder", ConditionType.EQUALS, "请输入手机号码"), GlobalVariable.jigou_phone)

WebUI.delay(5)
'拖动滑动条'
WebUI.dragAndDropByOffset(findTestObject('Object Repository/gongyong/login/div_'), 328, 0)
WebUI.dragAndDropByOffset(findTestObject('gongyong/login/div_'), -10, 0)
WebUI.delay(5)
WebUI.click(new TestObject().addProperty("class", ConditionType.EQUALS, "reg_submit"))
'截图元素'
TestObject  element=new TestObject().addProperty("class", ConditionType.EQUALS, "identify-img fl")
//处理截图图片保存路径
String cleanurl="D:\\cleanimage"
WebUI.delay(10)

//File tupainurl = new File("D:\\code.jpg")

WebUI.rightClick(element)
WebUI.delay(5)
'右击图片另存为快捷键'
WebUI.sendKeys(element, Keys.chord(Keys.SHIFT, 'v'))
WebUI.delay(5)
//重命名图片并保存 快捷键

WebUI.sendKeys(element, Keys.chord(Keys.ENTER))



WebUI.delay(5)
String imgurl = CustomKeywords.'ScreenShotElement.captureImage'()
File tupainurl = new File(imgurl)

CustomKeywords.'CleanElementImage.handlImage'(tupainurl,cleanurl)
WebUI.delay(5)
String yanzmcode=CustomKeywords.'testimage.sbimage'("D:\\cleanimage\\code.jpg")

WebUI.delay(5)
WebUI.setText(new TestObject().addProperty("xpath", ConditionType.EQUALS, '//*[@id="app"]/div/div/div/div[2]/div/div[2]/form/div[2]/div/div/input'), yanzmcode)
