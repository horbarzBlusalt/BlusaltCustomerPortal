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

fileName = 'Include/resources/SmartKYC Files/dl_front.jpg'
File houseImg = new File(fileName)

WebUI.callTestCase(findTestCase('Navigation/LoginTest'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Blusalt - Welcome to your dashboard/a_Verifications'))

WebUI.click(findTestObject('Page_Blusalt - Welcome to your dashboard/a_Identity Services'))

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/a_Address Verification'))

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/span_Verify Address'))

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered'), 
    'Shola')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1'), 
    'Adewale')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2'), 
    'Peters')

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/div_Gender_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/li_Male'))

WebUI.setText(findTestObject('Address_OR/Page_Blusalt - Start Testing your services/date_picker'), '01/03/1990')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__vti__input'), 
    '08175885463')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Email_form-control input-bordered'), 
    'rshola@gmail.com')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Description_form-control input-bordered'), 
    '12th Building')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Flat Number_form-control input-bordered'), 
    '20')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3'), 
    'Jakande Building')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Building Number_form-control input-bordered'), 
    '211')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3_4'), 
    '13 Olusola Street')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Sub Street_form-control input-bordered'), 
    'Iwade')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3_4_5'), 
    'Oando Filling Station')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3_4_5_6'), 
    'Lagos')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3_4_5_6_7'), 
    'Yaba')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input_Post Code_form-control input-bordered'), 
    '100011')

WebUI.setText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/input__form-control input-bordered_1_2_3_4_5_6_7_8'), 
    'Nigeria')

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/div_Click to upload fileBrowse'))

WebUI.uploadFile(findTestObject('Address_OR/Page_Blusalt - Start Testing your services/file_input'), houseImg.getAbsolutePath())

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/div__vs__selected-options'))

WebUI.click(GlobalVariable.select_application_dropdown_s2)

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/div_Select Currency Type_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/li_NGN'))

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/button_Verify Address'))

WebUI.verifyElementText(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/p_Address Verification Will Be Completed In_d5090b'), 
    'Address Verification Will Be Completed In 48 Hours')

WebUI.verifyElementPresent(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/div_Address Verification Will Be Completed _15b4c9'), 
    0)

WebUI.click(findTestObject('Object Repository/Address_OR/Page_Blusalt - Start Testing your services/button_Ok'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

