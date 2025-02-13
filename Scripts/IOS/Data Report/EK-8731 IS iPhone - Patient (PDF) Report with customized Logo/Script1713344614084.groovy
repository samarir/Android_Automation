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

CucumberKW.runFeatureFile('Include/features/EK-8731 IS iPhone - Patient (PDF) Report with customized Logo.feature')

Mobile.tap(findTestObject('Object Repository/IOS/Data Report/XCUIElementTypeOther - Default logo (eKare)'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Data Report/XCUIElementTypeOther - Custom logo On the web, go to Menu  Settings'), 
    30)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Generate'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Data Report/XCUIElementTypeImage - Custom Logo'), 30)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeButton - QLOverlayDoneButtonAccessibilityIdentifier'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Data Report/XCUIElementTypeOther - Cancel'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Data Report/XCUIElementTypeOther - Back'), 30)

