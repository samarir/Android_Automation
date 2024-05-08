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

CucumberKW.runFeatureFile('Include/features/EK-8734 IS iPhone - Edit Patient.feature')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - menu'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - Edit patient'), 
    30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeTextField - First Name'), 
    'Editt', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeTextField - Last Name'), 
    'Litee', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeTextField - DOB'), '09/07/2001', 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeStaticText - Patient updated successfully'), 
    'Patient updated successfully.')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeButton - OK'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - Litee, Editt'), 
    'Litee, Editt')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeStaticText - 09072001'), 
    '09/07/2001')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - 22'), 
    '22')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeStaticText - 987'), 
    '987')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Edit Patient/XCUIElementTypeOther - Back'), 30)

