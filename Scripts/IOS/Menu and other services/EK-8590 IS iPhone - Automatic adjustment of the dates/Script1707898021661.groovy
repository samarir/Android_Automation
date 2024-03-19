import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.util.regex.Pattern
import java.util.regex.Matcher


CucumberKW.runFeatureFile('Include/features/EK-8590 IS iPhone - Automatic adjustment of the dates.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Menu'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Site'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - site user'), 
    0)

String date1 = Mobile.getText(findTestObject('IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Katalon, Test 20230727 24M    MRN 900ui No Consent'), 
    30)

String regex = "^\\w+,\\s\\w+\\s\\d{4}/\\d{2}/\\d{2}"
Pattern pattern = Pattern.compile(regex)
Matcher matcher = pattern.matcher(date1)
boolean isMatch = matcher.find()

 if(isMatch == true) {
	 
	 Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Menu'),
		 0)
	 
	 Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Site'),
		 0)
	 
	 Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Data Auto adjusment/XCUIElementTypeOther - Katalon'),
		 0)
	 
	 
 }





