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

CucumberKW.runFeatureFile('Include/features/EK-8774 IS iPhone - Delete Patient.feature')

Mobile.setText(findTestObject('IOS/Patient Management/Freeze Patient/XCUIElementTypeTextField - Search Bar'), '6766', 30)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.startApplication('/Users/safaamarir/APK/IOS/IS/IS_Preprod_2.2.1_290.ipa', true)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeOther - Lite, Test 08052024 22M    MRN 6766 No Consent'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeOther - Lite, Test 08052024 22M    MRN 6766 No Consent'), 
    30)

Mobile.tap(findTestObject('IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeOther - Delete patient'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeStaticText - Delete the selected patient The patient will be removed from the directory if deleted'), 
    'Delete the selected patient? The patient will be removed from the directory if deleted')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeButton - Cancel'), 
    'Cancel')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeButton - Confirm'), 
    'Confirm')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeButton - Confirm'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeStaticText - No content found'), 
    'No content found.')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Delete Patient/XCUIElementTypeOther'), 30)


