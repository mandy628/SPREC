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


WebUI.openBrowser('')
WebUI.navigateToUrl('http://test.sdcqjy.com/personal/#/log/login')
//用户名
WebUI.setText(new TestObject().addProperty("id", ConditionType.EQUALS, "userName"), GlobalVariable.loginname_jyy)
WebUI.setText(new TestObject().addProperty("id", ConditionType.EQUALS, "password"), GlobalVariable.loginpwd_jyy)

WebUI.delay(5)
'拖动滑动条'
WebUI.dragAndDropByOffset(findTestObject('Object Repository/gongyong/login/div_'), 328, 0)
WebUI.dragAndDropByOffset(findTestObject('gongyong/login/div_'), -10, 0)
WebUI.click(new TestObject().addProperty("text", ConditionType.EQUALS, "登录"))