for testing you need to do the following:

1. Set the proper server/terminal/user login-password in config.csv
2. Make sure you set the enviroment varaible JMETER_PATH:
	a. Window use "setx JMETER_PATH <path>"
	b. Linux use "export JMETER_PATH=<path>"
3. Have the proper test list in test_list.txt
4. Run the tests by running runTest.bat/sh
5. The result will be in the file testResult.jtl. You can drop the file on excel to get a quick look of success/fails. Choose to apply stylesheat and approve the following question.
6. testResult.jtl can also be shown in jmeter with additional details. run
	viewResults.bat/sh and go to the node "View Results Tree". Click 'Browse' and select the file again and the results can be seen.
