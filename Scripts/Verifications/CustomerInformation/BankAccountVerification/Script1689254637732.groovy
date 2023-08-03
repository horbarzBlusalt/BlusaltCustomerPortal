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

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Welcome to your dashboard/a_Customer Information'))

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/a_Bank Account Verification'))

WebUI.setText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/phone_input'), 
    '08175885645')

WebUI.setText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/account_number_input'), 
    '3095386219')

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_bank'))

WebUI.setText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/input__vs__search'), 
    'Firs')

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/li_First Bank of Nigeria'))

WebUI.click(findTestObject('NIN_OR/Page_Blusalt - Start Testing your services/select_an_application'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/identity-test'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_currency'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/span_Verify Number'))

WebUI.verifyElementText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/p_Bank Account Verification Completed Successfully'), 
    'Bank Account Verification Completed Successfully')

WebUI.verifyElementText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/span_VERIFIED'), 
    'VERIFIED')

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/i_Bank Account Verification Response_la la-close'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

