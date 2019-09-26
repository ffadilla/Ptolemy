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

Mobile.startApplication('C:\\Users\\SOETIDJAN PALACE\\Downloads\\app-universal-release.apk', true)

Mobile.delay(15, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup16'), 10)

Mobile.swipe(0, 1000, 0, 0)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup28'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup11'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup10'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup9'), 10)

Mobile.delay(300)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup20'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup10 (1)'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup10 (2)'), 10)

Mobile.tap(findTestObject('TC4/android.view.ViewGroup6'), 10)

Mobile.closeApplication()

