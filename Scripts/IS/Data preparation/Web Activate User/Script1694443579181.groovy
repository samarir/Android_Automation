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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.LoginCreds.get('url'))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/input_Sign in_username'), 
    GlobalVariable.LoginCreds.get('username'))

WebUI.setText(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/input_Sign in_password'), 
    GlobalVariable.LoginCreds.get('password'))

WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/button_Sign in'))

WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/a_User Management'))

WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/button_Actions'))

WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/li_Edit'))

if (WebUI.verifyElementNotChecked(findTestObject('IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/input_Clinical role_status'), 
    30,FailureHandling.CONTINUE_ON_FAILURE) == true) {
    WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/input_Clinical role_status'))

    WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/button_Save'))

    WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/button_Done'))
}else {
	WebUI.click(findTestObject('Object Repository/IS/Data Preparation/Web_activateUser/Page_eKare inSight 2.1/button_Cancel'))
}




