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

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Login to blusalt/input_EmailPhone-number_form-control input-_55be30'), 
    'farida@blusalt.net')

WebUI.setEncryptedText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 
    'jdIGyv7YwfwhQA3h4NNgrQ==')

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Login to blusalt/button_Sign In'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/a_Permanent Voters Card (PVC)'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/span_Verify PVC'))

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/li_This field cannot be empty'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/li_This field cannot be empty'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/li_This field cannot be empty'), 0)

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/li_Application field is required'), 
    0)

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/li_API version field is required'), 
    0)

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '2200000025141650')

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1'), 
    'Abioye')

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2'), 
    'Lagos')

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/div_Loading'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/svg__vs__open-indicator'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_v2'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/div_Loading'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__vti__input'), '08175885645')

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/span_Verify PVC'))

WebUI.verifyElementText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/p_PVC Number must be 19 digits'), 
    'PVC Number must be 19 digits')

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'))

