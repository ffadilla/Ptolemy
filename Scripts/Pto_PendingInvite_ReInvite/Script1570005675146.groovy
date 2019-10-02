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

WebUI.setText(findTestObject('Object Repository/Pto_Reinvite/Page_Login ke KODE/input_Alamat Email_email'), 'kodetesting02@hotmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Pto_Reinvite/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.sendKeys(findTestObject('Pto_ExpiredInvitation/Page_Login ke KODE/button_Masuk'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_Home - KODE/div_Jony'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_Home - KODE/a_People'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_KODE/a_Pending Invites'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_KODE/i_Remarks_fal fa-square css-0'))

WebUI.selectOptionByValue(findTestObject('Pto_CancelInvitation/Page_KODE/select_Select ActionRe-inviteCancel Invitation'), 
    'reinvite', true, FailureHandling.OPTIONAL)

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_KODE/button_Ok'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_KODE/div_Jony'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_KODE/span_logout'))

WebUI.navigateToUrl('https://id.yahoo.com/')

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_Yahoo/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Pto_Reinvite/Page_Yahoo -masuk/input_Masukkan Kode Negara_username'), 'kodetesting05@yahoo.com')

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_Yahoo -masuk/input_Masukkan Kode Negara_signin'))

WebUI.setEncryptedText(findTestObject('Object Repository/Pto_Reinvite/Page_Yahoo/input_BukanAnda_password'), 'b7O+JRsCsz7V7rjbOYIJ/g==')

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_Yahoo/button_Masuk'))

WebUI.click(findTestObject('Pto_CancelInvitation/Page_Yahoo/a_Email'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_(9 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/span_Undangan bergabung ke KODE dari PT PALUGADA'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_(8 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/span_Kembali'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_(8 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/label_Kode'))

WebUI.click(findTestObject('Object Repository/Pto_Reinvite/Page_(8 belum dibaca) - kodetesting05yahoocom - Yahoo Mail/span_Keluar'))

