Test screenshots for the Front end are provided in the Document:  TestCase.docx.
The document also contains the test cases for Web Services. The test scripts for web services 
are in the zip file : TestScripts4WebService.zip

How to test our web services:
1- Download soapui from http://sourceforge.net/projects/soapui/files/soapui/4.6.0/
2- In soapui >bin, open soapui.bat
3- After the program runs, click on file-> import project. open the Scripts  folder under test cases and choose which web service you want to test. 
4- In eclipse, click on MusicZoneBackend project and choose run on server. 
5- Back to soapui, under the project choose the WebServiceImpIPortBinding and choose the method that you want to test. Under each method name, you can find many test cases. 
6- Open a test case and press on the green arrow (submit request to specified endpoint url). 
7- Now you can vary the inputs in the left window and see the output in the right window after you submit the request in the same way you did in step 6.

Note: in the Testing-Order-Processor-soapui-project, Make sure you need run case case 7- Correct info in the beginning.
Other cases's data are depend on case 7- Correct info.
