plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.meogle.enroute.mobile"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        // 폰 앱과 차량 앱이 같은 applicationId를 쓴다. 스토어 등록 1개로 두 폼팩터를 관리한다.
        applicationId = "com.meogle.enroute"
        minSdk = 28
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            optimization {
                enable = true
                packageScope = setOf("androidx.**", "kotlin.**", "kotlinx.**")
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(project(":core:data"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.lifecycle.runtime.compose)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3)
    debugImplementation(libs.androidx.compose.ui.tooling)
    testImplementation(libs.junit)
}
