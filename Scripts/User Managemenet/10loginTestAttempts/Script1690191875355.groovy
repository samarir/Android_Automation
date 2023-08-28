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

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - username'), 'Test10times', 30)

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - password'), '123', 30)

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Login failed. Incorrect credentials'), 
    'Login failed. Incorrect credentials !')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('User Management/10loginAttempts/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('User Management/10loginAttempts/android.widget.TextView - Your account has been temporarily disabled due to repeated login failures. Please contact your administrator qcekareinc.com'), 
    'Your account has been temporarily disabled due to repeated login failures. Please contact your administrator: qc@ekareinc.com')

Mobile.tap(findTestObject('Object Repository/User Management/10loginAttempts/android.widget.Button - OK (1)'), 30)

