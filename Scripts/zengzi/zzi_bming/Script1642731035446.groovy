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


WebUI.callTestCase(findTestCase('public_ty/zidong_bming'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(new TestObject().addProperty('id', ConditionType.CONTAINS, 'planPercent'), '10')

//
WebUI.setText(new TestObject().addProperty('id', ConditionType.CONTAINS, 'limitPrice'), '1000')

'提交报名信息'
WebUI.click(new TestObject().addProperty('value', ConditionType.EQUALS, '提交报名信息'))

'确定'
WebUI.delay(3)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '确定'))

WebUI.delay(3)

WebUI.closeBrowser()

