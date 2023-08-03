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

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Welcome to your dashboard/a_Business Verification'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/span_Verify'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.setText(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/input__vs__search'), 
    'Nige')

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/li_Nigeria'))

WebUI.setText(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/input__vs__search'), 
    'Nige')

WebUI.setText(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    'RC1889580')

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/li_Business Name'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/button_Verify'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/h1_CAC Verification Response'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/span_GLOBALCONNECT NIGERIA SOLUTIONS LIMITED'), 
    0)

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/div_Business Name'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/li_Limited Company'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/span_Verify'))

WebUI.verifyElementText(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/p_CAC retrieved'), 
    'CAC retrieved')

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/div_Limited Company'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/li_Incorporated Trustee'))

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/span_Verify'))

WebUI.verifyElementText(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/p_CAC retrieved'), 
    'CAC retrieved')

WebUI.click(findTestObject('Object Repository/Business_OR/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

