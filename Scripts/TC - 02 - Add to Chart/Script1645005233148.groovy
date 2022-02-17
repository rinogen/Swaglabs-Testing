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

switch (Product) {
    case 'Backpack':
        Mobile.scrollToText('Sauce Labs Backpack', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Sauce Labs Backpack'), 0)

        break
    case 'Bike Light':
        Mobile.scrollToText('Sauce Labs Bike Light', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Sauce Labs Bike Light'), 0)

        break
    case 'Tshirt Bold':
        Mobile.scrollToText('Sauce Labs Bolt T-Shirt', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Sauce Labs Bolt T-Shirt'), 0)

        break
    case 'Jacket':
        Mobile.scrollToText('Sauce Labs Fleece Jacket', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Sauce Labs Fleece Jacket'), 0)

        break
    case 'Onesies':
        Mobile.scrollToText('Sauce Labs Onesie', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Sauce Labs Onesie'), 0)

        break
    case 'Tshirt Red':
        Mobile.scrollToText('Test.allTheThings() T-Shirt (Red)', FailureHandling.STOP_ON_FAILURE)

        Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - Test.allTheThings() T-Shirt (Red)'), 0)

        break
}

Mobile.swipe(360, 1460, 360, 1000)

Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - ADD TO CART'), 0)

Mobile.tap(findTestObject('Add to Chart/android.widget.TextView - BACK TO PRODUCTS'), 0)

Mobile.tap(findTestObject('Add to Chart/android.widget.ImageView - btnYourChart'), 0)

Mobile.scrollToText('CHECKOUT', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add to Chart/android.view.ViewGroup  - btnCheckOut'), 0)

