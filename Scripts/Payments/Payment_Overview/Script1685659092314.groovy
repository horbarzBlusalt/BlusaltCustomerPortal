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

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/span_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Request Funds'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/input__form-control input-bordered w-100'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/img_Payment Link_pointer'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/p_Payment Link Copied'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Visit Link'))

WebUI.switchToWindowTitle('Invoice')

WebUI.click(findTestObject('Object Repository/Page_Invoice/svg'))

WebUI.switchToWindowTitle('Blusalt - An overview of all your wallets')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/img'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Deposit Funds'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/input__form-control input-bordered w-100_1'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Continue'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_I have completed payment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/span_Please be patient, while we confirm yo_c39618'), 
    'Please be patient, while we confirm your payment29:50remaining')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_Back'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/svg'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_View Wallet'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusalt - View all your wallets/p_Wallets'), 0)

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Wallets Transactions/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/button_View Reserved Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Blusalt - View all reserved accounts/p_Reserved Accounts'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Blusalt - View all reserved accounts/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/div_Today'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/li_This Week'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/p_See All Transactions'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Wallets Transactions/a_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/div_Loading'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - An overview of all your wallets/li_USD'))

