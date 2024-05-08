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

CucumberKW.runFeatureFile('Include/features/EK-8569 IS iPhone - Terms and condition Privacy and Policy.feature')

Mobile.startApplication(GlobalVariable.LoginCreds.IPA, true)
//Mobile.tap(findTestObject('Object Repository/IOS/User Management/Sign In/XCUIElementTypeButton - Allow'), 30)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeOther - Terms  Conditions'),
	30)

Mobile.tap(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeOther - Terms  Conditions'),
	30)

WebUI.delay(5)

Mobile.tapAtPosition(44, 42)
Mobile.tapAtPosition(44, 42)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeImage'),
	30)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeOther - Privacy Policy'),
	30)

Mobile.tap(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeOther - Privacy Policy'),
	30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(44, 42)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Terms and Conditions Privacy and Policy/XCUIElementTypeImage'),
	30)

