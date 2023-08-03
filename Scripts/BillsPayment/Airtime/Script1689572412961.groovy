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

WebUI.setEncryptedText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 'jdIGyv7YwfwhQA3h4NNgrQ==')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye fs-24'))

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/button_Sign In'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Welcome to your dashboard/a_Bill Payments'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Welcome to your dashboard/a_Mobile  Utility'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_identity-test'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '08175885645')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input_NGN_form-control input-bordered w-100'), 
    '2000')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Recharge Airtime'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_Airtime top up successful'), 
    'Airtime top up successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_192,069.57'), 
    '192,069.57')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_192,069.57'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_identity-test_1'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_Phone Number_vti__flag ng'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/strong_Uganda'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '0704901261')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input_NGN_form-control input-bordered w-100'), 
    '2000')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Recharge Airtime'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_Airtime top up successful'), 
    'Airtime top up successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_Phone Number_vti__flag ng_1'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_United Kingdom 44'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '07432631486')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Recharge Airtime'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_Invalid amount provided'), 
    'Invalid amount provided')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Mobile Data'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_identity-test_1_2'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_NGN_1'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Get Data Plans'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_successfully fetched dataPlans'), 
    'successfully fetched dataPlans')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_9MO-100MB-1 100MB 1day'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Top Up Data'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_Data top up successful'), 
    'Data top up successful')

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Data top up successful'), 
    'Data top up successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_Phone Number_vti__flag ng_1_2'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/strong_Uganda'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '0704901261')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Get Data Plans'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/p_Oops an error occur'), 
    'Oops! an error occur')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_Phone Number_vti__flag ug'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/strong_United States'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone'), 
    '3468121444')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Get Data Plans'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Utility Bills'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_identity-test_1_2_3'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Cable TV'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_DsTv'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100'), 
    '1201992811')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_N14200  2Months'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_N7100  1Month'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 7100'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 7,100.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_DsTv'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Gotv'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100'), 
    '908766550')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Loading_1'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_GOtv Smallie - monthly'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_N1800  2Months'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 1800'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 1,800.00'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 1,800.00andwo_ae3290'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Startimes'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100'), 
    '9880909880')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Classic (Antenna) - Monthly'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_N3100  1Month'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Pay 3100          Pay Bills        This_372bcd'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Cable TV'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Internet'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Loading.            Smile              _a842a5'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Smile'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_SML-1GB-300 - 300  1DAY'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08128229199')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 300'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 300.00andwoul_432761'), 
    0)

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 300.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Spectranet'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_1000'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08128819111')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 1000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 1,000.00andwo_10ec8b'), 
    0)

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 1,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Internet               Loading.        _df7016'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Electricity'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Abuja Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '1229100291')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08172662733')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 2000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/span_Pay NGN 2,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Eko Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '1201992811')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 3000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 3,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Enugu Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '0129910291')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 2000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 2,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Ibadan Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '1200192110')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 3000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 3,000.00andwo_2fa493'), 
    0)

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 3,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Ikeja Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '1200199921')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 3000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 3,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Jos Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4_5'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '0812011021')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175884744')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 3000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 3,000.00andwo_2fa493'), 
    0)

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 3,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Jos Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4_5_6'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '1002911029')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '3000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175884933')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 3000'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_This Service would costNGN 3,000.00andwo_2fa493'), 
    0)

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 3,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Kaduna Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4_5_6_7'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '8911920022')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885432')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 2000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 2,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div_Loading_1_2'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Kano Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4_5_6_7_8'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '8099192811')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '1000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175885454')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 1000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 1,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Port-Harcourt Disco'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_prepaid_1_2_3_4_5_6_7_8_9'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1'), 
    '0814883883')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered w-100_1_2'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__phone_number'), 
    '08175884933')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay 2000'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Pay NGN 2,000.00'))

WebUI.verifyElementText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/h5_Bill Payment Successful'), 
    'Bill Payment Successful')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Done'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/a_Betting'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_identity-test_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15_16_17_18_19_20_21_22_23_24_25'))

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/li_Bet9ja'))

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '1230987654')

WebUI.setText(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1'), 
    '3000')

WebUI.click(findTestObject('Object Repository/BillsPayment_OR/Page_Blusalt - Start Testing your services/button_Top Up Billing Account'))

