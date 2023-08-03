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

WebUI.click(findTestObject('Subscription_OR/selectType'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/li_recurring'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Filter'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_New Subscription'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/selectPlan'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/li_Yanga Plan'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/selectWallet'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__vs__search'), 'Ab')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/li_Obaloluwa Abioye ( 2725919671  )'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__vs__search'), 'Ab')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/p_Low funds in your wallet'), 
    'Low funds in your wallet')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/span_Card'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div__selected'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input__w-100 border-0'), 
    'Abio')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_Obaloluwa Abioye (abioyeoblusalt.net)'))

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/div_Add New Card'))

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Card Number_form-control input-border_2ee32c'), 
    '5204 7300 0000 2662')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Card Name_form-control input-bordered w-100'), 
    'Blusalt')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_Expiry Date_form-control input-border_556bf2'), 
    '01/2025')

WebUI.setText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/input_CVC_form-control input-bordered w-100'), 
    '100')

WebUI.scrollToElement(findTestObject('Subscription_OR/Page_Blusalt - View plan details/button_subscription_submit'), 0)

WebUI.click(findTestObject('Subscription_OR/Page_Blusalt - View plan details/button_subscription_submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/h5_Subscription Successfully'), 
    'Subscription Successfully')

WebUI.click(findTestObject('Object Repository/Subscription_OR/Page_Blusalt - View plan details/button_Done'))

