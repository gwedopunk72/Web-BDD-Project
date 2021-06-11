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



class MyAccount_ChangeBillingAddresses {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Pilih menu my account")
	def Pilih_menu_my_account() {
		WebUI.click(findTestObject('Page_Home/Button_MyAccount'))
	}

	@When("Pilih addresses")
	def Pilih_addresses() {
		WebUI.click(findTestObject('MyAccount/Menu_Addresses'))
	}

	@And("Pilih menu edit")
	def Pilih_menu_edit() {
		WebUI.click(findTestObject('MyAccount/Button_EditBillingAddress'))
	}

	@And("Fill data")
	def Fill_data() {
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_first_name'), 'Bakul')
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_last_name'), 'Akik')
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_address_1'), 'Sleman')
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_city'), 'Yogyakarta')
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_postcode'), '55181')
		WebUI.setText(findTestObject('MyAccount/Edit_BillingAddress/input__billing_phone'), '085643739891')
	}

	@Then("Pilih save address")
	def Pilih_save_address() {
		WebUI.click(findTestObject('MyAccount/Edit_BillingAddress/Button__save_address'))
		WebUI.delay(5)
	}
}