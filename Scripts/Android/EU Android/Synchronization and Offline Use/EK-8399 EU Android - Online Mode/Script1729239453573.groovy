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

CucumberKW.runFeatureFile('Include/features/EK-8399 EU Android - Online Mode.feature')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView - Menu'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Settings'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Sync Mode'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Online only'),
	30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - No temporary local storage. Cannot use app without internet connection. Proceed'),
	'No temporary local storage. Cannot use app without internet connection. Proceed?')

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.Button - CONFIRM'),
	30)

Mobile.scrollToText('MRN: 12ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - MRN 12ui'),
	30)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.toggleWifi('off', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Next'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Save'),
	30)

WebUI.delay(5)

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Wound 2 Pressure Injury'),
	30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Syncing data. Please try again later'),
	'Syncing data. Please try again later.')

Mobile.tap(findTestObject('Object Repository/Android/IS/Synchronization and Offline Use/Online mode/android.widget.Button - OK'),
	30)

Mobile.pressBack()
