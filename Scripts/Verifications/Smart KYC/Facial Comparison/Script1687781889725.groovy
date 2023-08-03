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

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Welcome to your dashboard/a_Smart KYC'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/a_Facial Comparison'))

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_1'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/johnny.jpeg')

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_2'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/profile.jpg')

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/div_Select Currency Type_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/span_Compare Images'))

try {
    WebUI.waitForElementPresent(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/h1_Facial Comaprison Request Response'), 
        0)
}
catch (Exception e) {
    WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/span_Compare Images'))

    WebUI.waitForElementPresent(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/h1_Facial Comaprison Request Response'), 
        0)

    WebUI.verifyElementVisible(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/img'))
} 

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.waitForElementClickable(findTestObject('FacialComparison_OR/Page_Blusalt - Start Testing your services/span_Compare Images'), 
    0)

WebUI.uploadFile(findTestObject('OCR_OR/Page_Blusalt - Start Testing your services/select_file_2'), '/Users/obaloluwaabioye/Katalon Studio/BlusaltCustomerPortal.git/SmartKYC Files/johnny.jpeg')

WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/span_Compare Images'))

try {
	WebUI.waitForElementPresent(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/h1_Facial Comaprison Request Response'),
		0)
}
catch (Exception e) {
	WebUI.click(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/span_Compare Images'))

	WebUI.waitForElementPresent(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/h1_Facial Comaprison Request Response'),
		0)

	WebUI.verifyElementVisible(findTestObject('Object Repository/FacialComparison_OR/Page_Blusalt - Start Testing your services/img'))
}


WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

