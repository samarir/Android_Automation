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

CucumberKW.runFeatureFile('Include/features/EK-9140 IS iPhone - Add treatment.feature')

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '24ui', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

// this first tap is just to remove the key board since its blocking.
Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tapAtPosition(361, 503)

Mobile.delay(2)

Mobile.tap(findTestObject('IOS/Data Report/XCUIElementTypeOther - Patient'), 30)

Mobile.tap(findTestObject('IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Wound'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Treatment'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Add treatment'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Next'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - OINTMENTS'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Paraffin'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - DRESSING'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Activated Charcoal'), 
    30)

Mobile.tap(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - OINTMENTS Paraffin'), 
    'OINTMENTS Paraffin')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - DRESSING Activated Charcoal'), 
    'DRESSING Activated Charcoal')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeStaticText - Treatment record'), 
    'Treatment record')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Dressing Yes (per protocol)'), 
    'Dressing Yes (per protocol)')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Debridement None'), 
    'Debridement None')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeOther - Debridement'), 
    'Debridement')

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Treatment and WCP/Add treatment/XCUIElementTypeStaticText - Wound care protocol'), 
    'Wound care protocol')

Mobile.tap(findTestObject('IOS/Treatment and WCP/Edit Treatment/XCUIElementTypeOther - Press back 0'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Press Back'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Edit Wound/XCUIElementTypeOther - Press Back 2'), 30)

Mobile.tap(findTestObject('Object Repository/IOS/Wound Management/Add Wound/XCUIElementTypeOther - x'), 30)

