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

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - Welcome to your dashboard/a_Payment Link'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Create Payment Link'))

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input__form-control input-bordered w-100'), 
    'feDeral Payment')

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input__form-control input-bordered w-100_1'), 
    'Test payment')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/li_Sade Frank ( 3086088241  )'))

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input_Amount (Optional)_form-control input-_2868ad'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input_Customize Your Link (Optional)_form-c_02ade4'), 
    'federal')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/li_akhabue uche unose'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Submit'))

WebUI.verifyElementText(findTestObject('PaymentLink_OR/Page_Blusalt - View payment link details/notification_msg'), 'Reference exist already')

WebUI.verifyElementText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/h5_Payment Link Created Successfully'), 
    'Payment Link Created Successfully')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Done'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/img'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/span_View Details'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/button_Update'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/button_Update'))

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/input__form-control input-bordered w-100'), 
    'feDeral Payment Pro')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/h5_Payment Link Updated Successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/button_Done'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View payment link details/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/img'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/span_Send Payment Link'))

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input__phoneNumber0'), 
    '08175885645')

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input__form-control input-bordered w-100_1_2'), 
    'oabioye@yopmail.com')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div_Payment Link Sent to the following Email(s)'), 
    'Payment Link Sent to the following Email(s):')

WebUI.verifyElementText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div_Payment Link Sent to the following Phon_a81337'), 
    'Payment Link Sent to the following Phone Number(s):')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Done'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/img'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/span_Copy Payment Link'))

WebUI.verifyElementPresent(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/p_Payment Link Copied'), 
    0)

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/img'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/span_Edit Payment Link'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Close'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div_Filter By'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/div__vs__selected-options_1_2'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/li_True'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Filter'))

WebUI.setText(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/input_Submit_form-control input-bordered w-100'), 
    'tesgn')

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Filter'))

WebUI.click(findTestObject('Object Repository/PaymentLink_OR/Page_Blusalt - View all your wallet payment links/button_Clear'))

