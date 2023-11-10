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

CucumberKW.runFeatureFile('Include/features/EK-8260 IS Android - Automatic adjustment of Date format.feature')
//String date = Mobile.getText(findTestObject('Object Repository/IS/Menu and other services/Automatic adjustment of Date format/android.widget.TextView - 27072023'), 30, FailureHandling.STOP_ON_FAILURE)
//Mobile.verifyMatch(date, '[0-9]{2}/[0-9]{2}/[0-9]{4}', true, FailureHandling.STOP_ON_FAILURE)
WebUI.callTestCase(findTestCase('IS/User Managemenet/Login'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Patient Directory/Left Menu'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites ( from menu)/site user'), 30)

String date1 = Mobile.getText(findTestObject('Patient Directory/Last Modified date ( Patient)'), 30)

Mobile.verifyMatch(date1, '[0-9]{4}/[0-9]{2}/[0-9]{2}', true, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Patient Directory/Left Menu'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Menu and other services/Automatic adjustment of Date format/android.widget.TextView - Katalon'),
	30)
