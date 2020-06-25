@echo off
setlocal enableextensions
if not exist "target\dependency" mkdir "target\dependency"
endlocal
cd target\dependency
"%JAVA_HOME%\bin\jar" -xf ../*.jar
cd ..
cd ..
docker build .