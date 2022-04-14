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

//登录系统
WebUI.callTestCase(findTestCase('login_gy/perlogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'资金管理'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[1]/div[2]/div[1]/div/ul/div/li[3]/div/span'))
WebUI.delay(3)

'保证金管理'
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[1]/div[2]/div[1]/div/ul/div/li[3]/ul/a[1]/li/span'))
WebUI.delay(5)
//输入关键字  
WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, '请输入项目名称'),GlobalVariable.proname )
WebUI.delay(5)


//点击查询
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '查询'))

WebUI.delay(5)

'支付'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '支付'))

'提交订单'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '提交'))
 
'确认'
WebUI.delay(5)

WebUI.click(findTestObject('gongyong/tongguo/button__2_queren'))

WebUI.closeBrowser()

