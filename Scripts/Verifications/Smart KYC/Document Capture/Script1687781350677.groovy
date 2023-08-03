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

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Welcome to your dashboard/a_Smart KYC'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/a_Document Capture'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/span_Validate data'))

WebUI.setText(findTestObject('Page_Blusalt - Start Testing your services/input__vti__input'), '08132561877')

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/li_(DL) Drivers Licence'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/div_Select Currency Type_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_1'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/dl_front.jpg')

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_2'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/dl_back.jpg')

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/span_Validate data'))

WebUI.waitForElementPresent(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/h1_Document Capture Request Response'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/img'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/span_ORILOYE, ENDURANCE EKUNDAYO'), 
    'ORILOYE, ENDURANCE EKUNDAYO')

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/div_(DL) Drivers Licence'))

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/li_(NIP) Nigerian International Passport'))

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_1'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/nip.JPG')

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/button_Validate data'))

WebUI.verifyElementText(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/p_Document Capture result returned'), 
    'Document Capture result returned')

WebUI.verifyElementPresent(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/span_ABIOYE OBALOLUWA PETER'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/h1_Document Capture Request Response'), 
    0)

WebUI.click(findTestObject('Object Repository/DocCapture_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

