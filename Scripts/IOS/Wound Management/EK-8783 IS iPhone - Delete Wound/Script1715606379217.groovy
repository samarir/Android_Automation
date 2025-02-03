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

CucumberKW.runFeatureFile('Include/features/EK-8783 IS iPhone - Delete Wound.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '91ui', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

// this first tap is just to remove the key board since its blocking.
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Lock Wound/XCUIElementTypeOther - Wound'), 30)

Mobile.tap(findTestObject('IOS/Wound Management/Unlock Wound/XCUIElementTypeOther - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Delete Wound/XCUIElementTypeOther - Delete wound'), 0)

Mobile.takeScreenshot()


Mobile.delay(10)
Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Delete Wound/XCUIElementTypeStaticText - Delete the selected wound All data, including all images and measurements, will be erased'), 
    'Delete the selected wound? All data, including all images and measurements, will be erased.',FailureHandling.STOP_ON_FAILURE)
Mobile.delay(10)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Delete Wound/XCUIElementTypeButton - Cancel (1)'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Delete Wound/XCUIElementTypeButton - Confirm (1)'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IOS/Wound Management/Lock Wound/XCUIElementTypeOther - Press Back 2 (1)'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Add Wound/XCUIElementTypeOther - x'), 30)




