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

//这里定义三个变量，用于等会儿for循环里Excel中的数据定位
int a = 1

int b = 2

int c = 2

def objectRepositoryFile = 'Cookie testing/'

def objectRepositoryName = 'Login From data'

def objectRepositoryNumber = 1

def testObjectLoginForm = "$objectRepositoryFile$objectRepositoryName $objectRepositoryNumber"

println(testObjectLoginForm)

WebUI.openBrowser('http://www.51zxw.net/login/')

WebUI.waitForPageLoad(30)

// 这里是一个循环，用于输入用户名和密码， 因为都是输入操作，变化的只是定位器里的数据，我们这里把定位器里的xpath参数化，放到Excel里面去取值
for (int i = 0; i < 2; i++) {
    WebUI.click(findTestObject(testObjectLoginForm, [('xpath') : findTestData('Test Data').getValue(a, c)]))

    WebUI.setText(findTestObject(testObjectLoginForm, [('xpath') : findTestData('Test Data').getValue(a, c)]), findTestData('Test Data').getValue(
            c, b))

    c++
}

/*  这里是我们平常写的代码，重复的两个输入，一个输入用户名，一个输入密码
WebUI.click(findTestObject('Cookie testing/Login From data 1', [('xpath') : findTestData('Test Data').getValue(1, 2)]))

WebUI.setText(findTestObject('Cookie testing/Login From data 1', [('xpath') : findTestData('Test Data').getValue(1, 2)]), findTestData(
        'Test Data').getValue(2, 2))

WebUI.click(findTestObject('Cookie testing/Login Form data 2', [('xpath') : findTestData('Test Data').getValue(1, 3)]))

WebUI.setText(findTestObject('Cookie testing/Login Form data 2', [('xpath') : findTestData('Test Data').getValue(1, 3)]), 
    findTestData('Test Data').getValue(3, 2))
*/

//WebUI.click(findTestObject('Cookie testing/login button'))

WebUI.click(myPredefinedObject = findTestObject('Login button Comman'))


