# optaplanner-osgi-test
Bundle to replicate the problem of optaplanner on OSGI

HOW TO REPLICATE THE PROBLEM


* Download Servicmix 5.4.0 and unzip it  (http://servicemix.apache.org/downloads.html)
* compile this bundle (mvn install)
* copy the jar from the bundle target dir into the servicemix deploy dir
* start servicemix (on unix ./servicemix from servicemix bin dir)
* from karaf lunch this command: features:install camel-optaplanner this command resolves all dependecies

