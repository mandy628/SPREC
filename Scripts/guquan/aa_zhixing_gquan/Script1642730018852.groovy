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

//WebUI.callTestCase(findTestCase('public_ty/addproject'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.callTestCase(findTestCase('public_ty/xmshenh'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.delay(60)

WebUI.callTestCase(findTestCase('guquan/gquan_bming'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.callTestCase(findTestCase('public_ty/shourf_shenh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/qr_shoukuan/web_SCdingdan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/qr_shoukuan/jiesuan'), [:], FailureHandling.STOP_ON_FAILURE)

'手动摘牌'
WebUI.callTestCase(findTestCase('public_ty/zhaipai'), [:], FailureHandling.STOP_ON_FAILURE)

'确认交易方式协议'
WebUI.callTestCase(findTestCase('public_ty/queren_shourf'), [:], FailureHandling.STOP_ON_FAILURE)

'挂牌通知书三级审核'
WebUI.callTestCase(findTestCase('public_ty/zztongzhishu_guapai'), [:], FailureHandling.STOP_ON_FAILURE)

'组织线下交易'

WebUI.callTestCase(findTestCase('zichan/zc_zhuanyong/zzjiaoyi'), [:], FailureHandling.STOP_ON_FAILURE)

