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

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Welcome to your dashboard/a_Messaging'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/input__vti__input'), '08175885645')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Add'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/input__vti__input'), '08137210473')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Add'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/input__vti__input'), '08023206781')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Add'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_identity-test'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_v2'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options_1_2'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_NGN'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/textarea__form-control input-bordered w-100'), 
    'Testing SMS Module')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Send SMS'))

WebUI.verifyElementText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/p_Sms Request Received for processing'), 
    'Sms Request Received for processing')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/span_Phone Number_vti__flag gb'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/strong_United Kingdom'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/input__vti__input'), '07498521144')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Add'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/input__vti__input'), '07432631486')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Add'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_identity-test'))

WebUI.verifyElementText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/p_Sms Config for Blusalt-Staging successful_69b1b0'), 
    'Sms Config for Blusalt-Staging successfully Fetched')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options_1_2_3'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_v2_1'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/div__vs__selected-options_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/li_NGN_1'))

WebUI.setText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/textarea__form-control input-bordered w-100'), 
    'Testing SMS to international Numbers. From Oba')

WebUI.click(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/button_Send SMS'))

WebUI.verifyElementText(findTestObject('Object Repository/Messaging_OR/Page_Blusalt - Messaging/p_Sms Request Received for processing'), 
    'Sms Request Received for processing')

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

