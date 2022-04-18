
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize


 /**
	 * Refresh browser
	 */ 
def static "keygetdate.refreshBrowser"() {
    (new keygetdate()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "keygetdate.clickElement"(
    	TestObject to	) {
    (new keygetdate()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "keygetdate.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new keygetdate()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */ 
def static "keygetdate.isElementPresent_Mobile"(
    	TestObject to	
     , 	int timeout	) {
    (new keygetdate()).isElementPresent_Mobile(
        	to
         , 	timeout)
}

 /**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */ 
def static "keygetdate.getCurrentSessionMobileDriver"() {
    (new keygetdate()).getCurrentSessionMobileDriver()
}

 /**
	 * Send request and verify status code
	 * @param request request object, must be an instance of RequestObject
	 * @param expectedStatusCode
	 * @return a boolean to indicate whether the response status code equals the expected one
	 */ 
def static "keygetdate.verifyStatusCode"(
    	TestObject request	
     , 	int expectedStatusCode	) {
    (new keygetdate()).verifyStatusCode(
        	request
         , 	expectedStatusCode)
}

 /**
	 * Add Header basic authorization field,
	 * this field value is Base64 encoded token from user name and password
	 * @param request object, must be an instance of RequestObject
	 * @param username username
	 * @param password password
	 * @return the original request object with basic authorization header field added
	 */ 
def static "keygetdate.addBasicAuthorizationProperty"(
    	TestObject request	
     , 	String username	
     , 	String password	) {
    (new keygetdate()).addBasicAuthorizationProperty(
        	request
         , 	username
         , 	password)
}


def static "upfile.pickFile"(
    	TestObject to	
     , 	String filePath	) {
    (new upfile()).pickFile(
        	to
         , 	filePath)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}
