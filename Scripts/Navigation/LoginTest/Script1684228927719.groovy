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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/span_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/li_Username is required'), 'Username is required.')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/li_Password is required'), 'Password is required.')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/input_EmailPhone-number_form-control input-_55be30'))

WebUI.setText(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/input_EmailPhone-number_form-control input-_55be30'), 
    'farida@blusalt.net')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 
    'jdIGyv7YwfwhQA3h4NNgrQ==')

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.click(findTestObject('Object Repository/Page_Blusalt - Login to blusalt/button_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Blusalt - Welcome to your dashboard/span_Dashboard'), 'Dashboard')

