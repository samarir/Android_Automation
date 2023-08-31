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

WebUI.callTestCase(findTestCase('User Managemenet/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('MRN: 987')

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - MRN 987'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - Edit patient'), 
    0)

Mobile.setText(findTestObject('Patient Management/Edit Patient/android.widget.EditText - First Name'), 'Edit', 0)

Mobile.setText(findTestObject('Patient Management/Edit Patient/android.widget.EditText - Last Name'), 'Lite', 0)

Mobile.setText(findTestObject('Patient Management/Edit Patient/android.widget.EditText - DOB (1)'), '09/08/1997', 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - Save'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.Button - OK'), 0)

Mobile.pressBack()

Mobile.scrollToText('6768')

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - MRN 6768'), 0)

Mobile.tap(findTestObject('Data Preparation/Patient Management/android.widget.ImageView - menu'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - Freeze patient'), 
    0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.ImageView (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.Switch - ON'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - Apply'), 0)

Mobile.scrollToText('MRN: 6767')

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - 25M  MRN 6767'), 
    0)

Mobile.tap(findTestObject('Data Preparation/Patient Management/android.widget.ImageView - menu'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.TextView - UnFreeze patient'), 
    0)

Mobile.tap(findTestObject('Data Preparation/Patient Management/android.widget.TextView - Confirm'), 0)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Patient Management/android.widget.ImageView (2)'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)
