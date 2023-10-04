plugins {
    id("com.android.application")
}

android {
    namespace = "com.yassine.aiwebinsights"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.yassine.aiwebinsights"
        minSdk = 23
        targetSdk = 33
        versionCode = 2
        versionName = "2.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}


dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-inappmessaging:20.3.5")
    testImplementation("junit:junit:4.13.2")

    //applovin ads
    implementation ("com.applovin:applovin-sdk:11.11.3")


}