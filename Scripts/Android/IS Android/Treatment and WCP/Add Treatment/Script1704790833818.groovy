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

Mobile.scrollToText('MRN: 24ui')

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - MRN 24ui'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.view.ViewGroup - Wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.view.ViewGroup - Wound'), 30)

Mobile.tap(findTestObject('Android/IS/Hard to find elements/android.view.ViewGroup - Treatment'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.ImageView - Add Treatement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.ImageView - Add Treatement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - CLEANSING'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Acetic Acid'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - OINTMENTS'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Zinc Oxide'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Acetic Acid (1)'), 
    'Acetic Acid')

Mobile.verifyElementText(findTestObject('Object Repository/Android/IS/Treatment and WCP/Add Treatment/android.widget.TextView - Zinc Oxide (1)'), 
    'Zinc Oxide')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

