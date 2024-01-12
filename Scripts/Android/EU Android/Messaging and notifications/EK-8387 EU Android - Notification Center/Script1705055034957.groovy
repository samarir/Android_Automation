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

CucumberKW.runFeatureFile('Include/features/EK-8387 EU Android - Notification Center .feature')

WebUI.callTestCase(findTestCase('Android/EU Android/User Management/EK-8286 EU Android - Sign-in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Android/IS/Messaging and Communication/Notifications/android.widget.ImageView - notification center'), 
    0)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Messaging and Communication/Notifications/android.widget.TextView - Edit, Assessment'), 
    'Edit, Assessment ')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Messaging and Communication/Notifications/android.widget.TextView - Patient, Katalon sent you a new message  Patient Wound General'), 
    'Patient, Katalon sent you a new message  Patient \nWound: General')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Messaging and Communication/Notifications/android.widget.TextView - hello clinician (1)'), 
    'hello clinician')

Mobile.pressBack()

