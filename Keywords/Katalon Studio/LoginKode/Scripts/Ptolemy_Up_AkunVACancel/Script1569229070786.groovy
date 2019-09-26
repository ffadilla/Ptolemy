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

WebUI.setText(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz74e265CFa56A==')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/Page_Login ke KODE/Page_Login ke KODE/button_Masuk'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Home - KODE/button_upgrade'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/div_pilihan paket berlangganan_css-1v5tprh'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/button_pilih metode pembayaran'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/div_Bank Central AsiaVirtual Account_flex br-100 items-center justify-center ml4 css-vld4n4'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/a_Lihat Nomor Rekening'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/a_Mohon Selesaikan Pembayaran'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/button_Cancel Order'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/button_Ya'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/input_catalog_css-s6jaux'), 
    'Python')

WebUI.sendKeys(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Subscription Page - KODE/input_catalog_css-s6jaux'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Katalog Course - KODE/span_Mengapa Object Oriented di Python Penting'))

WebUI.delay(30)

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Mengapa Object Oriented di Python Penting - Classroom - KODE/video_Riza FahmiCurriculum Director Hacktiv8 Indonesia_jw-video jw-reset'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Mengapa Object Oriented di Python Penting - Classroom - KODE/a_home'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Home - KODE/div_NJ'))

WebUI.click(findTestObject('Object Repository/Ptolemy_UpAkunVA/Page_Home - KODE/span_logout'))

