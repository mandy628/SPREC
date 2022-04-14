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
WebUI.callTestCase(findTestCase('login_gy/perlogin_jiaoyy'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

'受让方录入'

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[1]/div[2]/div[1]/div/ul/div/a[3]/li/span'))
WebUI.delay(5)

//输入关键字  GlobalVariable.proname
WebUI.setText(new TestObject().addProperty('class', ConditionType.EQUALS, 'el-input__inner'), '子标0315-02')
WebUI.delay(5)


//点击查询
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '查询'))

WebUI.delay(5)

'添加受让方'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '添加受让方'))
WebUI.delay(5)
'查询受让方'
WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, '请输入企业名称'),GlobalVariable.perusername )
WebUI.delay(10)
//点击查询
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div/div[3]/div/div[2]/div/form/div[2]/div/button/span'))
WebUI.delay(5)
//选择
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '选择'))
WebUI.delay(10)
'输入图片验证码'
yzm=WebUI.getText(new TestObject().addProperty('class', ConditionType.EQUALS, 'identify-img fl'))
println  "yzm: $yzm"
WebUI.delay(5)
WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, '请输入图片验证码'),yzm)

WebUI.
'发送验证码'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '发送验证码'))
'输入手机验证码'
WebUI.setText(new TestObject().addProperty('placeholder', ConditionType.EQUALS, '请输入验证码'),GlobalVariable.syyanzhengma )
//提交验证
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '提交验证'))
WebUI.delay(5)
//提交报名信息
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '提交'))

WebUI.delay(5)

WebUI.closeBrowser()

