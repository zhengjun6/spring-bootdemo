#!/bin/bash
export maven=/usr/local/apache-maven-3.5.2  
export $PATH=$PATH:$maven/bin
mvn -v
