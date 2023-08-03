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

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - Welcome to your dashboard/a_Subscriptions'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_Filter By'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__from'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/span_18'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__to'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/span_18'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Filter'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/td_Yanga Plan'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View subscription details/li_AmountNGN 20,000.00'), 
    'Amount\n\t\t\t\t\t\tNGN 20,000.00')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View subscription details/a_Subscriber Information'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View subscription details/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/span_Plans'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/input_Submit_form-control input-bordered w-100'), 
    'NHIS Plan')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/button_Filter'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/span_NHIS Plan'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/h4_NHIS Plan'), 
    'NHIS Plan')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Subscribe'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div__vs__selected-options_1_2'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__vs__search'), 'Oril')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/li_Oriloye Endurance ( 0830013283  )'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__vs__search'), 'Oril')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Coupon_w-100 border-0'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_REALACT100 ( Percentage )'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Submit'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/p_Coupon is not available for the plan'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/p_Coupon is not available for the plan'), 
    'Coupon is not available for the plan')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/span_Card'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__w-100 border-0'), 
    'Aki')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_Akin Akinsowon (akinleadremit.com)'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_Add New Card'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Card Number_form-control input-border_2ee32c'), 
    '5204 7300 0000 2662')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Card Name_form-control input-bordered w-100'), 
    'Blusalt')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Expiry Date_form-control input-border_556bf2'), 
    '01/2025')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_CVC_form-control input-bordered w-100'), 
    '100')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Submit'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Error_iziToast-close'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/img_Coupon_mr-1'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/h5_Subscription Successfully'), 
    'Subscription Successfully')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Done'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/button_Create Plan'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/input__form-control input-bordered w-100'), 
    'Freedom OPlan')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/input__form-control input-bordered w-100_1'), 
    '50000')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/li_one-time'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/input__form-control input-bordered w-100_1_2'), 
    'Test freedom')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/input_Enter Setup Amount ( Optional )_form-_22acf3'), 
    '1000')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/h5_Plan Created Successfully'), 
    'Plan Created Successfully')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/button_Done'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription plans/span_Coupons'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/input_Submit_form-control input-bordered w-100'), 
    'WILL220')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/button_Filter'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/img_Flat_pointer mr-4'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/li_Freedom OPlan'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/h5_Coupon Updated Successfully'), 
    'Coupon Updated Successfully')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/button_Done'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your coupons/span_Tax'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/button_Create Tax'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/input__form-control input-bordered w-100'), 
    'YALE TAX')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/input__form-control input-bordered w-100_1'), 
    '10')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/li_Included'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/h5_Tax Created Successfully'), 
    'Tax Created Successfully')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/button_Done'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/img_Submit_pointer'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/button_Delete'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/button_Done'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View tax/span_Trails'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription trails/div_Filter By'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription trails/li_False'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription trails/button_Filter'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View all your subscription trails/button_Clear'))

WebUI.closeBrowser()

