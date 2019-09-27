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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://ptolemy.kode.id/')

WebUI.setText(findTestObject('Pto_InviteUser/Page_Login ke KODE/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Pto_InviteUser/Page_Login ke KODE/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Home - KODE/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_Invite new user'))

WebUI.setText(findTestObject('Pto_InviteUser/Page_KODE/input_Clear_css-1tfry7f'), 'kodetesting03@outlook.com')

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/Page_KODE/Page_KODE/Page_KODE/Page_KODE/div_Clear_css-1v6q90a'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_Submit'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/a_Pending Invites'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/a_Unassigned'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/a_Admins'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/a_Teams'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/Page_KODE/div_Jony'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/Page_KODE/Page_KODE/span_logout'))

WebUI.navigateToUrl('https://outlook.live.com/mail/')

WebUI.click(findTestObject('Pto_InviteUser/Page_Outlook  free personal email and calendar from Microsoft/a_Sign in'))

WebUI.setText(findTestObject('Pto_InviteUser/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 'kodetesting03@outlook.com')

WebUI.click(findTestObject('Pto_InviteUser/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Pto_InviteUser/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 
    'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_InviteUser/Page_Sign in to your Microsoft account/input_Forgotten your password_idSIButton9'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Email - Kode Testing03 - Outlook/Page_Email - Kode Testing03 - Outlook/Page_Email - Kode Testing03 - Outlook/div_DdevteamkodeidUndangan bergabung'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Email - Kode Testing03 - Outlook/a_Mulai'))

WebUI.switchToWindowTitle('KODE')

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_lanjutkan'))

WebUI.setText(findTestObject('Pto_InviteUser/Page_KODE/input_upload foto_firstName'), 'Agnes')

WebUI.setText(findTestObject('Pto_InviteUser/Page_KODE/input_Nama Depan_lastName'), 'Winarni')

WebUI.setText(findTestObject('Pto_InviteUser/Page_KODE/input_Email Perusahaan_phoneNumber'), '087743180151')

WebUI.setEncryptedText(findTestObject('Pto_InviteUser/Page_KODE/input_Nomor Handphone_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.setEncryptedText(findTestObject('Pto_InviteUser/Page_KODE/input_Password_confirmationPassword'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_Development'))

WebUI.click(findTestObject('Pto_InviteUser/Page_KODE/button_simpan'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Katalog Course - KODE/button_mulai belajar'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Katalog Course - KODE/a_home'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Home - KODE/Page_Home - KODE/Page_Home - KODE/div_Agnes'))

WebUI.click(findTestObject('Pto_InviteUser/Page_Home - KODE/Page_Home - KODE/Page_Home - KODE/Page_Home - KODE/span_logout'))

