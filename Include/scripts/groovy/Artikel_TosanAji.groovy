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



class Artikel_TosanAji {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open site duniakeris")
	def Open_site_duniakeris() {
		WebUI.openBrowser('https://duniakeris.com/')
		WebUI.maximizeWindow()
	}

	@When("Klik menu Artikel")
	def Klik_menu_Artikel() {
		WebUI.mouseOver(findTestObject('Page_Home/Menu_Artikel'))
		WebUI.click(findTestObject('Artikel/SubMenu_TosanAJi'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_ArchivesTosanAji'), 'CATEGORY ARCHIVES: TOSAN AJI')
	}

	@And("Klik artikel keris bali")
	def Klik_artikel_keris_bali() {
		WebUI.scrollToElement(findTestObject('Artikel/Artikel_MengenalKerisBali'), 0)
		WebUI.click(findTestObject('Artikel/Artikel_MengenalKerisBali'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_MengenalKerisBali'), 'Mengenal Keris Bali')
		WebUI.back()
	}

	@And("Klik artikel jenis keris")
	def Klik_artikel_jenis_keris() {
		WebUI.click(findTestObject('Artikel/Artikel_JenisKeris'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_JenisKeris'), 'Mengenal Jenis Besi Keris Tosan Aji Beserta Tuah Khasiatnya')
		WebUI.back()
	}

	@And("Klik artikel Besalen")
	def Klik_artikel_Besalen() {
		WebUI.click(findTestObject('Artikel/Artikel_Besalen'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_Besalen'), 'Besalen, Tempat Dimana Keris Dibuat')
		WebUI.back()
	}

	@And("Klik artikel keris rucah")
	def Klik_artikel_keris_rucah() {
		WebUI.click(findTestObject('Artikel/Artikel_KerisRucah'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_KerisRucah'), 'Apa itu Keris Rucah ??')
	}

	@Then("Kembali ke menu utama")
	def Kembali_ke_menu_utama() {
		WebUI.click(findTestObject('Page_Home/Button_Home'))
		WebUI.delay(2)
		WebUI.verifyElementText(findTestObject('Page_Home/Verifikasi/HomeTitle_ProdukTerbaru'), 'PRODUK TERBARU')
	}
}