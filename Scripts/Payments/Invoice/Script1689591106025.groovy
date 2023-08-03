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

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Welcome to your dashboard/a_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/button_Create Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div__selected'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div_Sade Frank (sadefrankyopmail.com)'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Ok'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/img_Billing Address_pointer'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input_Address_form-control input-bordered w-100'), 
    '23 Ademola Saheed Street')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div__vs__selected-options'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__vs__search'), 'Nig')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/li_Nigeria'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__vs__search'), 'Nig')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div__vs__selected-options_1'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__vs__search_1'), 'Lag')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/li_Lagos'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__vs__search_1'), 'Lag')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/h5_Customer Address Updated Successfully'), 
    'Customer Address Updated Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Create Invoice'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/h5_Invoice Created Successfully'), 
    'Invoice Created Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/img'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/span_Edit'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div_Total Cost (NGN)_selected'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div_NHIS Plan'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/textarea__form-control input-bordered w-100'), 
    'This is a customers\' note')

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/textarea__form-control input-bordered w-100_1'), 
    'These are the terms')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/div_2023SepSuMoTuWeThFrSa                  _be4082'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__due_date'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/input__issued_date'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/span_19'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_OK (1)'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Update Invoice'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/h5_Invoice Updated Successfully'), 
    'Invoice Updated Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/img'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/span_Duplicate'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Preview Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Save Invoice'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/h5_Invoice Duplicated Successfully'), 
    'Invoice Duplicated Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/img'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/span_Issue'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/button_Issue'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/h5_Invoice Issued Successfully'), 
    'Invoice Issued Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Invoice List/span_Products'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/img_NGN  20,000.00_pointer mr-4'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/textarea__form-control input-bordered w-100'), 
    'Let the poor breath - Tinubu 2023')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/h5_Product Updated Successfully'), 
    'Product Updated Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Create Product'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/input__form-control input-bordered w-100'), 
    'Train Prod')

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/input_Loading_amount'), '23000')

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/textarea__form-control input-bordered w-100'), 
    'It is an imported product')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/div_Click to upload fileBrowse'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/label_Browse'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/h5_Product Added Successfully'), 
    'Product Added Successfully')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Done'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/img_NGN  20,000.00_pointer mr-4'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/button_Close'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Items/span_Drafts'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Drafts/h5_Filter By'))

WebUI.setText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Drafts/input_Filter By_form-control input-bordered w-100'), 
    'INV-47-2023-004032')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Drafts/button_Filter'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Drafts/img'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - Drafts/span_Edit'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/button_Save Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/span_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/p_issued date must be greater than now'), 
    'issued date must be greater than now')

WebUI.click(findTestObject('Object Repository/Invoice_OR/Page_Blusalt - New Invoice/img_My Profile_pointer'))

WebUI.closeBrowser()

