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

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - Welcome to your dashboard/a_Overview'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - An overview of all your wallets/button_View Wallet'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input_Submit_form-control input-bordered w-100'), 
    'Suru')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Filter'))

WebUI.verifyElementText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/td_Suru Avoseh'), 
    'Suru Avoseh')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/td_Suru Avoseh'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Personal Information'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/span_savosehblusalt.net'), 
    0)

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Advance Information'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Deposit Funds'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/input__form-control input-bordered w-100'), 
    '10000')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Cancel'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Deposit Funds'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/input__form-control input-bordered w-100'), 
    '100000')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/span_Continue'))

WebUI.callTestCase(findTestCase('Account/Enter Card Details'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View wallet/img'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Create Wallet'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/span_Submit'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100'), 
    'Lade')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1'), 
    'Bayo')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1_2'), 
    'labayo@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__mobile_no'), '08175885646')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Submit'))

WebUI.verifyElementText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/h5_Wallet Created Successfully'), 
    'Wallet Created Successfully')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Done'))

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Create Wallet'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100'), 
    'Delvon')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1'), 
    'Leye')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input_Middle Name_form-control input-border_c867dd'), 
    'Brain')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__mobile_no'), '08192882733')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/span_Business'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1_2_3'), 
    'Yadah')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1_2_3_4'), 
    'RC0019992')

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1_2_3_4_5'), 
    '18 Sunmi Street Bawala')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/span_Submit'))

WebUI.setText(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/input__form-control input-bordered w-100_1_2'), 
    'braaidae@yopmail.com')

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/span_Submit'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/h5_Wallet Created Successfully'), 
    0)

WebUI.click(findTestObject('Object Repository/Wallet_OR/Page_Blusalt - View all your wallets/button_Done'))

WebUI.callTestCase(findTestCase('Navigation/LogoutTest'), [:], FailureHandling.STOP_ON_FAILURE)

