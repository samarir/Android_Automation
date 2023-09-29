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

Mobile.tap(findTestObject('Login Page/android.widget.TextView - Forgot your password (1)'), 30)

Mobile.setText(findTestObject('Login Page/Restore Password/android.widget.EditText - username (1)'), GlobalVariable.LoginCreds.get(
        'username'), 30)

//Mobile.setText(findTestObject('Object Repository/IS/User Management/Restore Password/android.widget.EditText - username'), GlobalVariable.LoginCreds.get('username'), 30)
Mobile.setText(findTestObject('Login Page/Restore Password/android.widget.EditText - Email'), GlobalVariable.LoginCreds.get(
        'email'), 30)

Mobile.tap(findTestObject('Login Page/Restore Password/android.widget.TextView - Restore Password'), 30)

Mobile.pressBack()

