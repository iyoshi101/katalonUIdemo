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

WebUI.waitForPageLoad(GlobalVariable.minWaitTime)

'verify fieldwire logo is presnet'
WebUI.verifyElementPresent(findTestObject('signInPage/img_loginlogo'), GlobalVariable.timeOutTime)

'verify envelope icon is presnet'
WebUI.verifyElementPresent(findTestObject('signInPage/icon_envelope'), GlobalVariable.timeOutTime)

'verify next button is presnet'
WebUI.verifyElementPresent(findTestObject('signInPage/button_Next'), GlobalVariable.timeOutTime)

'verify reset password link is presnet'
WebUI.verifyElementPresent(findTestObject('signInPage/link_accountLocked'), GlobalVariable.timeOutTime)

'verify create account link is presnet'
WebUI.verifyElementPresent(findTestObject('signInPage/link_createAccount'), GlobalVariable.timeOutTime)

'verify password field is not present initially'
WebUI.verifyElementNotPresent(findTestObject('signInPage/input_loginPassword'), GlobalVariable.timeOutTime)

