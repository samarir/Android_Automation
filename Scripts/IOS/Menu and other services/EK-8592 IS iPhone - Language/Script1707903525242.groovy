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

CucumberKW.runFeatureFile('Include/features/EK-8592 IS iPhone - Language.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - Settings (1)'), 30)

Mobile.tap(findTestObject('IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - Language English (1)'), 30)

Mobile.tap(findTestObject('IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - back'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - add wound'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - (1)'), 
    '病人记录')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - (2)'), 
    '添加新患者')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - (3)'), 
    '保存')

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - Back (1)'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - Settings'), 30)

Mobile.tap(findTestObject('IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - Language English (1)'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Menu and Other Sevices/Language/XCUIElementTypeOther - English'), 30)

