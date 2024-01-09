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

CucumberKW.runFeatureFile('Include/features/EK-8263 IS Android - Help.feature')
Mobile.tap(findTestObject('Android/Patient Directory/Left Menu'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Help'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Help Center'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Support'),
	'Support')

Mobile.verifyElementText(findTestObject('Android/IS/Menu and other services/Help/android.widget.TextView - Critical Notifications (2)'),
	'Critical Notifications')

Mobile.pressBack()

Mobile.tap(findTestObject('Android/IS/Menu and other services/Help/android.widget.TextView - Help'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Send device info'),
	30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Device hardware and software information will be sent to eKare for troubleshooting'),
	'Device hardware and software information will be sent to eKare for troubleshooting')

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.Button - CANCEL'),
	30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.Button - PROCEED'),
	30)

Mobile.tap(findTestObject('Android/IS/Menu and other services/Help/android.widget.Button - PROCEED'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Information sent successfully'),
	'Information sent successfully')

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.Button - OK'), 30)

Mobile.tap(findTestObject('Android/IS/Menu and other services/Help/android.widget.ImageView - Menu'), 30)

Mobile.tap(findTestObject('Android/IS/Menu and other services/Help/android.widget.TextView - Help'), 30)

Mobile.verifyElementExist(findTestObject('Android/IS/Menu and other services/Help/android.widget.TextView - Send back up'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Help/android.widget.TextView - Send back up'), 30)

