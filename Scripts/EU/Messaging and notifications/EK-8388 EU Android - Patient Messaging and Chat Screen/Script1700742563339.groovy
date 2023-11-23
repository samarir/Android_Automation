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

CucumberKW.runFeatureFile('Include/features/EK-8388 EU Android - Patient Messaging and Chat Screen.feature')

Mobile.startApplication(GlobalVariable.LoginCreds.get('APK'), true)

Mobile.setText(findTestObject('Login Page/Username input'), GlobalVariable.LoginCreds.get('patient'), 30)

Mobile.setText(findTestObject('Login Page/Password input'), GlobalVariable.LoginCreds.get('password'), 30)

Mobile.tap(findTestObject('Login Page/Sign in'), 30)

WebUI.delay(10)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.ImageView - new wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - Select'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - Katalon Automation'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - Next'), 
    30)

Mobile.tapAtPosition(400, 900)

Mobile.tap(findTestObject('Object Repository/EU/Wound Management/android.widget.TextView - Shoulder'), 30)

Mobile.tap(findTestObject('Object Repository/EU/Wound Management/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - Save'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('Wound 3: Pressure Injury', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('EU/Messaging and Notifications/android.widget.TextView - Wound 3 Pressure Injury'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('IS/Hard to find elements/android.view.ViewGroup - Messaging'), 30)

Mobile.setText(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.EditText - Type your message here'), 
    'hello clinician', 30)

Mobile.tap(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.ImageView'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - hello clinician'), 
    'hello clinician')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('IS/Hard to find elements/android.view.ViewGroup - Messaging'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Messaging and Communication/Notifications/android.widget.TextView - hello clinician'), 
    'hello clinician')

Mobile.pressBack()

Mobile.pressBack()

WebUI.callTestCase(findTestCase('IS/User Managemenet/Logout'), [:], FailureHandling.STOP_ON_FAILURE)

