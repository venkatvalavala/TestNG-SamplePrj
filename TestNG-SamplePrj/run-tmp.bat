set projectLocation=C:\Users\sreer\venkat-java\workspace\TestNG-SamplePrj
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
