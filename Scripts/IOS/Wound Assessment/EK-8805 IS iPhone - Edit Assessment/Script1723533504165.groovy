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

CucumberKW.runFeatureFile('Include/features/EK-8805 IS iPhone - Edit Assessment.feature')

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '23ui', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

// this first tap is just to remove the key board since its blocking.
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Wound'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Assessment'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Edit assessment'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - WOUND EDGE'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Attached'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - PERI WOUND SKIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Oedema'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Wound Edge Attached, Rolled'), 
    'Wound Edge Attached, Rolled')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Peri Wound Skin Oedema, Dry'), 
    'Peri Wound Skin Oedema, Dry')

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Back'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Press Back 2'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Add Wound/XCUIElementTypeOther - x'), 30)

