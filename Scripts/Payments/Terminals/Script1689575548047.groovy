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

WebUI.setEncryptedText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 'jdIGyv7YwfwhQA3h4NNgrQ==')

WebUI.sendKeys(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - Welcome to your dashboard/a_Terminals'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - Terminal Overview/div_Today'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - Terminal Overview/li_Last Month'))

WebUI.takeFullPageScreenshotAsCheckpoint('')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - Terminal Overview/span_Transactions'))

WebUI.takeFullPageScreenshotAsCheckpoint('')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Transactions/span_Virtual Terminal'))

WebUI.takeFullPageScreenshotAsCheckpoint('')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your subscription plans/span_POS Terminal'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your POS Terminal/span_Sales Agents'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/button_Invite Agent'))

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__form-control input-bordered w-100'), 
    'pauldid@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__vti__input'), '08172882932')

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__form-control input-bordered w-100_1'), 
    '211 Oluwale Street')

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__form-control input-bordered w-100'), 
    'Langh')

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input_Enter Zip Code_form-control input-bor_769bc8'), 
    '90990')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/div__vs__selected-options'))

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__vs__search'), 'Nig')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/li_Nigeria'))

WebUI.setText(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/input__vs__search'), 'Nig')

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/div__vs__selected-options_1'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/li_Adamawa'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/button_Create'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/td_Inactive'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/a_Agent Transactions'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/a_Agent Information'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/div_TerminalOverviewTransactionsVirtual Ter_bd4cda'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/button_Update Agent'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/button_Unblock Access'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/button_OK_iziToast-close'))

WebUI.click(findTestObject('Object Repository/Terminals_OR/Page_Blusalt - View all your Agent/img_Sales Agents_pointer'))

