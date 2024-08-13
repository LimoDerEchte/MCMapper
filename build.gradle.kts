plugins {
    id("java")
    id("maven-publish")
}

group = "com.github.LimoDerEchte"
version = "SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}