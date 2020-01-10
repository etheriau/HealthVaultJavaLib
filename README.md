## Overview

This is a library to integrate with the CHBase systems using the now defunct HealthVault-style API.

### History

This project was imported from https://archive.codeplex.com/?p=healthvaultjavalib

It contains the latest 1.6.0 version from there plus the patches I have submitted
to that project over the time it was maintained on that project.  Those patches
include porting this to use the slf4j framework and other embeddability and
testability changes.

The official Microsoft version is in https://github.com/microsoft/healthvault-java-sdk

This also includes differences from https://github.com/CHBase/chbase-java-sdk for
support CHBase.

### Maven Repository

Versions of the compiled library is available for easy use within maven and gradle
projects. Thanks to https://cloudsmith.io/ for the free hosting.

For Maven:

    <!-- Add respository -->
    <repositories>
      <repository>
        <id>eric-theriault-open-source</id>
        <url>https://dl.cloudsmith.io/public/eric-theriault/open-source/maven</url>
        <releases>
          <enabled>true</enabled>
          <updatePolicy>always</updatePolicy>
        </releases>
        <snapshots>
          <enabled>true</enabled>
          <updatePolicy>always</updatePolicy>
        </snapshots>
      </repository>
    </repositories>
    
    <!-- Then add the dependency -->
    <dependency>
      <groupId>healthvault</groupId>
      <artifactId>hv-sdk</artifactId>
      <version>1.6.1</version>
    </dependency>

For Gradle:

    // Add the repository...
    repositories {
      maven {
        url "https://dl.cloudsmith.io/public/eric-theriault/open-source/maven"
    
      }
    }
    // Then add the version
    compile group: 'healthvault:hv-sdk:1.6.1'

### Building

The build environment relies on Maven which you can download from http://maven.apache.org

Build from the top level pom.xml:

    mvn install

To build the javadocs, simply:

    mvn javadoc:javadoc


### Eclipse

To create Eclipse environment

    mvn eclipse:eclipse

Once this is done, in Eclipse:

* Import the project into your workspace via File -> Import
* If Eclipse cannot find all of the dependencies, you may need to configure the M2_REPO by setting it in Project -> Properties -> Build Path to your maven repository; this is usually in  `<user_home>.m2/repository`

### IntelliJ

To use this in your IntelliJ configuration, simply open the directory which you checked this out and it should just work out of the box.

### Private Key

Healthvault/CHBase uses public/private key infrastructure to verify the application.  It does not validate the public key certificate chain so there is no need to obtain keys from a trusted CA.  The healthVault/CHBase java sdk uses the JSSE keystore to obtain the application's private key.  The keystore file is loaded from the classpath and is shipped with the name "/keystore".  The following entries in hv-application configure its use:

    keystore.filename=/keystore
    keystore.keyname=java-wildcat
    keystore.password=password

The jdk ships with a tool to create and manage keys within this store: keytool: http://java.sun.com/javase/6/docs/technotes/tools/windows/keytool.html

The instructions for how to generate a public/private key pair are described in the documentation for the 
com.microsoft.hsg.DefaultPrivateKeyStore class:

    keytool -genkeypair -keyalg RSA -keysize 1024 -keystore keystore -alias java-wildcat -validity 9999

This creates a file named "keystore" if it doesn't already exist and the generated keys are placed within.  The password for the keystore and the key must be the same.  You may choose other values for the keystore name and the key alias, but they must correspond to configuration values in hv-application.properties.

The public key certificate must then be exported from the key store and sent to the partner team.  

To export the key:

    keytool -export -alias java-wildcat -keystore keystore > my-pub.cer

Upload the my-pub.cer file to CHBase or send the my-pub.cer file to the HealthVault team and they'll take care of the rest.

### Making SDK Requests

The application is responsible for marshaling and unmarshaling the <info> section in each HV Request.  You can find detailed schemas for each method here:  http://developer.healthvault.com/methods/methods.aspx or https://developer.chbase.com/ .

### SSL

CHBase requires requests be sent over SSL. These certificates are signed by reputable Certificate Authorities whose trusted root certificates is provided with the Java runtime.

### Contributions

If you do notice any issues in the documentation or the code, please submit a patch or at least let us know.