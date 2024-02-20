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

CucumberKW.runFeatureFile('Include/features/EK-8587 IS iPhone - Switch between sites.feature')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Site'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - site user'), 
    30)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Patient 1'), 
    0)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Site'), 
    30)

Mobile.tap(findTestObject('IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Test1'), 30)

Mobile.verifyElementExist(findTestObject('IOS/User Management/Login as a user with multiple sites/XCUIElementTypeOther - Katalon, Patient 07022024 33M    MRN 112ui No Consent (1)'), 
    0)

