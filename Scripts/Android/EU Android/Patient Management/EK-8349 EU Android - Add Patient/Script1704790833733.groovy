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

CucumberKW.runFeatureFile('Include/features/EK-8349 EU Android - Add Patient.feature')

WebUI.callTestCase(findTestCase('Android/EU Android/User Management/EK-8286 EU Android - Sign-in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Add Patient/android.widget.TextView - add patient'), 
    30)

Mobile.setText(findTestObject('Android/EU/Patient Management/Add Patient/android.widget.EditText - First name'), 'Test', 
    30)

Mobile.pressBack()

Mobile.setText(findTestObject('Android/EU/Patient Management/Add Patient/android.widget.EditText - last name'), 'Lite', 
    30)

Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Android/EU/Patient Management/Add Patient/android.widget.EditText - Date of birth (ddmmyyyy)'), 
    '09/12/2001', 30)

Mobile.pressBack()

Mobile.scrollToText('Gender*', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Android/EU/Patient Management/Add Patient/android.widget.EditText - Patient ID'), '6766', 
    30)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Add Patient/android.widget.TextView - Save'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Patient Management/Add Patient/android.widget.TextView - Patient created successfully'), 
    'Patient created successfully')

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Add Patient/android.widget.Button - OK'), 30)

Mobile.verifyElementText(findTestObject('Android/EU/Patient Management/Add Patient/android.widget.TextView - Lite, Test'), 
    'Lite, Test')

