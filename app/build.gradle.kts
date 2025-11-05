plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.mrlnt.qrcamera"
    compileSdk = 36 // Pastikan Anda sudah menginstal SDK 36

    defaultConfig {
        applicationId = "com.mrlnt.qrcamera"
        minSdk = 33
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    // Anda mungkin perlu menambahkan ini untuk CameraX
    buildFeatures {
        viewBinding = true // Opsional, tapi sangat membantu
    }
}

// ... (Bagian atas file)

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    val cameraxVersion = "1.4.1"

    // 2. Dependensi menggunakan notasi 'implementation("string:string:version")'
    implementation("androidx.camera:camera-core:$cameraxVersion")
    implementation("androidx.camera:camera-camera2:$cameraxVersion")
    implementation("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation("androidx.camera:camera-view:$cameraxVersion")
    implementation("com.google.mlkit:barcode-scanning:17.2.0")
}