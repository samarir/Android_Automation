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

Mobile.setText(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.EditText - Search by Name, MRN'), 
    '6767', 0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.view.ViewGroup'), 0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.TextView - Current site'), 
    0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.view.ViewGroup (1)'), 0)

Mobile.tap(findTestObject('Patient Management/Freeze Patient/android.widget.ImageView - menu'), 0)

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.TextView - Freeze patient'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.TextView - Change patient status to Inactive'), 
    'Change patient status to Inactive ?')

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.TextView - Confirm'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.TextView - Patient Inactive'), 
    'Patient Inactive')

Mobile.tap(findTestObject('Object Repository/Patient Management/Freeze Patient/android.widget.ImageView (1)'), 0)

