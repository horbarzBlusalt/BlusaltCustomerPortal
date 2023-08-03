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

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - Welcome to your dashboard/a_API Documentation'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Edit Application'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/button_Close'))

WebUI.click(findTestObject('API_OR/Page_Blusalt - API Keys/div_new-app'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Regenerate key'))

WebUI.verifyElementText(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/p_API Key generated successfully'), 
    'API Key generated successfully')

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/div_Copied to ClipboardAPI KEY             _4a6762'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Edit Services'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/li_(DL) Drivers Licence'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_Update Application Service(s)'))

WebUI.verifyElementText(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/p_Application successfully updated'), 
    'Application successfully updated')

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title_1'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Edit Services'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/svg'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_Update Application Service(s)'))

WebUI.verifyElementText(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/p_Application successfully updated'), 
    'Application successfully updated')

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/div_Copied to ClipboardAPI KEY             _4a6762'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title_1'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Edit Application'))

WebUI.setText(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/input_Application Name_form-control input-bordered'), 
    'new-app_01')

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_Update Application'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_API KEY_dropdown-title'))

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/a_Edit Application'))

WebUI.setText(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/input_Application Name_form-control input-bordered'), 
    'new-app')

WebUI.click(findTestObject('Object Repository/API_OR/Page_Blusalt - API Keys/span_Update Application'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

