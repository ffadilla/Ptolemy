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

WebUI.setText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Email_email'), 'kodetesting01@hotmail.com')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Password'))

WebUI.setEncryptedText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/div_Confirm Password'))

WebUI.setEncryptedText(findTestObject('Ptolemy/Page_Daftar ke KODE/input_Confirm Password_confirmPassword'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.scrollToPosition(0, 50)

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/button_Daftar'))

WebUI.click(findTestObject('Ptolemy/Page_Daftar ke KODE/button_Ya'))

WebUI.navigateToUrl('https://outlook.live.com/mail/')

WebUI.click(findTestObject('Hotmail/Page_Outlook  free personal email and calendar from Microsoft/a_Sign in'))

WebUI.setText(findTestObject('Hotmail/Page_Sign in to your Microsoft account/input_Sign in_loginfmt'), 'kodetesting01@hotmail.com')

WebUI.click(findTestObject('Hotmail/Page_Sign in to your Microsoft account/input_Create one_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Hotmail/Page_Sign in to your Microsoft account/input_Enter password_passwd'), 'RuFO4XwVuE6tgrEU94SbqQ==')

WebUI.click(findTestObject('Hotmail/Page_Sign in to your Microsoft account/input_Forgot password_idSIButton9'))

WebUI.setText(findTestObject('Hotmail/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/input_Outlook__1Qs0_GHrFMawJzYAmLNL2x _1LtnCG5oLbhQOwtufJyBi8'), 
    'support')

WebUI.sendKeys(findTestObject('Hotmail/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/button_'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Hotmail/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/div_Ssupportkodeid'), 
    5)

WebUI.click(findTestObject('Hotmail/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/Page_Mail - Kode Testing01 - Outlook/div_Ssupportkodeid'))

WebUI.click(findTestObject('Object Repository/Hotmail/Page_Mail - Kode Testing01 - Outlook/a_Verifikasi Email'))

WebUI.switchToWindowTitle('Verify Email KODE')

WebUI.click(findTestObject('Object Repository/Hotmail/Page_Verify Email KODE/span_Login ke Akun'))

WebUI.click(findTestObject('Object Repository/Hotmail/Page_Login ke KODE/div_Alamat Email'))

WebUI.setText(findTestObject('Object Repository/Hotmail/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting01@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Hotmail/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Hotmail/Page_Login ke KODE/button_Masuk'))

WebUI.delay(20)

