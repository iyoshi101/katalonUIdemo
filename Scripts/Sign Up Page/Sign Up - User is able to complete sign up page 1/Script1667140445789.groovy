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

'Able to click on first name text field'
WebUI.click(findTestObject('signUpPage/signup_1/input_firstName'))

'Able to enter first name'
WebUI.setText(findTestObject('signUpPage/signup_1/input_firstName'), GlobalVariable.testFirstName)

'Able to click on last name text field'
WebUI.click(findTestObject('signUpPage/signup_1/input_lastName'))

'verify check mark is showing when data entered are valid'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_1/div_firstNameCheck'))

'Able to enter last name'
WebUI.setText(findTestObject('signUpPage/signup_1/input_lastName'), GlobalVariable.testLastName)

'generate a random email address '
String mail = CustomKeywords.'testData.RandomEmail.getEmail'('qatester_', 'mailinator.com')

'Able to click on email text field'
WebUI.click(findTestObject('signUpPage/signup_1/input_email'))

'verify check mark is showing when data entered are valid'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_1/div_lastNameCheck'))

'Able to enter email address'
WebUI.setText(findTestObject('signUpPage/signup_1/input_email'), mail)

'Able to click on password field'
WebUI.click(findTestObject('signUpPage/signup_1/input_password'))

'verify check mark is showing when data entered are valid'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_1/div_emailCheck'))

'Able to enter password'
WebUI.setText(findTestObject('signUpPage/signup_1/input_password'), GlobalVariable.testPassword)

'verify check mark is showing when data entered are valid'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_1/div_passwordCheck'))

'Able to check to accept ackownlegement '
WebUI.check(findTestObject('signUpPage/signup_1/input_acknowledgementCheckBox'))

'Able to click on create account cta'
WebUI.click(findTestObject('signUpPage/signup_1/button_createAccountConfirm'))

