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

CucumberKW.runFeatureFile('Include/features/EK-8286 EU Android - Sign-in.feature')

Mobile.startApplication(GlobalVariable.LoginCreds.APK, true)

Mobile.setText(findTestObject('Android/Login Page/Username input'), GlobalVariable.LoginCreds.get('username'), 30)

Mobile.setText(findTestObject('Android/Login Page/Password input'), GlobalVariable.LoginCreds.get('password'), 30)

Mobile.tap(findTestObject('Android/Login Page/Sign in'), 30)

//Mobile.tap(findTestObject('Object Repository/Android/Draft/android.widget.TextView - OK'), 30)
Mobile.tap(findTestObject('Android/IS/User Management/Login/android.widget.TextView - Katalon'), 30)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Android/IS/User Management/Login/android.widget.TextView - Patient Directory'), 30)