@echo off
cd C:\Users\Ben\Documents\NetBeansProjects\GUIFormExamples1\apache-jmeter-3.1\bin\
jmeter -n -t C:\Users\Ben\Documents\NetBeansProjects\GUIFormExamples1/addFullMerchant1494410412040.jmx -l C:\Users\Ben\Documents\NetBeansProjects\GUIFormExamples1\scriptresults.jtl
taskkill /im cmd.exe