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

WebUI.setText(findTestObject('Object Repository/Home_CariKelas/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Home_CariKelas/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz74e265CFa56A==')

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_Login ke KODE/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_Home - KODE/button_Cari Kelas'))

WebUI.scrollToElement(findTestObject('Home_CariKelas/Page_Katalog Course - KODE/span_Versioning Control Menggunakan GIT'), 
    0)

WebUI.scrollToPosition(10, 0)

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_Katalog Course - KODE/span_Versioning Control Menggunakan GIT'))

WebUI.delay(35)

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_KODE/a_home'))

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_Home - KODE/a_Lihat Semua'))

WebUI.waitForElementPresent(findTestObject('Home_CariKelas/Page_Kelas Saya - KODE/span_Kelas yang Sedang Saya Ambil'), 100)

WebUI.click(findTestObject('Object Repository/Home_CariKelas/Page_Kelas Saya - KODE/a_catalog'))

WebUI.click(findTestObject('Home_CariKelas/Page_Katalog Course - KODE/Page_Katalog Course - KODE/div_EE'))

WebUI.click(findTestObject('Home_CariKelas/Page_Katalog Course - KODE/Page_Katalog Course - KODE/Page_Katalog Course - KODE/span_logout'))

