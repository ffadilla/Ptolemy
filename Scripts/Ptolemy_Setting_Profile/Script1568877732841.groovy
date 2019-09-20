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

WebUI.setText(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz74e265CFa56A==')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/Page_Login ke KODE/Page_Login ke KODE/button_Masuk'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Home - KODE/div_EE'))

WebUI.click(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Home - KODE/a_Pengaturan Akun'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Depan_firstName'))

WebUI.clearText(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Depan_firstName'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Depan_firstName'), 
    'Mic')

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Belakang_lastName'))

WebUI.clearText(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Belakang_lastName'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Nama Belakang_lastName'), 
    'Jegger')

WebUI.click(findTestObject('Ptolemy_AturAkun_NoHP/Page_Profil Saya - KODE/div_Laki-laki_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_Perempuan'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_Tanggal_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_4'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_Feb_css-1gtu0rj-indicatorContainer'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_Jul'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/div_Tahun_css-1gtu0rj-indicatorContainer'))

WebUI.scrollToElement(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/Page_Profil Saya - KODE/div_2002'), 
    5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToPosition(30, 0)

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Alamat_address'))

WebUI.clearText(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Alamat_address'))

WebUI.setText(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/input_Alamat_address'), 'Jalan Jalan Kuy')

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/button_personal development'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/button_marketing'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/button_business'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/button_development'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/button_Simpan Perubahan'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Profil Saya - KODE/a_catalog'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Katalog Course - KODE/div_EE'))

WebUI.click(findTestObject('Ptolemy_SettingProfile/Page_Katalog Course - KODE/span_logout'))

