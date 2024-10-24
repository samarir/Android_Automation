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

CucumberKW.runFeatureFile('Include/features/EK-8570 IS iPhone - 10 Times failed login.feature')

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('IOS/User Management/Sign In/XCUIElementTypeTextField - username'), 'Test10times', 30)

Mobile.setText(findTestObject('IOS/User Management/Sign In/XCUIElementTypeSecureTextField - Passcode'), '123', 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Your account has been temporarily disabled due to repeated login failures. Please contact your administrator samarirmasaratapp.com'), 
    'Your account has been temporarily disabled due to repeated login failures. Please contact your administrator: samarir@masaratapp.com')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.verifyElementText(findTestObject('IOS/User Management/10 times failed login/XCUIElementTypeStaticText - Login failed. Incorrect credentials (1)'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeOther - SIGN IN'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/User Management/10 times failed login/XCUIElementTypeButton - OK'), 30)

