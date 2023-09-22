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

Mobile.scrollToText('MRN: 09ui', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - MRN 09ui'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.view.ViewGroup - Wound'), 30)

Mobile.tap(findTestObject('IS/Hard to find elements/android.view.ViewGroup - Treatement'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.ImageView - Edit Treatement'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - Next'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - DRESSING'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - Activated Charcoal (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - Save'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - Activated Charcoal'), 
    'Activated Charcoal')

Mobile.verifyElementText(findTestObject('Object Repository/IS/Treatment and WCP/Edit Treatment/android.widget.TextView - DRESSING (1)'), 
    'DRESSING')

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

