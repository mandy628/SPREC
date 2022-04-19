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
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.annotation.Keyword as Keyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('login_gy/login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'工单'
WebUI.click(findTestObject('Object Repository/gongyong/gongdan/gongdan'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/gongyong/gongdan/gongdan-DB'))

WebUI.delay(3)

WebUI.setText(findTestObject('gongyong/chaxun/input__el-input__inner'), GlobalVariable.proname)

'点击查询按钮'
WebUI.click(findTestObject('gongyong/chaxun/button__1'))

WebUI.delay(3)

'点击办理按钮-进入挂牌通知书初审'
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)

'纸质版上传'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '纸质扫描件'))

CustomKeywords.'upfile.pickFile'(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="pane-listed"]/div/div/div/div/div/div/div[2]'), 'D:\\测试数据\\挂牌结果通知书-转让方-SWZC22019202.pdf')
WebUI.delay(5)
'意向资格确认'
WebUI.click(new TestObject().addProperty('id', ConditionType.EQUALS, 'tab-intention'))
WebUI.delay(5)
'上传意向资格确认文件'
CustomKeywords.'upfile.pickFile'(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="pane-intention"]/div/div/div/div/div/div/div[2]'), 'D:\\测试数据\\意向资格确认通知书-受让方-SDZR220019.pdf')
 
WebUI.delay(30)

'纸质版通知书-初审审核通过'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '审核通过'))

WebUI.delay(3)

WebUI.click(findTestObject('gongyong/tongguo/button__2'))

WebUI.delay(5)

'点击办理按钮-进入挂牌通知书终审'
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

//电子版通知书-终审审审核通过
WebUI.delay(3)

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '审核通过'))

WebUI.delay(3)

WebUI.click(findTestObject('gongyong/tongguo/button__2'))

WebUI.delay(5)

WebUI.closeBrowser()

