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

Mobile.delay(60, FailureHandling.STOP_ON_FAILURE)

Mobile.toggleWifi('off', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/IS/Synchronization and Offline Use/Automatic sync mode/android.view.ViewGroup - add patient'), 30)

Mobile.setText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.EditText - First name'), 
    'Test', 30)
Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.EditText - Last name'), 
    'Sync', 30)
Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.EditText - Date of birth (ddmmyyyy)'), 
    '01/09/1990', 30)
Mobile.pressBack()

Mobile.setText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.EditText - MRN'), 
    '00ui', 30)
Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - Save'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - Patient created successfully'), 
    'Patient created successfully')

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.Button - OK'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - Sync, Test'), 
    'Sync, Test')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - MRN 00ui'), 
    'MRN: 00ui')

Mobile.tap(findTestObject('Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - MRN 00ui'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.ImageView - add wound'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Save'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.view.ViewGroup (2)'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Management/Add Wound/android.view.ViewGroup (2)'), 30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Assessment'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.ImageView - add Assessement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.ImageView - add Assessement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - WOUND EDGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Rolled'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PERI WOUND SKIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Oedema'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PERI WOUND SKIN (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PAIN'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.SeekBar - 0.0'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PAIN'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Minimum'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PRESSURE INJURY STAGING'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - stage II'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PRESSURE INJURY STAGING'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - ODOR'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - None'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Save'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup (1)'), 
    30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Treatment'), 30)

Mobile.verifyElementExist(findTestObject('Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.ImageView - add treatment'), 
    30)

Mobile.tap(findTestObject('Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.ImageView - add treatment'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - CLEANSING'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Acetic Acid'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - OINTMENTS'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Zinc Oxide'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Acetic Acid (1)'), 
    'Acetic Acid')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Zinc Oxide (1)'), 
    'Zinc Oxide')

Mobile.pressBack()

Mobile.pressBack()

Mobile.toggleWifi('on', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

Mobile.delay(20, FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('00ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.widget.TextView - MRN 00ui (1)'), 
    30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.view.ViewGroup'), 
    30)

Mobile.tap(findTestObject('Android/IS/Synchronization and Offline Use/Automatic sync mode/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Assessment'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.view.ViewGroup (1)'), 
    30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Treatment'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Automatic sync mode/android.view.ViewGroup (2)'), 
    30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

