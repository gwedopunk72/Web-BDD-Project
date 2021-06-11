import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Artikel_Dapur_Keris {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Klik SubMenu Dapur Keris")
	def Klik_SubMenu_Dapur_Keris() {
		WebUI.mouseOver(findTestObject('Page_Home/Menu_Artikel'))
		WebUI.click(findTestObject('Artikel/SubMenu_DapurKeris'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_DapurKeris'), 'CATEGORY ARCHIVES: DAPUR KERIS')
	}
	
	@When("Klik artikel Keris Brojol")
	def Klik_artikel_Keris_Brojol() {
		WebUI.scrollToElement(findTestObject('Artikel/Artikel_DapurKerisBrojol'), 0)
		WebUI.click(findTestObject('Artikel/Artikel_DapurKerisBrojol'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_DapurKerisBrojol'), 'Ragam Jenis Dapur Keris Brojol')
		WebUI.back()
	}

	@And("Klik artikel Dapur keris luk 9")
	def Klik_artikel_Dapur_keris_luk_9() {
		WebUI.click(findTestObject('Artikel/Artikel_DapurKerisLuk9'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_DapurKerisLuk9'), '16 Nama Dapur Keris Luk 9')
		WebUI.back()
	}
	
	@And("Klik artikel Dapur Keris Lurus")
	def Klik_artikel_Besalen() {
		WebUI.click(findTestObject('Artikel/Artikel_DapurKerisLurus'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_DapurKerisLurus'), '63 Nama Dapur Keris Lurus Menurut Pakem Jawa')
		WebUI.back()
	}
	
	@And("Klik artikel Apa Itu Dapur Keris")
	def Klik_artikel_Apa_Itu_Dapur_Keris() {
		WebUI.click(findTestObject('Artikel/Artikel_ApaItuDapurKeris'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_ApaItuDapurKeris1'), 'Apa Itu Dapur Keris ?')
	}

	@Then("Kembali ke menu utama1")
	def Kembali_ke_menu_utama1() {
		WebUI.click(findTestObject('Page_Home/Button_Home'))
		WebUI.delay(2)
		WebUI.verifyElementText(findTestObject('Page_Home/Verifikasi/HomeTitle_ProdukTerbaru'), 'PRODUK TERBARU')
	}
}