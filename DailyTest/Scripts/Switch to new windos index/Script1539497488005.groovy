import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent

def a

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.w3school.com.cn/js/js_comments.asp')

WebUI.mouseOver(findTestObject('Object Repository/SwitchToNewWindosIndex/Page_JavaScript/TryItButton'))

not_run: WebUI.click(findTestObject('SwitchToNewWindosIndex/Page_JavaScript/TryItButton'), FailureHandling.STOP_ON_FAILURE)

a = WebUI.getText(findTestObject('SwitchToNewWindosIndex/Page_JavaScript/TryItButton'), FailureHandling.OPTIONAL)

println(a)

Robot robot = new Robot()

robot.keyPress(KeyEvent.VK_CONTROL)

robot.keyPress(KeyEvent.VK_T)

robot.keyRelease(KeyEvent.VK_CONTROL)

robot.keyRelease(KeyEvent.VK_T)

WebUI.switchToWindowIndex(1)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

