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

Mobile.tap(findTestObject('Object Repository/Wound Management/Wound Summary/android.view.ViewGroup - wound1'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - Wound, List'), 
    'Wound, List')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - Wound 1 Trauma'), 
    'Wound 1: Trauma')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - Active'), 
    'Active')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - 14082023'), 
    '14/08/2023')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - HeadNeck, Front'), 
    'Head/Neck, Front')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - Test description'), 
    'Test description')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - 3D'), 
    '3D')

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Management/Wound Summary/android.view.ViewGroup'), 30)

Mobile.verifyElementExist(findTestObject('Wound Management/Wound Summary/android.widget.ImageView'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - 3D (1)'), 
    '3D')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - WOUND SIZE'), 
    'WOUND SIZE')

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Wound Summary/android.widget.TextView - COLOR COMPOSITION'), 
    'COLOR COMPOSITION')

Mobile.verifyElementExist(findTestObject('Hard to find elements/android.view.ViewGroup - Assessment'), 30)

Mobile.verifyElementExist(findTestObject('Hard to find elements/android.view.ViewGroup - Treatement'), 30)

Mobile.verifyElementExist(findTestObject('Hard to find elements/android.view.ViewGroup - Messaging'), 30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Wound Management/Unlock wound/android.widget.ImageView - x'), 30)

