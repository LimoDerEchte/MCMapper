import io.github.cdimascio.dotenv.Dotenv
import io.github.cdimascio.dotenv.DotenvBuilder

plugins {
    id("java")
    id("maven-publish")
}

group = "com.cactusteam"
version = "1.3"

if(System.getenv("JITPACK") != null) {
    tasks.withType<GenerateModuleMetadata> {
        enabled = false
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

val sourcesJar by tasks.registering(Jar::class) {
    archiveClassifier.set("sources")
    from(sourceSets.main.get().allSource)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            artifact(sourcesJar.get())
        }
        repositories {
            maven {
                name = "cactus"
                url = uri("https://mvn.cactusmod.xyz/repository/cactus/")
                credentials {
                    val dotenv: Dotenv = DotenvBuilder()
                        .directory(rootDir.absolutePath)
                        .load()
                    username = dotenv["MVN_USER"]
                    password = dotenv["MVN_PASS"]
                }
            }
        }
    }
}