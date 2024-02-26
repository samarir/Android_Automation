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

CucumberKW.runFeatureFile('Include/features/EK-8370 EU Android - Delete Wound.feature')

Mobile.setText(findTestObject('Android/EU/Patient Management/Add Patient/android.widget.EditText - Search by Name, Patient ID'), 
    '91ui', 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.TextView - Current site'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.TextView - Current site (1)'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.view.ViewGroup - Patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.view.ViewGroup - Patient'), 
    30)

Mobile.verifyElementExist(findTestObject('Android/IS/Wound Management/Delete Wound/android.view.ViewGroup - wound 2'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Management/Delete Wound/android.view.ViewGroup - wound 2'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.ImageView - menu'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.ImageView - menu'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.TextView - Delete wound'), 
    'Delete wound')

Mobile.tap(findTestObject('Android/IS/Wound Management/Delete Wound/android.widget.TextView - Delete wound'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.TextView - Delete the selected wound All data, including all images and measurements, will be erased'), 
    'Delete the selected wound? All data, including all images and measurements, will be erased.')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.Button - CANCEL'), 
    'CANCEL')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.Button - CONFIRM'), 
    30)

Mobile.tap(findTestObject('Android/IS/Wound Management/Delete Wound/android.widget.Button - CONFIRM'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.TextView - Click  above to add a wound'), 
    'Click "+" above to add a wound')

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Delete Wound/android.widget.ImageView - x'), 30)

