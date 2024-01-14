echo off
@echo off
if "%1"=="CreateTable" (
    REM Command to compile Java source file
    echo Compiling....
    javac CreateTable.java
    echo Compilation success, next step: run
    pause
    REM Command to run Java program
    echo Running
    java -cp ".;lib/mysql-connector-j-8.2.0.jar" CreateTable
)
echo Choose valid option
