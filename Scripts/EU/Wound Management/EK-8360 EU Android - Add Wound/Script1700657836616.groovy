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

CucumberKW.runFeatureFile('Include/features/EK-8360 EU Android - Add Wound.feature')

Mobile.setText(findTestObject('EU/Patient Management/Add Patient/android.widget.EditText - Search by Name, Patient ID'), 
    '78ui', 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.widget.TextView - Current site'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.widget.TextView - Current site (1)'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.widget.ImageView - add wound'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.widget.TextView - Next'), 30)

Mobile.tapAtPosition(400, 900)

Mobile.tap(findTestObject('Object Repository/EU/Wound Management/android.widget.TextView - Shoulder'), 30)

Mobile.tap(findTestObject('Object Repository/EU/Wound Management/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.widget.TextView - Save'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Management/Add Wound/android.view.ViewGroup (2)'), 
    30)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Lock Wound/android.widget.ImageView - x'), 30)

