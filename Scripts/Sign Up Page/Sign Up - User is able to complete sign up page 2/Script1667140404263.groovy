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

'able to click on company name field'
WebUI.click(findTestObject('signUpPage/signup_2/input_companyName'))

'able to enter company name'
WebUI.setText(findTestObject('signUpPage/signup_2/input_companyName'), GlobalVariable.testCompanyName)

'able to click on company type drop down'
WebUI.click(findTestObject('signUpPage/signup_2/select_companyType'))

'verify check mark shows up after entering data'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_2/div_companyNameCheck'), FailureHandling.STOP_ON_FAILURE)

'able to select company type option'
WebUI.selectOptionByIndex(findTestObject('signUpPage/signup_2/select_companyType'), GlobalVariable.testCompanyType)

'able to click on employee number drop down'
WebUI.click(findTestObject('signUpPage/signup_2/select_numEmployees'))

'verify check mark shows up after entering data'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_2/div_companyTypeCheck'), FailureHandling.STOP_ON_FAILURE)

'able to select employee size from drop down'
WebUI.selectOptionByIndex(findTestObject('signUpPage/signup_2/select_numEmployees'), GlobalVariable.testNumberOfEmpoyees)

'generate a random password'
String phone = CustomKeywords.'testData.RandomPhone.getPhone'()

'able to click on Phone number field'
WebUI.click(findTestObject('signUpPage/signup_2/input_phone'))

'verify check mark shows up after entering data'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_2/div_companySizeCheck'), FailureHandling.STOP_ON_FAILURE)

'able to enter a phone number'
WebUI.setText(findTestObject('signUpPage/signup_2/input_phone'), phone)

'verify check mark shows up after entering data'
WebUI.verifyElementVisible(findTestObject('signUpPage/signup_2/div_companyPhoneCheck'), FailureHandling.STOP_ON_FAILURE)

'able to click on complete CTA after entering all info'
WebUI.click(findTestObject('signUpPage/signup_2/button_Complete'))

