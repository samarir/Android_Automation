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

Mobile.setText(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.EditText - Search by Name, MRN'), 
    '86ui', 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Current site'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Current site (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.view.ViewGroup'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Management/Edit Wound/android.view.ViewGroup - wound'), 
    0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.view.ViewGroup - wound'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.ImageView - menu'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Edit wound'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.view.ViewGroup - secondary wound type'), 
    0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Stage III'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.view.ViewGroup - facility acquired wound'), 
    0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Next'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Additional description (Optional)'), 
    0)

Mobile.setText(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.EditText - description'), 'Test Description', 
    0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - OK'), 0)

Mobile.tap(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Save'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Wound Management/Edit Wound/android.widget.TextView - Test Description'), 
    'Test Description')

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Wound Management/Lock Wound/android.widget.ImageView - x'), 0)

