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

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/a_Know Your Customer (Advance)'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_bank_adv'))

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/li_Access Bank'))

WebUI.setText(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/enter_account_number_input'), '1505857304')

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_an_application'))

WebUI.click(GlobalVariable.select_application_dropdown_s2)

WebUI.click(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/span_Verify'))

WebUI.verifyElementText(findTestObject('Object Repository/CustomerInfo_OR/Page_Blusalt - Start Testing your services/p_User Info Retrieved'), 
    'User Info Retrieved')

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

