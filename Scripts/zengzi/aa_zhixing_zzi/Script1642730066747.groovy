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

WebUI.callTestCase(findTestCase('public_ty/addproject'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/xmshenh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(60)

WebUI.callTestCase(findTestCase('zengzi/zzi_bming'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.callTestCase(findTestCase('public_ty/shourf_shenh'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/qr_shoukuan/web_SCdingdan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/qr_shoukuan/jiesuan'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/zhaipai'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('zengzi/queren_rongzf'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('public_ty/zztongzhishu_guapai'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('zengzi/linx_touzf'), [:], FailureHandling.STOP_ON_FAILURE)

