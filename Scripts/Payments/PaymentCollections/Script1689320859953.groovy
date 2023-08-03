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

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Welcome to your dashboard/a_PaymentCollections'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/input_Product Page_form-control input-borde_d651bc'), 
    'TPP-M7USTiSso')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/button_Filter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/td_TPP-M7USTiSso'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/td_TPP-M7USTiSso'), 
    'TPP-M7USTiSso')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/td_TPP-M7USTiSso'))

WebUI.verifyElementText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Information/p_My page'), 
    'My page')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Information/span_Page Transactions'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Transactions/button_Update Collection'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Transactions/input__to'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Transactions/span_15'))

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Transactions/input__form-control input-bordered w-100'), 
    '200')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - Payment Page Transactions/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/p_payment page successfully updated'), 
    0)

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/button_Create Collection'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/div_Basic PageCreate a simple one time paym_7b40ea'))

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100'), 
    'ZoneTest')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100_1'), 
    'Test Payment Page')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100_1_2'), 
    '50000')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/li_Joro'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/input__to'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_Jul 2023'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_2023'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_2027'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_February'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_10'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_Yes'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/div_Click to upload fileBrowse'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/p_payment page created successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/img'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_Copy'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment collection/span_Payouts'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/div_Filter By'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/li_Successful'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/button_Filter'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/td_06-07-2023064655 pm'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payout detials/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your wallet payment links/span_Disputes'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/div_Filter By'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/div_Pending'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/li_Abandoned'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/button_Filter'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/td_Abandoned'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/button_View'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/button_Download Proof'))

WebUI.verifyElementText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/p_Dispute Details'), 
    'Dispute Details')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/button_Create Payment Dispute'))

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100'), 
    'George')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1'), 
    'Ben')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2'), 
    'geben@yopmail.com')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3'), 
    '08172881911')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3_4'), 
    '100000')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3_4_5'), 
    'TRY10001991')

WebUI.setText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/textarea__form-control input-bordered w-100'), 
    'I need to pay this')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/label_Browse'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/span_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/h5_Payment Dispute Created Successfully'), 
    'Payment Dispute Created Successfully')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/button_Done'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/button_View'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/button_Update Status'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/div_pending'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/li_resolved'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/h5_Dispute Status Updated Successfully'), 
    'Dispute Status Updated Successfully')

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/button_Done'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View payment dispute details/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/PaymentCollections_OR/Page_Blusalt - View all your payment disputes/span_Refunds'))

