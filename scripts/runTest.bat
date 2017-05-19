set newdate=%date:~6,4%_%date:~3,2%_%date:~0,2%_%time:~0,2%%time:~3,2%
rename testResult.jtl testResult%newdate%.jtl
FOR /F "tokens=*" %%i in (..\tests\test_list.txt) DO (
%JMETER_PATH%\jmeter.bat -n -t ..\tests\%%i.jmx -j jmeter.log -l testResult.jtl -p user.properties
)
