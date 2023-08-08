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
import java.io.*

fileName = 'Include/resources/Bulk Files/bulk_bvn.csv'
File bulkBVNFile = new File(fileName)

WebUI.callTestCase(findTestCase('Navigation/LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/a_Bank Verification Number (Bulk-BVN)'))

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/button_Verify BVNs'))

WebUI.uploadFile(findTestObject('BBVN_OR/Page_Blusalt - Start Testing your services/select_bulk_file'), bulkBVNFile.getAbsolutePath())

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/svg_Select Currency Type_vs__open-indicator'))

WebUI.click(GlobalVariable.currency)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/div_Loading'))

WebUI.click(GlobalVariable.select_application_dropdown_s1)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/span_Verify BVNs'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/p_This service is not included in your app'), 
    0)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/svg_bluintouchapp_vs__open-indicator'))

WebUI.click(GlobalVariable.select_application_dropdown_s2)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/span_Verify BVNs'))

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/p_Your file is Successfully Uploaded'))

WebUI.verifyElementPresent(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/p_Your file is Successfully Uploaded'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/p_Your Bulk BVN request has been recieved a_83fa4a'), 
    0)

WebUI.click(findTestObject('Object Repository/BBVN_OR/Page_Blusalt - Start Testing your services/span_'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

