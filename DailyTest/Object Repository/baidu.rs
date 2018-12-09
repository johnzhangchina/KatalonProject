<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>baidu</name>
   <tag></tag>
   <elementGuidId>da152772-7e6b-4c9e-9b93-c8213ec16859</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;contentType&quot;: &quot;multipart/form-data&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;,
  &quot;parameters&quot;: [
    {
      &quot;name&quot;: &quot;req&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;check&quot;
    },
    {
      &quot;name&quot;: &quot;fanyi_src&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;name&quot;
    },
    {
      &quot;name&quot;: &quot;direction&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;en2zh&quot;
    },
    {
      &quot;name&quot;: &quot;_&quot;,
      &quot;value&quot;: &quot;&quot;,
      &quot;type&quot;: &quot;1543235476901&quot;
    }
  ]
}</httpBodyContent>
   <httpBodyType>form-data</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>multipart/form-data</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://fanyi.baidu.com/pcnewcollection?req=check&amp;fanyi_src=name&amp;direction=en2zh&amp;_=1543235476901</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable
</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
