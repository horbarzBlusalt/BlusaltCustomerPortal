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

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/label_Identity(Ghana)'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/a_Voters ID Card (GVC)'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/button_Verify Voter'))

WebUI.setText(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '4510032528')

WebUI.setText(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/input__vti__input'), 
    '0263390259')

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_application'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/li_identity-test'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_api_version'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/li_v2'))

WebUI.click(findTestObject('CustomerInfo_OR/Page_Blusalt - Start Testing your services/select_currency'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/span_Verify Voter'))

WebUI.verifyElementPresent(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/p_Operation successful'), 
    0)

WebUI.click(findTestObject('Object Repository/GhanaVotersID/Page_Blusalt - Start Testing your services/input_Verifying Voter_checkbox'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

