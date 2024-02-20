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

CucumberKW.runFeatureFile('Include/features/EK-8593 IS iPhone - Help.feature')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Help'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Help Center'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeStaticText - Help'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeButton - Cancel'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Help'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Send device info'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeStaticText - Device hardware and software information will be sent to eKare for troubleshooting'), 
    'Device hardware and software information will be sent to eKare for troubleshooting')

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeButton - Cancel (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeButton - Proceed'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeStaticText - Information sent successfully'), 
    'Information sent successfully')

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'),
	30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Help'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Help/XCUIElementTypeOther - Send back up'), 30)


