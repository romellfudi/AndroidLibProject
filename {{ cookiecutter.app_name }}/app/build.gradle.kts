plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
    id("androidx.navigation.safeargs.kotlin")
}
apply(from = "../ktlint.gradle.kts")
android {
    compileSdkVersion(29)
    buildToolsVersion("29.0.3")

    defaultConfig {
        applicationId = "{{ cookiecutter.package_name }}"
        minSdkVersion(23)
        targetSdkVersion(29)
        versionCode = 1
        versionName = "{{ cookiecutter.version_package_name }}"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }
    buildTypes {
        getByName("debug") {
            buildConfigField("String", "BASE_URL", "\"http://www.mocky.io/v2\"")
            buildConfigField("String", "API_KEY", "\"ABCXYZ123TEST\"")
        }
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
            buildConfigField("String", "BASE_URL", "\"http://www.mocky.io/v2\"")
            buildConfigField("String", "API_KEY", "\"ABCXYZ123TEST\"")
        }
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}
dependencies {
    implementation("androidx.cardview:cardview:1.0.0")
//    implementation("androidx.navigation:navigation-ui-ktx:2.3.3")
//    implementation("androidx.navigation:navigation-fragment-ktx:2.3.3")
    implementation(fileTree(mapOf("dir" to "libs","include" to listOf("*.jar"))))
    implementation(project(":{{ cookiecutter.lib_name }}"))

    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.70")

    // Architecture
    implementation("androidx.core:core-ktx:1.2.0")
    implementation("androidx.appcompat:appcompat:1.1.0")
    implementation("androidx.navigation:navigation-ui:2.2.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.2.2")
    implementation("androidx.navigation:navigation-fragment:2.2.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.2.2")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation("androidx.coordinatorlayout:coordinatorlayout:1.1.0")

    // Material
    implementation("com.google.android.material:material:1.1.0")

    // Third Party
    implementation("com.leinardi.android:speed-dial:3.1.1")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.6.0")
    implementation("com.squareup.retrofit2:converter-gson:2.6.0")

    // Persistence
    implementation("android.arch.persistence.room:runtime:1.1.1")
    kapt("android.arch.persistence.room:compiler:1.1.1")

    // Glide
    kapt("android.arch.lifecycle:compiler:1.1.1")
    kapt("com.github.bumptech.glide:compiler:4.10.0")
    implementation("com.github.bumptech.glide:glide:4.10.0")

    // Koin
    implementation("org.koin:koin-android:2.0.1")
    implementation("org.koin:koin-androidx-scope:2.0.1")
    implementation("org.koin:koin-androidx-viewmodel:2.0.1")

    // Test
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test.ext:junit:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.2.0")
    // reactive
    implementation("io.reactivex.rxjava2:rxjava:2.0.6")
    implementation("io.reactivex.rxjava2:rxandroid:2.0.1")
}