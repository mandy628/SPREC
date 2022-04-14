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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.webui.common.WebUiCommonHelper

WebUI.callTestCase(findTestCase('login_gy/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)
'项目查询'
WebUI.click(new TestObject().addProperty('title', ConditionType.EQUALS, '项目查询'))
WebUI.delay(5)
'输入项目关键字'

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div[1]/form/div[1]/div[2]/div/div/div/input'), GlobalVariable.proname)

WebUI.delay(5)
'查询'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '查询'))
WebUI.delay(5)
'管理项目'
//WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '管理项目'))
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div[2]/div[1]/div[4]/div[2]/table/tbody/tr[1]/td[11]/div/button/span'))
WebUI.delay(5)
'摘牌'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '手动摘牌'))
WebUI.delay(5)
WebUI.click(findTestObject("gongyong/tongguo/button__2"))
WebUI.delay(3)
WebUI.click(findTestObject("gongyong/tongguo/button__2"))
WebUI.delay(10)


WebUI.closeBrowser()

