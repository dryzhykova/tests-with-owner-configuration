# Owner Library is used for setting up tests configuration environment

Run API tests:
 - with file configuration: ```gradlew clean test --tests ApiTests.getTokenAndUrlFromFile```
 - with system properties parameters: ```gradlew clean test --tests ApiTests.getTokenAndUrlFromSystemProperties -Dtoken=987654321 -Durl=https://google.com```
 
 Run Web tests:
 - with local file configuration: ```gradlew clean test --tests WebTests.runWithLocalConfigFile -Dstate=local```
 - with remote file configuration: ```gradlew clean test --tests WebTests.runWithLocalConfigFile -Dstate=remote```
 
 <()
 