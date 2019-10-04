﻿# Scratch_Project

Configuration for Proquation

Follow the following steps to setup the environment for Proquation:
Clone the project folder from github.
https://github.com/Jennytsd7/Proquation.git
Create a new workspace in eclipse keeping the root directory of the cloned git repo.
Create a new maven project and select archetype as webapp. Enter “Group ID” as com.ser515 and “Artifact ID” as Proquation.
Right click on the project and go to Build path → Configure Build Path
Under the libraries select the correct jre version running on your system.
Download and configure environment variables for Maven version 3.6.2.
Check mvn -version in the command prompt.
Select project and then Run → Run As → Maven Install
Download Tomcat 8.0.50.
Under servers tab next to the console in eclipse, setup a new tomcat server and select the tomcat root directory which configuring.
