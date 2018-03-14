#!/bin/bash
source /etc/profile 
mvn -v
cd /zj/test/Test
mvn clean install
cd /target
java -jar Test-1.2.5.RELEASE.jar
