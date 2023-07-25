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

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.TextView - Edit patient'), 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.EditText - First Name'), 
    'Editt', 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.EditText - Last Name'), 
    'Litee', 0)

Mobile.setText(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.EditText - DOB'), '09/07/2001', 
    0)

Mobile.verifyElementAttributeValue(findTestObject('Patient Management/Edit Patient/android.widget.EditText - MRN'), 'enabled', 
    'false', 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.TextView - Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.TextView - Patient updated successfully'), 
    'Patient updated successfully.')

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.Button - OK'), 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Patient Management/Edit Patient/android.widget.ImageView - x'), 0)

