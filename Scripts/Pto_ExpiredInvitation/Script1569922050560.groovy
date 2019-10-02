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

WebUI.setText(findTestObject('Pto_ExpiredInvitation/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Pto_ExpiredInvitation/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/a_Pending Invites'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/button_Invite new user'))

WebUI.setText(findTestObject('Pto_ExpiredInvitation/Page_KODE/input_Clear_css-1tfry7f'), 'kodetesting05@yahoo.com')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/div_kodetesting05yahoocomX'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/div_Unassigned_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/div_DevOps'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/button_Submit'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/button_Ok'))

WebUI.delay(350)

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/a_home'))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.CONTROL, 'T'))

WebUI.navigateToUrl('https://id.yahoo.com/')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Yahoo/a_Sign in'))

WebUI.setText(findTestObject('Pto_ExpiredInvitation/Page_Yahoo -masuk/input_Masukkan Kode Negara_username'), 'kodetesting05@yahoo.com')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Yahoo -masuk/input_Masukkan Kode Negara_signin'))

WebUI.setEncryptedText(findTestObject('Pto_ExpiredInvitation/Page_Yahoo/input_BukanAnda_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_Yahoo/button_Masuk'))

WebUI.click(findTestObject('Pto_CancelInvitation/Page_Yahoo/a_Email'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_(7 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/div_Undangan bergabung ke KODE dari PT PALUGADA'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_(6 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/a_Mulai'))

WebUI.switchToWindowTitle('KODE')

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/button_lanjutkan'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_KODE/Page_KODE/button_kembali'))

WebUI.closeWindowTitle('KODE')

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_(6 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/label_Kode'))

WebUI.click(findTestObject('Pto_ExpiredInvitation/Page_(6 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/span_Keluar'))

