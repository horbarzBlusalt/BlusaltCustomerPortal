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

WebUI.setText(findTestObject('Page_Blusalt - Login to blusalt/input_EmailPhone-number_form-control input-_55be30'), 'farida@blusalt.net')

WebUI.setEncryptedText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 'FQNXsTQU5BA=')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.setText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered_1'), 'Blusalt22')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/button_Sign In'))

WebUI.click(findTestObject('Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Page_Blusalt - Welcome to your dashboard/a_Overview'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - An overview of all your wallets/button_View Reserved Account'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/div_Filter By'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__from'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/span_2'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__to'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/span_3'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Filter'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Clear'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/img_Clear_ml-3 pointer'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Add Reserved Account'))

WebUI.setText(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__form-control input-bordered w-100'), 
    'Victor')

WebUI.setText(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__form-control input-bordered w-100_1'), 
    'Gbemi')

WebUI.setText(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__form-control input-bordered w-100_1_2'), 
    'vickgbemi@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input__mobile_no'), 
    '08175774883')

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/h5_Reserved Account Created Successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Done'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/input_Submit_form-control input-bordered w-100'), 
    'Victor')

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Filter'))

WebUI.click(findTestObject('Object Repository/Reserved_OR/Page_Blusalt - View all reserved accounts/button_Clear'))

WebUI.closeBrowser()

