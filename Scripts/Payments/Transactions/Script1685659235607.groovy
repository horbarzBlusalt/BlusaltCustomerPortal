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

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Welcome to your dashboard/a_Transactions'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/input_Loading_form-control input-bordered w-100'), 
    'TCH-Ph32x9Top')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/td_TCH-Ph32x9Top'), 
    'TCH-Ph32x9Top')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/button_Clear'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/input__from'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_16'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/input__to'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_23'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/button_Filter'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/button_Clear'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallets Transactions/span_Collections'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/input_Loading_form-control input-bordered w-100'), 
    'TCH-iesbQ56p6')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/td_TCH-iesbQ56p6'), 
    'TCH-iesbQ56p6')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/td_TCH-iesbQ56p6'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/span_CARD TCH-iesbQ56p6'), 
    'CARD: TCH-iesbQ56p6')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/i__far fa-times-circle'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Collection Transactions/span_Reserved Account'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - reserved/span_Transfers'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/input_Loading_form-control input-bordered w-100'), 
    'TRN-5JEGEHD6ECII4D4J95AED5F04I32J0KC')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/td_TRN-5JEGEHD6ECII4D4J95AED5F04I32J0KC'), 
    'TRN-5JEGEHD6ECII4D4J95AED5F04I32J0KC')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/td_TRN-5JEGEHD6ECII4D4J95AED5F04I32J0KC'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/span_Approved or completed successfully'), 
    'Approved or completed successfully')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/i__far fa-times-circle'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Bank Transafers/span_Remittance'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Remittance transactions/span_Subscriptions'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/input_Loading_form-control input-bordered w-100'), 
    'TRN-K2D6FABAC7GK4D28HC5E13GF983G924E')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/button_Filter'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/td_TRN-K2D6FABAC7GK4D28HC5E13GF983G924E'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/span_Merchant Transfer'), 
    'Merchant Transfer')

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/span_Successful'), 
    'Successful')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/i__far fa-times-circle'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - Wallet Subscriptions/span_Invoices'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/input_Loading_form-control input-bordered w-100'), 
    'TCH-QL_o6nJ8t')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/button_Filter'))

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/td_TCH-QL_o6nJ8t'))

WebUI.verifyElementText(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/span_Successful'), 
    'Successful')

WebUI.click(findTestObject('Object Repository/TransactionsReport_OR/Page_Blusalt - invoices transactions/i__far fa-times-circle'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

