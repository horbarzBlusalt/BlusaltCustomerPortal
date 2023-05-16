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

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/button_Verify BVN'))

WebUI.verifyElementText(findTestObject('Page_Blusalt - Start Testing your services/li_This field must have a minimum length of 11'), 
    'This field cannot be empty')

WebUI.verifyElementText(findTestObject('Page_Blusalt - Start Testing your services/li_Application field is required'), 'Application field is required.')

WebUI.verifyElementText(findTestObject('Page_Blusalt - Start Testing your services/li_API version field is required'), 'API version field is required.')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '22372706112')

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/input__vti__input'), '08175885645')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/li_v2'))

WebUI.click(findTestObject('Page_Blusalt - Start Testing your services/select_currencyType'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/button_Verify BVN'))

WebUI.verifyElementPresent(findTestObject('Page_Blusalt - Start Testing your services/p_An Unexpected Error Occured'), 0)

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '22372706052')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/button_Verify BVN'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/p_BVN Verification Completed Successfully'), 
    'BVN Verification Completed Successfully')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/span_Obaloluwa Peter Abioye'), 
    'Obaloluwa Peter Abioye')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/span_VERIFIED'), 'VERIFIED')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Start Testing your services/a_Close Panel'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

