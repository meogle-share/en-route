plugins {
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.meogle.enroute.core.data"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 28
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}

dependencies {
    api(project(":core:model"))
    api(libs.kotlinx.coroutines.core)
    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
}
