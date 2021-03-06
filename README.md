# Replyfast SDK For Java #
The easiest and recommended way for most developers to use the API is with our provided client libraries.

### Read This First ###
Using this SDK requires an API Key and Secret Key to establish a secure connection to the cloud.

### Paid Plan ###
Select a paid plan [here](https://www.aimmatic.com/get-x-class.html), in less than 30 seconds you get an email order confirmation with a link to create your secure login to the Developer Console. Login to the developer console to create an app, create an API key and keypairs, and access the API Reference.

###### Minimum requirements ######
To run the SDK you will need Java 1.8+.

##### Install the SDK #####
The recommended way to use the AimMatic SDK for Java in your project is to consume it from Maven. To do this edit your Maven settings.xml file to include the JCenter Repository:
```
<?xml version="1.0" encoding="UTF-8" ?>
<settings xsi:schemaLocation='http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd'
          xmlns='http://maven.apache.org/SETTINGS/1.0.0' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'>
    <profiles>
        <profile>
            <repositories>
                <repository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>central</id>
                    <name>bintray</name>
                    <url>https://jcenter.bintray.com</url>
                </repository>
            </repositories>
            <pluginRepositories>
                <pluginRepository>
                    <snapshots>
                        <enabled>false</enabled>
                    </snapshots>
                    <id>central</id>
                    <name>bintray-plugins</name>
                    <url>https://jcenter.bintray.com</url>
                </pluginRepository>
            </pluginRepositories>
            <id>bintray</id>
        </profile>
    </profiles>
    <activeProfiles>
        <activeProfile>bintray</activeProfile>
    </activeProfiles>
</settings>
```

And then include the following in the dependencies section of your pom.xml file:
```
<dependency>
    <groupId>com.aimmatic.natural</groupId>
    <artifactId>natural-voice-sdk-java</artifactId>
    <version>1.0.0</version>
</dependency>
```

### AimMatic Key Pair Lookup ###
The AimMatic API Key and Secret Key can be provided in 3 ways.

1. Provide at runtime using class `RuntimeCredentialsProvider`
```java
RuntimeCredentialsProvider.setAimMaticCredentials(...);
```
2. Provide via environment variables using variables `AIMMATIC_API_KEY` and `AIMMATIC_SECRET_KEY`
3. Provide via System properties using properties `aimmatic.apiKey` and `aimmatic.secretKey`

The Authentication process will lookup from option 1 through option 3. If it finds the credentials, then those credentials will be used for all subsequent requests.

To reset these credentials, invoke `Signature.resetLastUsedCredentialsProvider()` This will run the process again and repeat the lookup from option 1 through option 3.

### Running the tests ###
Tests for all APIs are found in the test folder. Before running the tests, edit BaseTest.java to configure AimMatic Key Pair settings and other parameters as appropriate.
