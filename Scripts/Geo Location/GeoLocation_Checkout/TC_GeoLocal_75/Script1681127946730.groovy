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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.LiverPoolURL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('HomePage/Iniciar sesión_hp'))

WebUI.callTestCase(findTestCase('CommonMethods/loginFromHomePage'), [('username') : GlobalVariable.Username, ('password') : GlobalVariable.Password], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage/Categoras_hp'))

WebUI.click(findTestObject('HomePage/L1Odtaqab_hp'))

WebUI.click(findTestObject('HomePage/L2_hp'))

WebUI.click(findTestObject('HomePage/FirstProduct_plp'))

WebUI.click(findTestObject('pdp/BuyNow_pdp'))

not_run: WebUI.click(findTestObject('pdp/AddToCart_pdp'))

not_run: WebUI.click(findTestObject('HomePage/Cart_header'))

not_run: WebUI.click(findTestObject('CLP/CheckoutButton_Cart'))

WebUI.click(findTestObject('Checkout/ChangeAddress_Checkout'))

WebUI.click(findTestObject('Checkout/ClickNCollectAddressPopup_Checkout'))

WebUI.click(findTestObject('Checkout/ContinueButtonClickNCollectPopup_Checkout'))

WebUI.scrollToElement(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.verifyElementPresent(findTestObject('Checkout/EDD_Checkout'), 0)

WebUI.click(findTestObject('HomePage/Liverpool Logo2'))

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

