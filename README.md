Salesforce Marketing Cloud Java SDK (gmazza Fork)
===================================

This is a fork of Salesforce's Fuel-SDK 1.5.0 with the latest Log4J 
(2.17.1 as of this writing) and Apache CXF (3.5.0), and Gradle instead of Maven
used for the build.  Minimum JDK required is JDK 11.

Please see the [main branch](https://github.com/salesforce-marketingcloud/FuelSDK-Java)
for more information.

Latest CXF versions are listed [here](https://cxf.apache.org/download.html)
...and Log4J [here](https://logging.apache.org/log4j/2.x/download.html).

./gradlew dependencies | egrep 'cxf|log4j' can be used to confirm the above dependency
versions.

To build, ./gradlew clean build test

To run the tests (some of which are marked @Ignore as they don't presently work),
configure a fuelsdk.properties file in the root folder, following the 
fuelsdk.properties.template file.
