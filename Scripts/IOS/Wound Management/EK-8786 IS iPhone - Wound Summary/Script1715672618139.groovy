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

CucumberKW.runFeatureFile('Include/features/EK-8786 IS iPhone - Wound Summary.feature')

Mobile.tap(findTestObject('IOS/Wound Management/Wound List/XCUIElementTypeOther - Wound 1 Trauma HeadNeck, Front Test description'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - 3D 26072023'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - 3D'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Wound 1 Trauma'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Wound, List Patient'), 
    'Wound, List Patient')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - 14082023 Onset'), 
    '14/08/2023 Onset')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - HeadNeck, Front Test description Location'), 
    'Head/Neck, Front Test description Location')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeStaticText - Last assessment'), 
    'Last assessment')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - WOUND SIZE'), 
    'WOUND SIZE')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - COLOR COMPOSITION'), 
    'COLOR COMPOSITION')

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Summary'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Assessment'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Treatment'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Messaging'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Active'), 
    'Active')

Mobile.verifyElementVisible(findTestObject('Object Repository/IOS/Wound Management/Wound Summary/XCUIElementTypeOther - Menu'), 
    30)

Mobile.verifyElementExist(findTestObject('IOS/Wound Management/Wound Summary/XCUIElementTypeOther - New Measurement'), 30)

Mobile.verifyElementVisible(findTestObject('IOS/Wound Management/Wound Summary/XCUIElementTypeOther - New Measurement'), 
    30)

