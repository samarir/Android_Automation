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

Mobile.scrollToText('MRN: 21ui')

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - MRN 21ui'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.ImageView - menu'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Delete wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.Button - CONFIRM'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.ImageView - add wound'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Save'), 30)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.scrollToText('MRN: 23ui')

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - MRN 23ui'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Data Preparation/Wound Assessment/android.view.ViewGroup - Assessment'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - WOUND EDGE'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Attached'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - PERI WOUND SKIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Oedema'), 30)

Mobile.tap(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Save (1)'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Rolled'), 
    'Rolled')

Mobile.verifyElementText(findTestObject('Object Repository/Data Preparation/Wound Assessment/android.widget.TextView - Dry'), 
    'Dry')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

