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

WebUI.navigateToUrl('http://test.sdcqjy.com/')

//输入关键字
WebUI.setText(new TestObject().addProperty('id', ConditionType.EQUALS, 'searchInp'), GlobalVariable.proname)

currttab = WebUI.getWindowIndex()

WebUI.delay(3)
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

'股权项目报名'

'我要购买'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '我要报名'))

WebUI.delay(10)

WebUI.switchToWindowIndex(currttab)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '自主报名'))*/
WebUI.callTestCase(findTestCase('public_ty/zidong_bming'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

//planPercent
WebUI.setText(new TestObject().addProperty('id', ConditionType.CONTAINS, 'planPercent'), '10')

'提交报名信息'
WebUI.click(new TestObject().addProperty('value', ConditionType.EQUALS, '提交报名信息'))

'确定'
WebUI.delay(3)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '确定'))

WebUI.closeBrowser()

