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

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/a_BVN With Image (IBVN)'))

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/button_Verify BVN'))

WebUI.verifyElementText(findTestObject('Page_Blusalt - Start Testing your services/li_This field must have a minimum length of 11'), 
    'This field cannot be empty')

WebUI.verifyElementText(findTestObject('Page_Blusalt - Start Testing your services/li_Application field is required'), 'Application field is required.')

WebUI.setText(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '22372706052')

WebUI.setText(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/input__vti__input'), 
    '08175885645')

WebUI.click(findTestObject('iBVN_OR/Page_Blusalt - Start Testing your services/select_application'))

WebUI.click(findTestObject('Page_Blusalt - Start Testing your services/li_bluintouchapp_copy'))

WebUI.click(findTestObject('iBVN_OR/Page_Blusalt - Start Testing your services/select_currencytype'))

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/span_Verify BVN'))

WebUI.verifyElementText(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/p_iBVN Verification Completed Successfully'), 
    'iBVN Verification Completed Successfully')

WebUI.takeFullPageScreenshotAsCheckpoint('IBVN_Checkpoint')

WebUI.click(findTestObject('Object Repository/iBVN_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

