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



class MyAccount_EditAccountDetails {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Pilih menu acount details")
	def Pilih_menu_acount_details() {
		WebUI.click(findTestObject('MyAccount/Menu_AccountDetails'))
	}
	
	@When("Edit first name")
	def Edit_first_name() {
		WebUI.setText(findTestObject('MyAccount/Edit_AccountDetails/input__account_first_name'), 'Iwak')
	}
	
	@And("Edit last name")
	def Edit_last_name() {
		WebUI.setText(findTestObject('MyAccount/Edit_AccountDetails/input__account_last_name'), 'Asin')
	}
	
	@Then("Pilih save changes")
	def Pilih_save_changes() {
		WebUI.click(findTestObject('MyAccount/Edit_AccountDetails/Button_SaveChanges'))
		WebUI.delay(5)
		WebUI.closeBrowser()
	}
}