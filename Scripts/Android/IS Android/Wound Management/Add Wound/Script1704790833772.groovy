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
import org.openqa.selenium.NoSuchElementException as NoSuchElementException

WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.EditText - Search by Name, MRN'), 
    '78ui', 30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Current site'), 
    30)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Current site (1)'), 
    30)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.view.ViewGroup'), 30)

Mobile.verifyElementExist(findTestObject('Android/IS/Wound Management/Add Wound/android.widget.TextView - Click  above to add a wound'), 
    0)

// Define the locator strategy and value of the element you want to check
String locatorStrategy = 'xpath'

String locatorValue = '//android.widget.TextView[@text=\'Click above to add a wound\']'

// Try to interact with the element
try {
    // Check if the element exists
    if (Mobile.verifyElementExist(findTestObject('Android/IS/Wound Management/Add Wound/android.widget.TextView - Click  above to add a wound'), 10)) {
        // If the element exists, do this
        println('Element exists. Performing action...')

        // Perform your action here
        Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.ImageView - add wound'), 
            30)

        Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Next'), 
            30)

        Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Add Wound/android.widget.TextView - Save'), 
            30)

        Mobile.pressBack()

        Mobile.tap(findTestObject('Object Repository/Android/IS/Wound Management/Lock Wound/android.widget.ImageView - x'), 
            30) // If the element does not exist, do this
        // Perform alternative action or skip
    } else {
        println('Element does not exist.')
    }
}
catch (NoSuchElementException e) {
    println('Element not found.')
} // If the element is not found, do this
// Perform alternative action or skip

