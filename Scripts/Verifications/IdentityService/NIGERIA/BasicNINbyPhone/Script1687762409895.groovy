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

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/NIN_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/a_National Identity Number(NIN-By-PhoneNumb_14d6ec'))

WebUI.setText(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/input__vti__input'), 
    '08175885645')

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/li_identity-test_1'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options_1_2_3'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/li_v2_1'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/div_Select Currency Type_vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/li_NGN_1'))

WebUI.click(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/button_Verify NIN'))

WebUI.verifyElementText(findTestObject('Object Repository/PNIN_OR/Page_Blusalt - Start Testing your services/p_NIN Verification Completed Successfully'), 
    'NIN Verification Completed Successfully')

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

