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

'登录个人门户'
WebUI.callTestCase(findTestCase('login_gy/perlogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

'登录后台管理端'
WebUI.delay(3)
WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(3)

WebUI.setText(findTestObject('gongyong/login/input__username'), GlobalVariable.loginanme)

WebUI.setText(findTestObject('gongyong/login/input__password'), GlobalVariable.loginpwdgl)

WebUI.delay(3)

'拖动滑动条'
WebUI.dragAndDropByOffset(findTestObject('gongyong/login/div_'), 328, 0)
WebUI.dragAndDropByOffset(findTestObject('gongyong/login/div_'), -10, 0)
WebUI.delay(3)

/*登录*/
WebUI.click(findTestObject('gongyong/login/button_'))


'项目查询'
WebUI.click(new TestObject().addProperty('title', ConditionType.EQUALS, '项目查询'))
WebUI.delay(5)
'输入项目关键字'

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div[1]/form/div[1]/div[2]/div/div/div/input'), GlobalVariable.proname)


'项目状态'
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div[1]/form/div[2]/div[2]/div/div/div/div/input'))
WebUI.delay(3)
'挂牌中'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '挂牌中'))
 
WebUI.delay(5)
'查询'
WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '查询'))
WebUI.delay(5)
'管理项目'
WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="app"]/div/div[2]/section/div/div[2]/div[1]/div[4]/div[2]/table/tbody/tr[1]/td[11]/div/button/span'))
WebUI.delay(5)

//*[@id="pane-manageBaseInfoDzc"]/div/div[1]/div[2]/p/a
//String  tzurl= WebUI.getAttribute(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//*[@id="pane-manageBaseInfoZz"]/div/div[1]/div[2]/p/a'), 'href')

String  tzurl= WebUI.getAttribute(new TestObject().addProperty('href', ConditionType.CONTAINS, '/proj/tc/'), 'href')
 

tzurl_fg= tzurl.split('/')
jqxmid = tzurl_fg[tzurl_fg.size()-1]

println "jqxmid: $jqxmid"

WebUI.navigateToUrl(tzurl)


'我要购买'

WebUI.verifyElementClickable(new TestObject().addProperty('text', ConditionType.CONTAINS, '我要'))

String baoming_url= 'http://test.sdcqjy.com/intentiongz/'+jqxmid

WebUI.navigateToUrl(baoming_url)

WebUI.delay(10)


WebUI.click(new TestObject().addProperty('text', ConditionType.EQUALS, '自主报名'))




