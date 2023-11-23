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

CucumberKW.runFeatureFile('Include/features/EK-8355 EU Android - Delete Patient.feature')

Mobile.setText(findTestObject('EU/Patient Management/Add Patient/android.widget.EditText - Search by Name, Patient ID'), 
    '6766', 30)

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.TextView - Current site'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.view.ViewGroup (1)'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.TextView - Delete patient'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.TextView - Delete the selected patient The patient will be removed from the directory if deleted'), 
    'Delete the selected patient? The patient will be removed from the directory if deleted')

Mobile.tap(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.Button - CONFIRM'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Patient Management/Delete Patient/android.widget.TextView - No content found'), 
    30)

