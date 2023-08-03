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

WebUI.callTestCase(findTestCase('Navigation/LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Welcome to your dashboard/a_Account'))

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Profile/span_Wallet'))

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/button_Fund Wallet'))

WebUI.setText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/input__form-control input-bordered w-100'), 
    '5000')

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/span_Minimum of 50000'), 
    0)

WebUI.setText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/input__form-control input-bordered w-100'), 
    '50000')

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/button_Continue'))

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/div_Card'))

WebUI.callTestCase(findTestCase('Account/Enter Card Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/td_TCH-9s-UkzbCs'))

WebUI.verifyElementText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/span_NGN   50,000.00'), 
    'NGN 50,000.00')

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/i__far fa-times-circle'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

