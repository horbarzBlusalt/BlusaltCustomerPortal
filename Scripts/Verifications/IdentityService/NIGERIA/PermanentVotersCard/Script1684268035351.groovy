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

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/a_Permanent Voters Card (PVC)'))

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    '90f5b84030417951448')

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1'), 
    'KANNIKE')

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2'), 
    'Lagos')

WebUI.click(findTestObject('PVC_OR/Page_Blusalt - Start Testing your services/vs__selected-options'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_bluintouchapp'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/svg__vs__open-indicator'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_v2'))

WebUI.click(findTestObject('PVC_OR/Page_Blusalt - Start Testing your services/div_Select Currency'))

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.setText(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/input__vti__input'), '08175885645')

WebUI.click(findTestObject('Object Repository/PVC_OR/Page_Blusalt - Start Testing your services/span_Verify PVC'))

WebUI.verifyTextPresent('ISMAIL', false)

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

