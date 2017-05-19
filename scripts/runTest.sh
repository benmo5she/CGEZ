set newdate=%date:~6,4%_%date:~3,2%_%date:~0,2%_%time:~0,2%%time:~3,2%
rename testResult.jtl testResult%newdate%.jtl
for i in `cat test_list.txt`
do
	../apache-jmeter-2.10/bin/jmeter.sh -n -t ${i}.jmx -j ${i}.log -l ${i}.jtl
done
