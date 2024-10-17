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

CucumberKW.runFeatureFile('Include/features/EK-8807 IS iPhone - Patient Assessment Questionnaire.feature')

Mobile.startApplication(GlobalVariable.LoginCreds.IPA, true)

Mobile.setText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Username'), 
    'samarir+katalonpatient@masaratapp.com', 30)

Mobile.setText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Password'), 
    'eKare123@', 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther - SIGN IN'), 30)

WebUI.delay(5)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther - Wound 1 Pressure Injury General'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther - Wound 1 Pressure Injury General'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther - Assessment'), 
    30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Please call your provider at 3333333333 to leave a message for your home care nurse'), 
    'Please call your provider at 3333333333 to leave a message for your home care nurse.')

Mobile.tap(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeButton - OK'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Yes'), 
    'Yes')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Yes (1)'), 
    'Yes')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - No'), 
    'No')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Assessment/Patient Assessment/XCUIElementTypeStaticText - Test note'), 
    'Test note')

Mobile.closeApplication()

