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

Mobile.startApplication('C:\\Users\\Amarir\\Downloads\\APK\\IS\\app-release.apk', true)

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - username'), 'test101', 0)

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - password'), '123', 0)

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 0)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 0)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Fail 10 attempts message'), 
    'Your account has been temporarily disabled due to repeated login failures. Please contact your administrator: samarir@masaratapp.com')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK (1)'), 0)

