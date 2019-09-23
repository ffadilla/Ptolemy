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

WebUI.setText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Login ke KODE/input_Alamat Email_email'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Login ke KODE/input_Password_password'), 'b7O+JRsCsz74e265CFa56A==')

WebUI.sendKeys(findTestObject('Ptolemy_FilterBelajar/Page_Login ke KODE/Page_Login ke KODE/Page_Login ke KODE/button_Masuk'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Home - KODE/button_upgrade'))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/div_pilihan paket berlangganan_css-1v5tprh'))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/button_pilih metode pembayaran'))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/div_Visa  Mastercard_flex br-100 items-center justify-center ml4 css-vld4n4'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/input_Nomor Kartu_ccc'), '4000000000000002')

WebUI.setText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/input_Nama Pemegang Kartu_ccHolder'), 
    'Ferri')

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/div_Bulan'))

WebUI.setText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/input_Bulan_ccExpMonth'), 
    '01')

WebUI.setText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/input_Tahun_ccExpYear'), '23')

WebUI.setEncryptedText(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/input_CVV_ccCVV'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/button_Konfirmasi Pembayaran'))

WebUI.delay(7)

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/button_Cancel Membership'))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/button_Ya'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/div_NJ'))

WebUI.click(findTestObject('Object Repository/Ptolemy_Upgrade/Page_Subscription Page - KODE/span_logout'))

