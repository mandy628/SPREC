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

WebUI.delay(3)
'工单'
WebUI.click(findTestObject("Object Repository/gongyong/gongdan/gongdan"))

WebUI.delay(3)
WebUI.click(findTestObject("Object Repository/gongyong/gongdan/gongdan-DB"))

WebUI.delay(3)

WebUI.setText(findTestObject('gongyong/chaxun/input__el-input__inner'),  GlobalVariable.proname)

'点击查询按钮'
WebUI.click(findTestObject('gongyong/chaxun/button__1'))

WebUI.delay(3)

'点击办理按钮-进入摘牌确认'
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)

'确认以上受让方'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '确认以上受让方'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(3)
WebUI.click(findTestObject('gongyong/tongguo/button__2'), FailureHandling.CONTINUE_ON_FAILURE)
WebUI.delay(5)
'摘牌确认结束'

'确认拟定交易方式开始'
WebUI.setText(findTestObject('gongyong/chaxun/input__el-input__inner'),  GlobalVariable.proname)

'点击查询按钮'
WebUI.click(findTestObject('gongyong/chaxun/button__1'))

WebUI.delay(3)
'点击办理按钮-进入确认拟定交易方式'
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)

'确认拟定交易方式-协议'

TestObject jiaoyifangs =new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="pane-projTrialTemp"]/div/div[1]/div/form/div[3]/button/span')


//怎么判断一个对象为空！！！！

WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '确认以上受让方'))
	
WebUI.delay(3)
'协议转让'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '协议转让'))
WebUI.delay(3)
'确定交易方式'
WebUI.click(jiaoyifangs)
WebUI.delay(3)
WebUI.click(findTestObject('gongyong/tongguo/button__2'))

WebUI.closeBrowser()

