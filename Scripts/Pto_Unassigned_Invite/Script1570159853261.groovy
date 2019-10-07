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

WebUI.setText(findTestObject('Pto_Reinvite/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Pto_Reinvite/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/a_Unassigned'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/button_Invite new user'))

WebUI.setText(findTestObject('Pto_Unassigned_Invite/Page_KODE/input_Clear_css-1tfry7f'), 'kodetesting06@gmail.com')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/div_kodetesting06gmailcomX'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/button_Submit'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/button_Ok'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/div_Jony'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/span_logout'))

WebUI.navigateToUrl('https://mail.google.com/mail')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Gmail - Penyimpanan dan Email Gratis dari Google/a_Login'))

WebUI.switchToWindowTitle('Gmail')

WebUI.setText(findTestObject('Pto_Unassigned_Invite/Page_Gmail/input_Lanjutkan ke Gmail_identifier'), 'kodetesting06@gmail.com')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Gmail/div_Berikutnya'))

WebUI.setEncryptedText(findTestObject('Pto_Unassigned_Invite/Page_Gmail/input_Terlalu sering gagal_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Gmail/span_Berikutnya'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Inbox - kodetesting06gmailcom - Gmail/Page_Inbox - kodetesting06gmailcom - Gmail/span_devteam'))

WebUI.scrollToPosition(0, 600)

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Undangan bergabung ke KODE dari PT PALUGADA - kodetesting06gmailcom - Gmail/img_me_ajT'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Undangan bergabung ke KODE dari PT PALUGADA - kodetesting06gmailcom - Gmail/a_Mulai'))

WebUI.switchToWindowTitle('KODE')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/button_lanjutkan'))

WebUI.delay(5)

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_KODE/Page_KODE/button_login'))

WebUI.setText(findTestObject('Pto_Unassigned_Invite/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting06@gmail.com')

WebUI.setEncryptedText(findTestObject('Pto_Unassigned_Invite/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Bagikan kategori favorit anda/div_FadillaFF'))

WebUI.click(findTestObject('Pto_Unassigned_Invite/Page_Bagikan kategori favorit anda/span_logout'))

