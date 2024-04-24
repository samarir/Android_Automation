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

import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

CucumberKW.runFeatureFile('Include/features/EK-8735 IS iPhone - Search Patient.feature')

WebUI.callTestCase(findTestCase('IOS/User Management/EK-8491 IS iPhone - Sign in'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeTextField - Search by Name, MRN'), 
    '987', 30)

Mobile.verifyElementText(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Current site'), 
    'Current site')

//Mobile.verifyElementExist(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Litee, Editt 18042024 22M    MRN 987 No Consent'), 30)
// Define the regular expression pattern
String regexPattern = ".*MRN: 987.*"

// Find all elements matching the regex pattern
List<TestObject> elements = Mobile.tap(findTestObjects("Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - Litee, Editt 18042024 22M    MRN 987 No Consent", ConditionType.MATCHES_REGEX, regexPattern, GlobalVariable.DEFAULT_MOBILE_TIMEOUT), 30).

Mobile.tap(findTestObject('Object Repository/IOS/Patient Management/Search Patient/XCUIElementTypeOther - x'), 30)

