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

WebUI.setText(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/i_IT QUALITY ASSURANCE_fal fa-square css-0'))

WebUI.selectOptionByValue(findTestObject('Pto_RemoveEmployee/Page_KODE/select_Select ActionMove to TeamUnassigned from TeamRemove Employees'), 
    'REVOKE_EMPLOYEES', true)

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/button_Submit'))

WebUI.scrollToPosition(50, 5)

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/Page_KODE/button_Invite new user'))

WebUI.setText(findTestObject('Pto_RemoveEmployee/Page_KODE/input_Clear_css-1tfry7f'), 'kodetesting03@outlook.com')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/div_kodetesting03outlookcomX'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/Page_KODE/Page_KODE/button_Submit'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/button_Ok'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/div_Jony'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/span_logout'))

WebUI.navigateToUrl('https://outlook.live.com/mail/')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Outlook  free personal email and calendar from Microsoft/a_Sign in'))

WebUI.setText(findTestObject('Pto_RemoveEmployee/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 'kodetesting03@outlook.com')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Pto_RemoveEmployee/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Email - Kode Testing03 - Outlook/div_DdevteamkodeidUndangan bergabung'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Email - Kode Testing03 - Outlook/a_Mulai'))

WebUI.switchToWindowTitle('KODE')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/button_lanjutkan'))

WebUI.delay(10)

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_KODE/button_login'))

WebUI.setText(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting03@outlook.com')

WebUI.setEncryptedText(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Katalog Course - KODE/span_Bagaimana Menjadi Trainer Millennial'))

WebUI.delay(20)

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Bagaimana Menjadi Trainer Millennial - Classroom - KODE/video_Tedi IrawanCEO Millenial Trainer Indonesia_jw-video jw-reset'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Bagaimana Menjadi Trainer Millennial - Classroom - KODE/a_home'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Home - KODE/div_Agnes'))

WebUI.click(findTestObject('Pto_RemoveEmployee/Page_Home - KODE/span_logout'))

WebUI.closeBrowser()

