import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

/*
WebUI.callTestCase(findTestCase('login_gy/perlogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

//String firefoxProfileDir = "C:\\Users\\lenovo-1811\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\r5upn2yn.default";

//FirefoxProfile profile = new FirefoxProfile(new File(firefoxProfileDir));

//WebDriver driver = new FirefoxDriver(profile);

WebUI.navigateToUrl('http://test.sdcqjy.com/')

//输入关键字
WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'searchInp'), GlobalVariable.proname)

currttab = WebUI.getWindowIndex()

//点击搜索
sousuo = new TestObject().addProperty('class', ConditionType.EQUALS, 'search_btn')

WebUI.sendKeys(sousuo, Keys.chord(Keys.ENTER))

WebUI.delay(3)

'定位到当前标签页'
WebUI.switchToWindowIndex(currttab)

WebUI.delay(3)

'点击项目名称链接'
WebUI.click(new TestObject().addProperty('title', ConditionType.EQUALS, GlobalVariable.proname))

WebUI.delay(3)

'定位到当前标签页'
WebUI.switchToWindowIndex(currttab)

'资产项目报名'

'我要购买'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '我要购买'))



WebUI.switchToWindowIndex(currttab)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '自主报名'))*/
WebUI.callTestCase(findTestCase('public_ty/zidong_bming'), [:], FailureHandling.STOP_ON_FAILURE)

/*gundong = new TestObject().addProperty('text', ConditionType.EQUALS, '资产受让须知与承诺')

WebUI.delay(10)

WebUI.mouseOver(gundong,FailureHandling.CONTINUE_ON_FAILURE)

db = new TestObject().addProperty('text', ConditionType.EQUALS, '山东产权交易中心')

//滚动条拉到也没底部
WebUI.scrollToElement(db, 5,FailureHandling.CONTINUE_ON_FAILURE)

//勾选已阅读
WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'agreeInp'),FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

'同意按钮'
WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'stepBtn'),FailureHandling.CONTINUE_ON_FAILURE)*/

WebUI.delay(3)

'提交报名信息'
WebUI.click(new TestObject().addProperty('value', ConditionType.EQUALS, '提交报名信息'))

'确定'
WebUI.delay(3)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '确定'))

WebUI.closeBrowser()

