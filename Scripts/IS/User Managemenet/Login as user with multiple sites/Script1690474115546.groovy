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

Mobile.startApplication(GlobalVariable.APK, false)

Mobile.setText(findTestObject('Login Page/Username input'), GlobalVariable.LoginCreds.get('siteuser'), 30)

Mobile.setText(findTestObject('Login Page/Password input'), GlobalVariable.LoginCreds.get('password'), 30)

Mobile.tap(findTestObject('Login Page/Sign in'), 30)

Mobile.tap(findTestObject('Object Repository/Draft/android.widget.TextView - OK'), 30)


Mobile.tap(findTestObject('Login Page/Sites/Katalon'), 30)

Mobile.verifyElementExist(findTestObject('Patient Directory/Add New Patient'), 30)

Mobile.tap(findTestObject('Patient Directory/Patient'), 30)

Mobile.tap(findTestObject('Wound Summary/Right Menu ( Wound Summary)'), 30)

Mobile.verifyElementExist(findTestObject('Wound Summary/Patient Menu/Freeze patient'), 30)

Mobile.verifyElementExist(findTestObject('Wound Summary/Patient Menu/Delete patient'), 30)

Mobile.tap(findTestObject('Wound Summary/Patient Menu/Cancel'), 30)

Mobile.pressBack()

Mobile.tap(findTestObject('Patient Directory/Left Menu'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites ( from menu)/site user'), 30)

Mobile.tap(findTestObject('Patient Directory/Patient'), 30)

Mobile.tap(findTestObject('Wound Summary/Right Menu ( Wound Summary)'), 30)

Mobile.verifyElementExist(findTestObject('Wound Summary/Patient Menu/Edit patient'), 30)

Mobile.verifyElementNotExist(findTestObject('Wound Summary/Patient Menu/Delete patient'), 30)

Mobile.verifyElementNotExist(findTestObject('Wound Summary/Patient Menu/Freeze patient'), 30)

Mobile.tap(findTestObject('Wound Summary/Patient Menu/Cancel'), 30)

Mobile.pressBack()

Mobile.tap(findTestObject('Patient Directory/Left Menu'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites'), 30)

Mobile.tap(findTestObject('Patient Directory/Account Menu (left menu)/Sites ( from menu)/Test1'), 30)

Mobile.verifyElementNotExist(findTestObject('Patient Directory/Add New Patient'), 30)

