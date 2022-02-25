Salesforce Marketing Cloud Java SDK (gmazza Fork)
===================================

This is a fork of Salesforce's Fuel-SDK 1.5.0 with some bonuses:

* latest Log4J (2.17.1 as of this writing) to solve its recent security concerns
* latest Apache CXF (3.5.0)
* Salesforce WSDL from Feb. 2022 instead of the 2017 version in the main branch
* Gradle instead of Maven, minimum JDK 11

Please see the [main branch](https://github.com/salesforce-marketingcloud/FuelSDK-Java)
for regular information on the FuelSDK.

Latest CXF versions are listed [here](https://cxf.apache.org/download.html)
...and Log4J [here](https://logging.apache.org/log4j/2.x/download.html). 
`./gradlew dependencies | egrep 'cxf|log4j'` can be used to confirm the versions in this fork.

Latest Marketing Cloud WSDL available [here](https://webservice.exacttarget.com/ETFramework.wsdl).

Note the WSDL packaged in this fork has two modifications from the official WSDL as of 2022-02-19:
* To accommodate an architectural limitation in the FuelSDK I modified the Attribute element to extend APIObject
just as it does in the 2017 version used in the main branch.  Code should run fine as before.
* Just as was done in the 2017 WSDL, the contents of the ExtractResponseMsg were adjusted to what the SOAP API actually returns.
  (I've put in a helpdesk ticket with Marketing Cloud for them to update their WSDL so this adjustment will no longer be needed.)

Both of the above changes are commented in the WSDL in this fork.  (There are other comments in the WSDL, but those are
not from me but from the Salesforce WSDL.)

To build, `./gradlew clean build test`

To run the tests (some of which are marked @Ignore as they don't presently work),
configure a fuelsdk.properties file in the root folder, following the 
fuelsdk.properties.template file.
