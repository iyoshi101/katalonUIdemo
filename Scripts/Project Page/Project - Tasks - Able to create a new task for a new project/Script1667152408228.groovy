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

WebUI.verifyElementPresent(findTestObject('projectDetailPage/span_sideNav_Tasks'), GlobalVariable.timeOutTime)

WebUI.click(findTestObject('projectDetailPage/span_sideNav_Tasks'))

WebUI.verifyElementPresent(findTestObject('projectDetailPage/button_hewTask'), GlobalVariable.timeOutTime)

WebUI.click(findTestObject('projectDetailPage/button_hewTask'))

WebUI.verifyElementPresent(findTestObject('projectCreateNewTaskPage/div_New task'), GlobalVariable.timeOutTime)

WebUI.click(findTestObject('projectCreateNewTaskPage/div_New task'))

WebUI.click(findTestObject('projectCreateNewTaskPage/input_taskTitle'))

WebUI.setText(findTestObject('projectCreateNewTaskPage/input_taskTitle'), GlobalVariable.testTaskName)

WebUI.click(findTestObject('projectCreateNewTaskPage/button_submitTask'))

WebUI.click(findTestObject('projectCreateNewTaskPage/div_createTaskClose'))

