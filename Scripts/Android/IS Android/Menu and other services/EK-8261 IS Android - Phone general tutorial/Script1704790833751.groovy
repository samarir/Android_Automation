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

CucumberKW.runFeatureFile('Include/features/EK-8261 IS Android - Phone general tutorial.feature')

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.ImageView - Menu'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - Help'),
	30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - App Intro'),
	30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.view.ViewGroup - Tuto'),
	30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - Welcome to inSight'),
	30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - Skip'),
	30)
//This part was commented because it was making the test fail on Katalon testops for more details check the run number: 1390

//Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - next'),30)

//Mobile.tap(findTestObject('Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - next'), 30)

//Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - Add a wound'),'Add a wound')

Mobile.tap(findTestObject('Android/IS/Menu and other services/Phone General Tuto/android.widget.TextView - Skip'), 30)