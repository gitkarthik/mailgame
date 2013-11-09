@echo off
call set-environment.cmd
start /B C:\software\eclipse\eclipse.exe -data C:\learn\mailgame -vm %JAVA_HOME%\bin\javaw.exe -Xmx1024m -Xms128m
exit /B
