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

WebUI.setText(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz74e265CFa56A==')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/Page_Login ke KODE/Page_Login ke KODE/button_Masuk'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Home - KODE/Page_Home - KODE/div_NJ'))

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Home - KODE/Page_Home - KODE/a_Pengaturan Akun'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/input_Nama Depan_firstName'), 
    'Ferri')

WebUI.setText(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/input_Nama Belakang_lastName'), 
    'Fadill')

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Laki-laki_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Perempuan'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_ option 2 focused 2 of 31'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_5'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Feb_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Jun'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Tahun_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_2012'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/input_Alamat_address'), 'Jalan Jalan Kane Kali Nih')

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/button_Ubah Nomor'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/input_Nomor Baru_phoneNumber'), 
    '087743180151')

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/button_Request Kode OTP'))

WebUI.setText(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/input_Verifikasi Nomor Handphone_css-1oku0es'), 
    '507371')

WebUI.delay(10)

WebUI.scrollToPosition(0, 30)

WebUI.click(findTestObject('Object Repository/Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/button_Ubah Nomor'))

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/Page_Profil Saya - KODE/div__absolute top-0 right-0 outline-0 pointer'))

WebUI.scrollToPosition(10, 40)

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/button_Simpan Perubahan'))

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/div_NJ'))

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/Page_Profil Saya - KODE/span_logout'))

