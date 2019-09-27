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

WebUI.setText(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Login ke KODE/input_Password_password'), 
    'b7O+JRsCsz74e265CFa56A==')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/Page_Login ke KODE/Page_Login ke KODE/button_Masuk'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Home - KODE/input_catalog_css-s6jaux'), 'Java')

WebUI.sendKeys(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Home - KODE/input_catalog_css-s6jaux'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Katalog Course - KODE/span_Mengenal Webpack JavaScript Module Bundler'))

WebUI.delay(35)

WebUI.setText(findTestObject('Object Repository/Ptolemy_FilterBelajar/Page_Mengenal Webpack JavaScript Module Bundler - Classroom - KODE/input_catalog_css-s6jaux'), 
    'Development')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Mengenal Webpack JavaScript Module Bundler - Classroom - KODE/Page_Mengenal Webpack JavaScript Module Bundler - Classroom - KODE/input_catalog_css-s6jaux'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Ptolemy_FilterBelajar/Page_Katalog Course - KODE/span_Full Stack Development Membuat Weather App'))

WebUI.delay(40)

WebUI.click(findTestObject('Ptolemy_FilterBelajar/Page_Full Stack Development Membuat Weather App - Classroom - KODE/video_Riza FahmiCurriculum Director Hacktiv8 Indonesia_jw-video jw-reset'))

WebUI.click(findTestObject('Ptolemy_FilterBelajar/Page_Full Stack Development Membuat Weather App - Classroom - KODE/Page_Full Stack Development Membuat Weather App - Classroom - KODE/div_NJ'))

WebUI.click(findTestObject('Ptolemy_FilterBelajar/Page_Full Stack Development Membuat Weather App - Classroom - KODE/Page_Full Stack Development Membuat Weather App/span_logout'))

