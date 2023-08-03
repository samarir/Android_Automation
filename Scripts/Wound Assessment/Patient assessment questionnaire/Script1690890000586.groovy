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

Mobile.startApplication(GlobalVariable.LoginCreds.get('APK'), true)

Mobile.startApplication(GlobalVariable.APK, false)

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - username'), 'samarir+patient@masaratapp.com', 
    30)

Mobile.setText(findTestObject('User Management/Login/android.widget.EditText - password'), GlobalVariable.LoginCreds.get(
        'password'), 30)

Mobile.tap(findTestObject('User Management/Login/android.view.ViewGroup - sign in'), 30)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.view.ViewGroup - wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Assessment'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.ImageView - New assessment'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have any new or increased drainage, odor, or redness around the wound'), 
    'Do you have any new or increased drainage, odor, or redness around the wound?')

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.view.ViewGroup'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have new or increased wound pain'), 
    'Do you have new or increased wound pain?')

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have a fever (temp above 100.4F38C)'), 
    'Do you have a fever (temp above 100.4F/38C)?')

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (1)'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (1)'), 
    30)

Mobile.tap(findTestObject('Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Save'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have any new or increased drainage, odor, or redness around the wound (1)'), 
    'Do you have any new or increased drainage, odor, or redness around the wound?')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (2)'), 
    'No')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have new or increased wound pain (1)'), 
    'Do you have new or increased wound pain?')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (2)'), 
    'Yes')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have a fever (temp above 100.4F38C) (1)'), 
    'Do you have a fever (temp above 100.4F/38C)?')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (3)'), 
    'Yes')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.ImageView - Menu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Logout'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Patient assessment questionnaire/android.widget.Button - CONFIRM'), 
    30)

