plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.template.android"
    compileSdk = Dependencies.AndroidDependencies.compileSDK
    defaultConfig {
        applicationId = "com.example.template.android"
        minSdk = Dependencies.AndroidDependencies.minSDK
        targetSdk = Dependencies.AndroidDependencies.targetSDK
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.3.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":sharedCompose"))
    implementation(Dependencies.AndroidDependencies.composeUI)
    implementation(Dependencies.AndroidDependencies.composeTooling)
    implementation(Dependencies.AndroidDependencies.composePreview)
    implementation(Dependencies.AndroidDependencies.composeActivity)
}