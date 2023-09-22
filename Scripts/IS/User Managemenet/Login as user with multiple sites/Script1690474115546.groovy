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

Mobile.setText(findTestObject('IS/User Management/Login/android.widget.EditText - username'), GlobalVariable.LoginCreds.get(
	'siteuser'), 30)
Mobile.setText(findTestObject('IS/User Management/Login/android.widget.EditText - password'), GlobalVariable.LoginCreds.get(
        'password'), 30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - SIGN IN'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Katalon'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - add new patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.view.ViewGroup - patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.ImageView - menu'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Freeze patient'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Delete patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Cancel'), 
    30)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.ImageView - Menu (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Site'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - site user'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.view.ViewGroup'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.ImageView - menu'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Edit patient'), 
    30)

Mobile.verifyElementNotExist(findTestObject('IS/User Management/Login as user with multiple sites/android.widget.TextView - Delete patient'), 
    30)

Mobile.verifyElementNotExist(findTestObject('IS/User Management/Login as user with multiple sites/android.widget.TextView - Freeze patient'), 
    30)

Mobile.tap(findTestObject('IS/User Management/Login as user with multiple sites/android.widget.TextView - Cancel'), 30)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.ImageView - Menu (1)'), 
    30)

Mobile.tap(findTestObject('IS/User Management/Login as user with multiple sites/android.widget.TextView - Site'), 30)

Mobile.tap(findTestObject('Object Repository/IS/User Management/Login as user with multiple sites/android.widget.TextView - Test1'), 
    30)

Mobile.verifyElementNotExist(findTestObject('IS/User Management/Login as user with multiple sites/android.widget.TextView - add new patient'), 
    30)

