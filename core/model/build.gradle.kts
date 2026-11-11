import org.jetbrains.kotlin.gradle.dsl.JvmTarget

// Android 의존성이 없는 순수 Kotlin 모듈. 빌드가 빠르고 JVM 단위 테스트로 검증한다.
plugins {
    alias(libs.plugins.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

dependencies {
    testImplementation(libs.junit)
}
