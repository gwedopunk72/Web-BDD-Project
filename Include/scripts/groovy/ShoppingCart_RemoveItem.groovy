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



class ShoppingCart_RemoveItem {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Pilih menu continue shopping")
	def Pilih_menu_continue_shopping() {
		WebUI.click(findTestObject('ShoppingCart/Button_Continue shopping'))
	}

	@When("Pilih menu view cart")
	def Pilih_menu_view_cart() {
		WebUI.mouseOver(findTestObject('ShoppingCart/Cart_TopRightCorner'))
		WebUI.click(findTestObject('ShoppingCart/Button_View cart'))
	}

	@And("Remove item dari cart")
	def Klik_artikel_Pamor_Miring() {
		WebUI.click(findTestObject('ShoppingCart/Button_CloseX'))
	}

	@Then("Item keris terhapus")
	def Item_keris_terhapus() {
		WebUI.verifyElementText(findTestObject('ShoppingCart/Verif_YourCartEmpty'), 'Your cart is currently empty.')
		WebUI.closeBrowser()
	}
}