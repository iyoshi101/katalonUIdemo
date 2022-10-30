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

WebUI.openBrowser('https://staging.fieldwire.com/#!/auth/register?alertDanger=false')

WebUI.waitForPageLoad(GlobalVariable.minWaitTime)

'verify fieldwire logo is present'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/img_signUpLogo'), GlobalVariable.timeOutTime)

'verify header text is present'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/p_signUpHeaderText'), GlobalVariable.timeOutTime)

'verify header text is "Create your free account to get started"'
WebUI.verifyElementText(findTestObject('signUpPage/signup_1/p_signUpHeaderText'), 'Create your free account to get started')

'verify first name text field is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/input_firstName'), GlobalVariable.timeOutTime)

'verify last name text field is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/input_lastName'), GlobalVariable.timeOutTime)

'verify password text field is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/input_password'), GlobalVariable.timeOutTime)

'verify acknowledgement checkbox is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/input_acknowledgementCheckBox'), GlobalVariable.timeOutTime)

'verify acknowledgement text is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/label_acknowledgement'), GlobalVariable.timeOutTime)

'verify create account button is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/button_createAccountConfirm'), GlobalVariable.timeOutTime)

'verify create account button text is "Create account"'
WebUI.verifyElementText(findTestObject('signUpPage/signup_1/button_createAccountConfirm'), 'Create account')

'verify login link is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/link_logIn'), GlobalVariable.timeOutTime)

'verify privacy policy link is presnet'
WebUI.verifyElementPresent(findTestObject('signUpPage/signup_1/link_privacyPolicy'), GlobalVariable.timeOutTime)

