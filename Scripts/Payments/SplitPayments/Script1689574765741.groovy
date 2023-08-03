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

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye fs-24'))

WebUI.setEncryptedText(findTestObject('Page_Blusalt - Login to blusalt/input_Password_form-control input-bordered'), 'jdIGyv7YwfwhQA3h4NNgrQ==')

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/em_Password_fas fa-eye-slash fs-24'))

WebUI.click(findTestObject('Page_Blusalt - Login to blusalt/button_Sign In'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - Welcome to your dashboard/a_Payments'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - Welcome to your dashboard/a_Split Payments'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/button_Create Split Payment'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/input__form-control input-bordered'), 
    'TestSplit01')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/div_Select Sub Account_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/li_Abioye Obaloluwa Peter (3095386219)'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/div_Abioye Obaloluwa P_vs__selected-options'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/li_Percent'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/input_Type is required_form-control input-bordered'), 
    '10')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/button_Create Group'))

WebUI.verifyElementText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/h5_Split Payment Created  Successfully'), 
    'Split Payment Created Successfully')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/button_Done'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/td_TSP-ED13210IAI6D9JIHDEFF'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/button_Update Split Payment'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/input__form-control input-bordered'), 
    'TestSplit02')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/button_Update Group'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/button_Done'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/a_Sub Account Information'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View split payment detials/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/div_Filter By'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/input_Create Group_form-control input-borde_3044c0'), 
    'Joro')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/button_Filter'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/button_Clear'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/span_Sub Account'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/button_Create Sub Account'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/div__vs__selected-options'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/li_Ecobank Nigeria'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/input__form-control input-bordered w-100'), 
    '0015070745')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/h5_Sub Account Created  Successfully'), 
    'Sub Account Created Successfully')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/button_Done'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/td_ODU GBOLAHAN'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View sub account detials/img_My Profile_pointer'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your split payments/span_Sub Account'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/button_Create Sub Account'))

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/div__vs__selected-options'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/input__vs__search'), 
    'Fir')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/li_First Bank of Nigeria'))

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/input__vs__search'), 
    'Fir')

WebUI.setText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/input__form-control input-bordered w-100'), 
    '3095386219')

WebUI.click(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/button_Continue'))

WebUI.verifyElementText(findTestObject('Object Repository/SplitPayment_OR/Page_Blusalt - View all your sub accounts/p_A duplicate resource already exists'), 
    'A duplicate resource already exists')

