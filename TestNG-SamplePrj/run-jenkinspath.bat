set projectLocation=C:\Program Files (x86)\Jenkins\workspace\GiJenkins-TestNGSamplePrj\TestNG-SamplePrj\
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
