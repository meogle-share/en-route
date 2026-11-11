pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // Pleos 차량 SDK. 이 저장소에서는 ai.pleos.playground 그룹만 받는다.
        maven {
            url = uri("https://nexus-playground.pleos.ai/repository/maven-releases/")
            content {
                includeGroup("ai.pleos.playground")
            }
        }
    }
}

rootProject.name = "en-route"

// 앱 모듈: 실행 가능한 APK 1개씩
include(":app-mobile")
include(":app-automotive")

// 공용 모듈: 두 앱이 함께 사용. Pleos SDK를 참조하면 안 된다.
include(":core:model")
include(":core:data")
