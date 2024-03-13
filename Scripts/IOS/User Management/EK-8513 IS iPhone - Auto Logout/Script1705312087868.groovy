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

CucumberKW.runFeatureFile('Include/features/EK-8513 IS iPhone - Auto Logout.feature')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeOther'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeOther - Settings'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeOther - Logout time 10 minutes'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeOther - 1 minutes'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeOther (2)'), 30)

WebUI.delay(30)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/IOS/User Management/Auto Logout/XCUIElementTypeImage'), 30)

