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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/a_National Identity Number (NIN)'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/span_Verify NIN'))

WebUI.verifyElementText(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/li_This field cannot be empty'), 
    'This field cannot be empty')

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/span_This field must contain a valid phone number'))

WebUI.verifyElementText(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/span_This field must contain a valid phone number'), 
    'This field must contain a valid phone number')

WebUI.setText(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '15178412895')

WebUI.setText(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/input__vti__input'), '08175885645')

WebUI.click(findTestObject('NIN_OR/Page_Blusalt - Start Testing your services/select_an_application'))

WebUI.click(findTestObject('NIN_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp_select'))

WebUI.click(findTestObject('NIN_OR/Page_Blusalt - Start Testing your services/select_api_version'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/li_v2'))

WebUI.click(findTestObject('iBVN_OR/Page_Blusalt - Start Testing your services/div_Select Currency Type'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/span_Verify NIN'))

WebUI.verifyElementText(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/h1_NIN Request Response'), 
    'NIN Request Response')

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

