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

CucumberKW.runFeatureFile('Include/features/EK-8771 IS iPhone - Freeze Patient.feature')

Mobile.setText(findTestObject('IOS/Patient Management/Freeze Patient/XCUIElementTypeTextField - Search Bar'), '6767', 30)

// this first tap is just to remove the key board since its blocking.
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Freeze patient'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Change patient status to Inactive'), 
    'Change patient status to Inactive ?')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Confirm'), 
    'Confirm')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Cancel'), 
    'Cancel')

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Freeze Patient/XCUIElementTypeOther - Confirm'), 30)

