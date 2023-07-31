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

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.ImageView - Menu'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Settings'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - English'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Deutsch'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.view.ViewGroup'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Geschlecht'), 
    'Geschlecht')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Geburtstag'), 
    'Geburtstag')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Alter'), 
    'Alter')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Zustimmung'), 
    'Zustimmung')

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.ImageView - Back'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.ImageView - Menu (1)'), 30)

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Seite'), 
    'Seite')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Offene Telegesundheit'), 
    'Offene Telegesundheit')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Hilfe'), 
    'Hilfe')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - ber uns'), 
    'Über uns')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Einstellungen'), 
    'Einstellungen')

Mobile.verifyElementText(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Ausloggen'), 
    'Ausloggen')

Mobile.tap(findTestObject('Menu and other services/Language/android.widget.TextView - Einstellungen'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - Deutsch (1)'), 30)

Mobile.tap(findTestObject('Object Repository/Menu and other services/Language/android.widget.TextView - English (1)'), 30)

