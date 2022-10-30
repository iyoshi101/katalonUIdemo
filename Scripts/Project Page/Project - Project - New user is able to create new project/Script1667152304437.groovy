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

WebUI.click(findTestObject('projectIndexPage/div_newProject'))

WebUI.verifyElementPresent(findTestObject('projectCreateNewProjectPage/div_firstTimenewProjectPopup'), GlobalVariable.timeOutTime)

WebUI.verifyElementPresent(findTestObject('projectCreateNewProjectPage/img_newProjectLogo'), GlobalVariable.timeOutTime)

WebUI.verifyElementPresent(findTestObject('projectCreateNewProjectPage/input_newProjectName'), GlobalVariable.timeOutTime)

WebUI.click(findTestObject('projectCreateNewProjectPage/input_newProjectName'))

WebUI.setText(findTestObject('projectCreateNewProjectPage/input_newProjectName'), GlobalVariable.testProjectName)

WebUI.verifyElementNotVisible(findTestObject('projectCreateNewProjectPage/select_existingProject'))

WebUI.click(findTestObject('projectCreateNewProjectPage/button_create'))

WebUI.verifyElementPresent(findTestObject('projectIndexPage/div_uploadPlans'), GlobalVariable.timeOutTime)

WebUI.verifyElementPresent(findTestObject('projectIndexPage/div_uploadPlansClose'), GlobalVariable.timeOutTime)

WebUI.click(findTestObject('projectIndexPage/div_uploadPlansClose'))

