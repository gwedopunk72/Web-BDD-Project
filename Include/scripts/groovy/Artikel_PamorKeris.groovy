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



class Artikel_PamorKeris {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Klik SubMenu Pamor Keris")
	def Klik_SubMenu_Pamor_Keris() {
		WebUI.mouseOver(findTestObject('Page_Home/Menu_Artikel'))
		WebUI.click(findTestObject('Artikel/SubMenu_PamorKeris'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_CategoryArchivesPamorKeris'), 'CATEGORY ARCHIVES: PAMOR KERIS')
	}

	@When("Klik artikel Sejarah Pamor Keris")
	def Klik_artikel_Sejarah_Pamor_Keris() {
		WebUI.scrollToElement(findTestObject('Artikel/Artikel_SejarahPamorKeris'), 0)
		WebUI.click(findTestObject('Artikel/Artikel_SejarahPamorKeris'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_SejarahPamorKeris'), 'Sejarah Mengenai Asal Mula Pamor Keris')
		WebUI.back()
	}

	@And("Klik artikel Pamor Miring")
	def Klik_artikel_Pamor_Miring() {
		WebUI.click(findTestObject('Artikel/Artikel_PamorMiring'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_PamorMiring'), 'Apa itu Pamor Miring, Mlumah, Puntiran, Luluhan, Rekan dan Tiban?')
		WebUI.back()
	}

	@And("Klik artikel Pamor Akhodiyat")
	def Klik_artikel_Pamor_Akhodiyat() {
		WebUI.click(findTestObject('Artikel/Artikel_PamorAkhodiyat'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_PamorAkhodiyat'), 'Apa Itu Pamor Akhodiyat ??')
		WebUI.back()
	}

	@And("Klik artikel Asal Bahan Pamor")
	def Klik_artikel_Asal_Bahan_Pamor() {
		WebUI.click(findTestObject('Artikel/Artikel_AsalBahanPamor'))
		WebUI.verifyElementText(findTestObject('Artikel/Verifikasi/Title_AsalBahanPamor'), 'Mengenal Asal Usul dan Bahan Pamor Keris')
		WebUI.back()
	}

	@Then("Kembali ke menu utama2")
	def Kembali_ke_menu_utama2() {
		WebUI.click(findTestObject('Page_Home/Button_Home'))
		WebUI.delay(2)
		WebUI.verifyElementText(findTestObject('Page_Home/Verifikasi/HomeTitle_ProdukTerbaru'), 'PRODUK TERBARU')
	}
}