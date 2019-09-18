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

WebUI.navigateToUrl('https://ptolemy.kode.id/')

WebUI.scrollToPosition(0, 250)

WebUI.click(findTestObject('Ptolemy/Page_Login ke KODE/span_Daftar Disini'))

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_First Name'))

WebUI.setText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_First Name_firstName'), 'Fadilla')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Last Name'))

WebUI.scrollToPosition(0, 10)

WebUI.setText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Last Name_lastName'), 'Fortati')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Email'))

WebUI.setText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Email_email'), 'ff@gmail.com')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Password'))

WebUI.setEncryptedText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Confirm Password_confirmPassword'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/button_Daftar'))

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/button_Ya'))

WebUI.navigateToUrl('https://www.google.com/intl/id/gmail/about/#')

WebUI.delay(10)

WebUI.click(findTestObject('Page_Gmail - Penyimpanan dan Email Gratis dari Google/a_Login'))

WebUI.switchToWindowTitle('Gmail')

WebUI.click(findTestObject('Gmail/Page_Gmail/input_Lanjutkan ke Gmail_identifier'))

WebUI.setText(findTestObject('Gmail/Page_Gmail/input_Lanjutkan ke Gmail_identifier'), 'ffadilla@kode.id')

WebUI.click(findTestObject('Ptolemy/New Ptolemy/Page_Gmail/span_Berikutnya'))

WebUI.click(findTestObject('Gmail/Page_Gmail/input_Terlalu sering gagal_password'))

WebUI.setEncryptedText(findTestObject('Gmail/Page_Gmail/input_Terlalu sering gagal_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Ptolemy/New Ptolemy/Page_Gmail/span_BerikutPass'))

WebUI.delay(20)

WebUI.click(findTestObject('Gmail/Page_Gmail/input_G-_idvPin'))

WebUI.setText(findTestObject('Gmail/Page_Gmail/input_G-_idvPin'), '131111')

WebUI.click(findTestObject('Gmail/Page_Gmail/span_Berikutnya'))

WebUI.delay(15)

WebUI.click(findTestObject('Gmail/Page_Inbox/input_Search_q'))

WebUI.setText(findTestObject('Gmail/Page_Inbox/input_Search_q'), 'support')

WebUI.click(findTestObject('Ptolemy/New Ptolemy/Page_Gmail/Page_Inbox - ffadillakodeid - Hacktiv8 Mail/div_Selamat datang di KODE semua bisa belajarSep 13supportkodeid ffadillakodeid'))

WebUI.delay(15)

WebUI.click(findTestObject('Ptolemy/New Ptolemy/Page_Selamat datang di KODE semua bisa belajar - ffadillakodeid - Hacktiv8 Mail/a_Verifikasi Email'))

WebUI.switchToWindowTitle('Verify Email KODE')

WebUI.click(findTestObject('Ptolemy/New Ptolemy/Page_Verify Email KODE/span_Login ke Akun'))

WebUI.setText(findTestObject('Object Repository/Ptolemy/New Ptolemy/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.click(findTestObject('Object Repository/Ptolemy/New Ptolemy/Page_Login ke KODE/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy/New Ptolemy/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz74e265CFa56A==')

WebUI.click(findTestObject('Object Repository/Ptolemy/New Ptolemy/Page_Login ke KODE/button_Masuk'))

WebUI.delay(20)

