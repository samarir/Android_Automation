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

Mobile.setText(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.EditText - Search by Name, MRN'), 
    '21ui', 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Current site'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Current site (1)'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - Patient'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - Patient'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - Wound'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - Wound'), 30)

Mobile.tap(findTestObject('Android/IS/Data Preparation/Wound Assessment/android.view.ViewGroup - Assessment'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.ImageView - add Assessement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.ImageView - add Assessement'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - WOUND EDGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Rolled'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PERI WOUND SKIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Oedema'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PERI WOUND SKIN (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PAIN'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.SeekBar - 0.0'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PAIN'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Minimum'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PRESSURE INJURY STAGING'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup - stage II'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - PRESSURE INJURY STAGING'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - ODOR'), 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - None'), 30)

Mobile.tap(findTestObject('Android/IS/Wound Assessment/Add Assessment/android.widget.TextView - Save'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.view.ViewGroup (1)'), 
    30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Assessment/Add Assessment/android.widget.ImageView - x'), 30)

