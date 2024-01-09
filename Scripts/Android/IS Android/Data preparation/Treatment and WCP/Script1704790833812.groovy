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

Mobile.scrollToText('MRN: 24ui', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - MRN 24ui'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Edit Wound/android.widget.ImageView - MENU (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Patient Management/Delete Patient/android.widget.TextView - Delete patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/Patient Directory/Account Menu (left menu)/Logout ( from menu)/CONFIRM logout'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.ImageView - add wound'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.view.ViewGroup - save (1)'), 30)

Mobile.pressBack()

Mobile.scrollToText('MRN: 09ui', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - MRN 09ui'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.view.ViewGroup'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.view.ViewGroup (1)'), 30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Treatement'), 30)

Mobile.tap(findTestObject('Android/IS/Treatment and WCP/Edit Treatment/android.widget.ImageView - Edit Treatement'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.widget.TextView - OINTMENTS'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.widget.TextView - Zinc Oxide'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/android.view.ViewGroup - save'), 30)

