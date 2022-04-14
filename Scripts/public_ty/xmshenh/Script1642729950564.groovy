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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testobject.ConditionType as ConditionType

'登录'
WebUI.callTestCase(findTestCase('login_gy/login'), [:], FailureHandling.STOP_ON_FAILURE)

/*查看更多*/
WebUI.click(findTestObject('gongyong/chaxun/a_'))

WebUI.delay(3)


WebUI.setText(findTestObject('gongyong/chaxun/input__el-input__inner'),  GlobalVariable.proname)

'点击查询按钮'
WebUI.click(findTestObject('gongyong/chaxun/button__1'))

WebUI.delay(3)

'点击办理按钮-预审节点开始'
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)
'预审审核通过按钮'
WebUI.click(findTestObject('gongyong/tongguo/span__2'))

WebUI.delay(3)
'确认通过预审节点结束'
WebUI.click(findTestObject('gongyong/tongguo/button__2'))
WebUI.delay(3)

'查询项目初审项目'
WebUI.setText(findTestObject('gongyong/chaxun/input__el-input__inner'), GlobalVariable.proname)

/*点击查询按钮*/
WebUI.click(findTestObject('gongyong/chaxun/button__1'))

WebUI.delay(3)

/*点击办理按钮-初审审节点开始*/
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)

/*设置挂牌开始时间*/
WebUI.setText(findTestObject('zc-guapaichushen/Page_/chushen/input__el-input__inner (1)'), GlobalVariable.gpdate)

WebUI.delay(3)


'点击收费信息标题'
WebUI.click(new TestObject().addProperty("text", ConditionType.EQUALS, "收费信息"))

WebUI.delay(5)
//el-textarea__inner
WebUI.setText(new TestObject().addProperty("class", ConditionType.EQUALS, "el-textarea__inner"), '初审通过')

'挂牌初审审核通过'
WebUI.click(findTestObject('gongyong/tongguo/span__2'))


WebUI.click(findTestObject('gongyong/tongguo/button__2'))

WebUI.delay(3)

/*点击办理按钮-终审审节点开始*/
WebUI.click(findTestObject('gongyong/chaxun/span__1'))

WebUI.delay(3)

'终审审核通过'
WebUI.click(findTestObject('gongyong/tongguo/span__2'))

WebUI.click(findTestObject('gongyong/tongguo/button__2'))

WebUI.closeBrowser()

