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

WebUI.navigateToUrl('https://staging.blusalt.net/login')

WebUI.setText(findTestObject('Page_Blusalt - Login to blusalt/input_EmailPhone-number_form-control input-_55be30'), 'farida@blusalt.net')

WebUI.setEncryptedText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 'FQNXsTQU5BA=')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.setText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered_1'), 'Blusalt22')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_PaymentCollections'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/img'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_Copy'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Create Colection'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/p_Create a simple one time payment page'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_This field cannot be empty'), 
    'This field cannot be empty')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100'), 
    'Droid Payx')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100_1'), 
    'Payment link for droids')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/div_Loading'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/li_NGN'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__form-control input-bordered w-100_1_2'), 
    '20000')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/div_Loading_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/li_Oriloye'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__to'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/label_Browse'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/p_payment page created successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input_Product Page_form-control input-borde_d651bc'), 
    'D_5oAx7ve')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/b_Fine test'), 
    'Fine test')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/img_Clear_ml-3 pointer'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Clear'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__from'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/input__to_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span__1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Filter'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/button_Clear'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment collection/span_Payouts'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your wallet payment links/span_Disputes'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/button_Create Payment Dispute'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/span_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100'), 
    'Bayo')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1'), 
    'Taiweo')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2'), 
    'btao@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3'), 
    '08128829282')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3_4'), 
    '30000')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/input__form-control input-bordered w-100_1_2_3_4_5'), 
    'tet119292jj2ji8292')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/textarea__form-control input-bordered w-100'), 
    'I dont know')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/label_Browse'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/h5_Payment Dispute Created Successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/button_Done'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all your payment disputes/span_Refunds'))

