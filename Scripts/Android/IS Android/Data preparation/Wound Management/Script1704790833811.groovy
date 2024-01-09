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

WebUI.callTestCase(findTestCase('Android/IS Android/User Managemenet/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.scrollToText('MRN: 78ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 78ui'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.ImageView - menu'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Delete wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.Button - CONFIRM'), 30)

if (Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Click  above to add a wound'), 
    30, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    Mobile.pressBack()

    Mobile.scrollToText('MRN: 86ui')

    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 86ui'), 
        30)

    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.ImageView - menu'), 30)

    Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.TextView - Delete wound'), 30)

    Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.Button - CONFIRM'), 30)

    Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.ImageView - add wound'), 30)

    Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.TextView - Next'), 30)

    Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.TextView - Save'), 30)

    Mobile.verifyElementExist(findTestObject('Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

    Mobile.pressBack()
} else if (Mobile.verifyElementNotExist(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Click  above to add a wound'), 
    30, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.ImageView - menu'), 30)

    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Delete wound'), 
        30)

    Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.Button - CONFIRM'), 30)

    Mobile.pressBack()
}

Mobile.scrollToText('MRN: 87ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 87ui'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.ImageView (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Active'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Active (1)'), 
    'Active')

Mobile.pressBack()

Mobile.pressBack()

Mobile.scrollToText('MRN: 89ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 89ui'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.ImageView - menu'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Unlock wound'), 
    30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.scrollToText('MRN: 90ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 90ui'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Management/Edit Wound/android.widget.ImageView - MENU (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Lock wound'), 30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.scrollToText('MRN: 91ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - MRN 91ui'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Management/android.widget.ImageView - add wound'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Data Preparation/Wound Management/android.widget.TextView - Save'), 30)

Mobile.verifyElementExist(findTestObject('Android/IS/Data Preparation/Wound Management/android.view.ViewGroup - wound'), 30)

Mobile.pressBack()

