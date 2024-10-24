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

CucumberKW.runFeatureFile('Include/features/EK-8591 IS iPhone - Phone general tutorial.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeOther - Help'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeOther - App Intro'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeImage'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeStaticText - To start, add a new patient or select from your list'), 
    'To start, add a new patient or select from your list')

Mobile.swipe(650, 702, 106, 702)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeStaticText - Add new or select an existing wound'), 
    'Add new or select an existing wound.')

Mobile.swipe(650, 702, 106, 702)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeOther - Measure wound dimensions and color composition'), 
    'Measure wound dimensions and color composition')

Mobile.swipe(650, 702, 106, 702)

Mobile.verifyElementText(findTestObject('IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeStaticText - Enter clinical information for documentation and reporting'), 
    'Enter clinical information for documentation and reporting')

Mobile.swipe(650, 702, 106, 702)

Mobile.checkElement(findTestObject('IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeStaticText - Monitor wound and healing progress'), 
    0)

Mobile.tap(findTestObject('IOS/Menu and Other Sevices/Phone tuto/XCUIElementTypeOther - Got it'), 0)

