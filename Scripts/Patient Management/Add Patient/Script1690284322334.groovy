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

Mobile.tap(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.TextView - add patient'), 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.EditText - First name'), 
    'Test', 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.EditText - Last name'), 'lite', 
    0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.EditText - Date of birth (ddmmyyyy) (1)'), 
    '09/12/2001', 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.EditText - MRN'), '6766', 
    0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.TextView - Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.TextView - Patient created successfully'), 
    'Patient created successfully')

Mobile.tap(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.Button - OK'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Patient Management/Add Patient/android.widget.TextView - lite, Test'), 
    'lite, Test')

