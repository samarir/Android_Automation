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

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView - Menu'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Settings'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Sync Mode'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Online only'), 
    30)

Mobile.verifyElementText(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - No temporary local storage. Cannot use app without internet connection. Proceed'), 
    'No temporary local storage. Cannot use app without internet connection. Proceed?')

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.Button - CONFIRM'), 
    30)

Mobile.scrollToText('MRN: 12ui')

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - MRN 12ui'), 
    30)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.toggleWifi('off', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Next'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Save'), 
    30)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.view.ViewGroup'), 30)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IS/Hard to find elements/android.view.ViewGroup - Assessment'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - DATE'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - WOUND EDGE'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Attached'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - PERI WOUND SKIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Oedema'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - PERI WOUND SKIN (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - PAIN'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.SeekBar - 0.0'), 
    30)

Mobile.tap(findTestObject('IS/Synchronization and Offline Use/Online mode/android.widget.TextView - PAIN'), 30)

Mobile.tap(findTestObject('IS/Synchronization and Offline Use/Online mode/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Moderate'), 
    30)

Mobile.tap(findTestObject('IS/Synchronization and Offline Use/Online mode/android.widget.TextView - DRAINAGE'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - ODOR'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Malodorous'), 
    30)

Mobile.tap(findTestObject('IS/Synchronization and Offline Use/Online mode/android.widget.TextView - ODOR'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - PRESSURE INJURY STAGING'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.view.ViewGroup (1)'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Save (1)'), 
    30)

Mobile.pressBack()

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('IS/Hard to find elements/android.view.ViewGroup - Treatement'), 30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.ImageView (2)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Next (1)'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - CLEANSING'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Acetic Acid'), 
    30)

Mobile.tap(findTestObject('Object Repository/IS/Synchronization and Offline Use/Online mode/android.widget.TextView - Save (2)'), 
    30)

Mobile.pressBack()

Mobile.pressBack()

Mobile.pressBack()

Mobile.toggleWifi('on', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

