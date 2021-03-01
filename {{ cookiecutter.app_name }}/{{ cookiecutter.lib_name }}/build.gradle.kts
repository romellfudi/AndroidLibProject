plugins{
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}
apply(from = "../ktlint.gradle.kts")

android {
    compileSdkVersion( 29)
    buildToolsVersion("29.0.3")
    defaultConfig {
        minSdkVersion (16)
        targetSdkVersion (29)
        versionCode = 1
        versionName = "1.0.a"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release" ) {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

//    lintOptions {
//        abortOnError = false
//    }
//    testOptions {
//        unitTests.returnDefaultValues = true
//    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
//    implementation("com.android.support:appcompat-v7:$rootProject.supportLibraryVersion")
    testImplementation( "junit:junit:4.12")
    testImplementation ("org.mockito:mockito-all:1.10.19")
    testImplementation ("org.powermock:powermock-module-junit4:1.6.2")
    testImplementation( "com.nhaarman.mockitokotlin2:mockito-kotlin:2.1.0")
    testImplementation( "org.powermock:powermock-api-mockito:1.6.2")
    testImplementation ("io.mockk:mockk:1.9.3")
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.3.70")

}
