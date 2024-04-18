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

CucumberKW.runFeatureFile('Include/features/EK-8733 IS iPhone - Add Patient.feature')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeOther - Add Patient'), 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeTextField - First name'), 
    'Test', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeTextField - Last name'), 
    'Lite', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeTextField - Date of birth (ddmmyyyy)'), 
    '09/12/2001', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeTextField - MRN'), '6766', 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeStaticText - Patient created successfully'), 
    'Patient created successfully')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Add Patient/XCUIElementTypeButton - OK'), 30)

