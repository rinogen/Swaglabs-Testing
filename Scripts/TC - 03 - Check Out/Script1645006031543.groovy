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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.setText(findTestObject('Check Out/android.widget.EditText - First Name', [('FirstName') : FirstName]), FirstName, 
    0)

Mobile.setText(findTestObject('Check Out/android.widget.EditText - Last Name', [('LastName') : LastName]), LastName, 0)

Mobile.setText(findTestObject('Check Out/android.widget.EditText - Zip - Postal Code', [('Code') : Code]), Code, 0)

Mobile.tap(findTestObject('Check Out/android.view.ViewGroup - btnContinue'), 0)

Mobile.scrollToText('FINISH')

Mobile.tap(findTestObject('Check Out/android.view.ViewGroup - btnFinish'), 0)

Mobile.tap(findTestObject('Check Out/android.view.ViewGroup - btnBackHome'), 0)

