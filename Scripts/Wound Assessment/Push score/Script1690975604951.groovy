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

Mobile.scrollToText('81ui')

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - MRN 81ui'), 30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - Wound 1 Pressure Injury'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - Assessment'), 30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.ImageView - add assessment'), 30)

Mobile.scrollToText('NOTES')

Mobile.verifyElementExist(findTestObject('Wound Assessment/Push score/android.widget.TextView - PUSH SCORE'), 30)

Mobile.tap(findTestObject('Wound Assessment/Push score/android.widget.TextView - PUSH SCORE'), 30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - OK'), 30)

Mobile.verifyElementExist(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - TOTAL 5'), 
    30)

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.ImageView - x'), 30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Wound Assessment/Push score/android.widget.TextView - Wound 2 Trauma'), 30)

Mobile.tap(findTestObject('Wound Assessment/Push score/android.widget.TextView - Assessment'), 30)

Mobile.tap(findTestObject('Wound Assessment/Push score/android.widget.ImageView - add assessment'), 30)

Mobile.verifyElementNotExist(findTestObject('Wound Assessment/Push score/android.widget.TextView - PUSH SCORE'), 30)

Mobile.tap(findTestObject('Wound Assessment/Push score/android.widget.ImageView - x'), 30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

