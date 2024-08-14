
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}

buildscript {
    dependencies {
        classpath("io.github.cdimascio:dotenv-kotlin:6.4.1")
    }
}

rootProject.name = "MCMapper"
