import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ptolemy.kode.id/')

WebUI.setText(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_Login ke KODE/input_Alamat Email_email'), 
    'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/a_Unassigned'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/i_Teams_fal fa-square css-0'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/select_Select ActionMove to TeamRemove from Company'), 
    'moveToTeam', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/select_Select ActionIT QUALITY ASSURANCEDevOps'), 
    '086c384c-99ac-4e01-a7b8-e331546238e2', true)

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/button_Move'))

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/a_Teams'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/a_Organization'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/div_IT QUALITY ASSURANCE_css-xe7dnz'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/div_DevOps_css-xe7dnz'))

WebUI.selectOptionByValue(findTestObject('Pto_MoveBackTeam/Page_KODE/select_Select ActionMove to TeamUnassigned from TeamRemove Employees'), 
    'MOVE_EMPLOYEES_TEAM', true)

WebUI.click(findTestObject('Pto_Unassigned_MoveOrBackTeam/Page_KODE/Page_KODE/button_Move'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/div_Jony'))

WebUI.click(findTestObject('Object Repository/Pto_Unassigned_MoveOrBackTeam/Page_KODE/span_logout'))

