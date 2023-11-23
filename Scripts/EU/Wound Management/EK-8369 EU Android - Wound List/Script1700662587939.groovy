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

CucumberKW.runFeatureFile('Include/features/EK-8369 EU Android - Wound List.feature')

Mobile.setText(findTestObject('EU/Patient Management/Add Patient/android.widget.EditText - Search by Name, Patient ID'), 
    '92ui', 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Current site'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Current site (1)'), 
    30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Wound List/android.view.ViewGroup - patient'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - 92ui'), 
    '92ui')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Male'), 
    'Male')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - 09091990'), 
    '09/09/1990')

Mobile.verifyElementText(findTestObject('IS/Wound Management/Wound List/android.widget.TextView - 33'), '33')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Active'), 
    'Active')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - No'), 
    'No')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Wound, List'), 
    'Wound, List')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Management/Wound List/android.view.ViewGroup - wound2'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Wound 2 Pressure Injury'), 
    'Wound 2: Pressure Injury')

Mobile.verifyElementText(findTestObject('EU/Wound Management/android.widget.TextView - Calf, Left'), 'Calf, Left')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Management/Wound List/android.view.ViewGroup - wound1'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Wound 1 Trauma'), 
    'Wound 1: Trauma')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - HeadNeck, Front'), 
    'Head/Neck, Front')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Test description'), 
    'Test description')

Mobile.verifyElementExist(findTestObject('Object Repository/IS/Wound Management/Wound List/android.view.ViewGroup - wound3 (1)'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Wound 3 Pressure Injury (1)'), 
    'Wound 3: Pressure Injury')

Mobile.tap(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.ImageView - menu'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Generate Report'), 
    'Generate Report')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Edit patient'), 
    'Edit patient')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Freeze patient'), 
    'Freeze patient')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Delete patient'), 
    'Delete patient')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Wound Management/Wound List/android.widget.TextView - Cancel'), 
    'Cancel')

Mobile.tap(findTestObject('IS/Wound Management/Wound List/android.widget.TextView - Cancel'), 30)

