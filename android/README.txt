These libraries provide access to HealthVault from the Android environment.  The library does not provide support for marshalling method or type xml.  A sample application demonstrates how to connect with HealthVault.


Prerequisites:

    JDK 1.5+ installed as required for Android development
    Android SDK installed, see http://developer.android.com/sdk/index.html
    Maven 2.2.1+ installed, see http://maven.apache.org/download.html
    Set environment variable ANDROID_HOME to the path of your installed Android 
    SDK and add $ANDROID_HOME/tools as well as $ANDROID_HOME/platform-tools to your $PATH.


Building:

    >cd android-sdk
    >mvn install
    >cd examples/android-weight/android-weight-app
    >mvn install


Deploy from Command Line:

    mvn android:deploy


Using Eclipse:

    The following steps assume you already have the android tools installed 
    and can already build and run Android applications from Eclipse.

    Install M2Eclipse http://m2eclipse.sonatype.org/installing-m2eclipse.html
    Install install Maven Integration for Android Development Tools https://svn.codespot.com/a/eclipselabs.org/m2eclipse-android-integration/updates/m2eclipse-android-integration/
    Click File > Import > Maven > Existing Maven Project > Next
    Browse to the checked out source of the project
    Click Finish 

Issues:

You may see errors the class 'R' cannot be found. In this case, selecting Maven > Update Project Configuration should fix the problem.e
