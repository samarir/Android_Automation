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

CucumberKW.runFeatureFile('Include/features/EK-8379 EU Android - Patient Assessment Questionnaire.feature')

Mobile.startApplication(GlobalVariable.APK, false)

Mobile.setText(findTestObject('Login Page/android.widget.EditText - Username'), GlobalVariable.LoginCreds.get('patient'),
	30)

Mobile.setText(findTestObject('Login Page/android.widget.EditText - Password'), GlobalVariable.LoginCreds.get('password'),
	30)

Mobile.tap(findTestObject('Login Page/Sign in'), 30)

//Mobile.tap(findTestObject('Object Repository/Draft/android.widget.TextView - OK'), 30)
WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.view.ViewGroup - wound'),
	30)

Mobile.tap(findTestObject('IS/Data Preparation/Wound Assessment/android.view.ViewGroup - Assessment'), 30)

Mobile.tap(findTestObject('IS/Wound Assessment/Patient assessment questionnaire/android.widget.ImageView - Add New Assessment'),
	30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have any new or increased drainage, odor, or redness around the wound'),
	'Do you have any new or increased drainage, odor, or redness around the wound?')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes'),
	0)

Mobile.tap(findTestObject('IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have new or increased wound pain'),
	'Do you have new or increased wound pain?')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (1)'),
	0)

Mobile.tap(findTestObject('IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (1)'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have a fever (temp above 100.4F38C)'),
	'Do you have a fever (temp above 100.4F/38C)?')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (2)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (2)'),
	0)

Mobile.tap(findTestObject('IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (2)'), 0)

Mobile.setText(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.EditText'),
	'Test note', 0)

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Save (1)'),
	0)

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.Button - OK (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have any new or increased drainage, odor, or redness around the wound (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Yes (3)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have new or increased wound pain (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.view.ViewGroup (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Do you have a fever (temp above 100.4F38C) (1)'),
	0)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - No (3)'),
	0)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Test note'),
	'Test note')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.ImageView - Menu'),
	30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.TextView - Logout'),
	30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Assessment/Patient assessment questionnaire/android.widget.Button - CONFIRM'),
	30)

