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

WebUI.setText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/input_Card Number_cardNumber'), 
    '5204 7300 0000 2662')

WebUI.setText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/input_Expiry Date_expiryDate'), 
    '01/2025')

WebUI.setText(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/input_CVC_cvv'), '100')

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/button_Make Payments'))

WebUI.click(findTestObject('Object Repository/AccountWallet_OR/Page_Blusalt - Account Wallet/button_Done'))

