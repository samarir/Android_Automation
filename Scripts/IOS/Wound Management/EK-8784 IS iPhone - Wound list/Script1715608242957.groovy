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

CucumberKW.runFeatureFile('Include/features/EK-8784 IS iPhone - Wound list.feature')

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '92ui', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

// this first tap is just to remove the key board since its blocking.

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)


Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeOther - Wound, List'), 
    'Wound, List')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeStaticText - 92ui'), 
    '92ui')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeStaticText - 09091990'), 
    '09/09/1990')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeStaticText - Male'), 
    'Male')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeStaticText - Active'), 
    'Active')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeOther - Wound 2 Pressure Injury General'), 
    'Wound 2: Pressure Injury General')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeOther - Wound 1 Trauma HeadNeck, Front Test description'), 
    'Wound 1: Trauma Head/Neck, Front Test description')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound List/XCUIElementTypeOther - Wound 3 Pressure Injury General'), 
    'Wound 3: Pressure Injury General')



