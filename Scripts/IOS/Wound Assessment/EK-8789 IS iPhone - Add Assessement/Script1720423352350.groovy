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

CucumberKW.runFeatureFile('Include/features/EK-8789 IS iPhone - Add Assessement.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '21ui', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

// this first tap is just to remove the key board since its blocking.
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Wound'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Assessment'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - New Assessment'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - WOUND EDGE'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Attached'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - PERI WOUND SKIN'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Oedema'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - PAIN'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeSlider - 0'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - DRAINAGE'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Minimum'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - ODOR'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Malodorous'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - PRESSURE INJURY STAGING'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Stage 1 i'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Wound Edge Attached'), 'Wound Edge Attached')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Peri Wound Skin Oedema'), 'Peri Wound Skin Oedema')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Pain At rest 0 - With movement 0 - At night 0'), 
    'Pain At rest: 0 - With movement: 0 - At night: 0')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Drainage Minimum  Clear, thin, watery (Serous)'), 
    'Drainage Minimum / Clear, thin, watery (Serous)')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Odor Malodorous'), 'Odor Malodorous')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Pressure Injury Staging Stage 1'), 
    'Pressure Injury Staging Stage: 1')

Mobile.verifyElementText(findTestObject('Object Repository/Draft 101/XCUIElementTypeOther - Miscellaneous Was QoL assessment performed NA'), 
    'Miscellaneous Was QoL assessment performed? N/A')

Mobile.tap(findTestObject('IOS/Wound Assessment/Edit assessment/XCUIElementTypeOther - Back'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Back 2'), 30)

Mobile.tap(findTestObject('IOS/Wound Assessment/Add Assessment/XCUIElementTypeOther - Back 3'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Add Wound/XCUIElementTypeOther - x'), 30)

