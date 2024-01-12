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

CucumberKW.runFeatureFile('Include/features/EK-8293 EU Android - Disable after 10 login attempts.feature')

Mobile.setText(findTestObject('Android/Login Page/Username input'), 'Test10times', 30)

Mobile.setText(findTestObject('Android/Login Page/Password input'), '123', 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Failed Login message'), 'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Android/Login Page/Login failed OK'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

Mobile.verifyElementText(findTestObject('Android/Login Page/Account Disabled'), 'Your account has been temporarily disabled due to repeated login failures. Please contact your administrator: samarir@masaratapp.com')

Mobile.tap(findTestObject('Android/Login Page/Account disabled OK'), 30)

