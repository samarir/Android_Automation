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

Mobile.scrollToText('MRN: 11ui')

Mobile.tap(findTestObject('Object Repository/Data Report/Patient (PDF) Report/android.widget.TextView - MRN 11ui'), 30)

Mobile.tap(findTestObject('Object Repository/Data Report/Patient (PDF) Report/android.widget.ImageView - Menu'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Data Report/Patient (PDF) Report/android.widget.TextView - Generate Report'), 
    'Generate Report')

Mobile.tap(findTestObject('Data Report/Patient (PDF) Report/android.widget.TextView - Generate Report'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Data Report/Patient (PDF) Report/android.widget.TextView - Generate'), 
    'Generate')

Mobile.tap(findTestObject('Data Report/Patient (PDF) Report/android.widget.TextView - Generate'), 30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Data Report/Patient (PDF) Report/android.widget.RelativeLayout'), 
    30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

