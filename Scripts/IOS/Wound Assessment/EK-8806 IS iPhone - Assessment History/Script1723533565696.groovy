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

CucumberKW.runFeatureFile('Include/features/EK-8806 IS iPhone - Assessment History.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

//Tap at positon not working, swipe not working this test case cant be automated.

Mobile.setText(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeTextField - Search by Name, MRN'), 
    '97ui', 0)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - Current site'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - All Sites'), 
    0)


// this first tap is just to remove the key board since its blocking.

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - Wound 1 Pressure Injury General'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - Assessment'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - 03082023 094638'), 
    '03/08/2023 09:46:38')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - Wound Edge Rolled'), 
    'Wound Edge Rolled')

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(119, 761, 477, 761)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - 02082023 120138 (1)'), 
    '02/08/2023 12:01:38')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Assessment History check/XCUIElementTypeOther - Wound Edge Rolled'), 
    'Wound Edge Rolled')

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Press Back'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Press Back 2'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Add Wound/XCUIElementTypeOther - x'), 30)
