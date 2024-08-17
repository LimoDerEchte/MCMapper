> [!WARNING]
> This is a WIP project! It won't be completed rn!

# MCMapper
MCMapper is a project by cactusteam that is created for the cactusmod MCStacker-like feature. It is available completely free, as we couldn't find anything like it before.

## Installation
### Gradle
If you are using **Gradle** with the **Groovy DSL**, add the following to your `build.gradle` file:
```groovy
repositories {
    maven {
        url 'https://mvn.cactusmod.xyz/repository/cactus/'
    }
}

dependencies {
    implementation "com.cactusteam:MCMapper:1.3"
}
```
If you are using **Gradle** with the **Kotlin DSL**, add the following to you `build.gradle.kts` file.
```kotlin
repositories {
    maven {
        url = uri("https://mvn.cactusmod.xyz/repository/cactus/")
    }
}

dependencies {
    implementation("com.cactusteam:MCMapper:1.3")
}
```
### Maven
If you are using **Maven**, add the following to your `pom.xml` file:
```xml
<repositories>
    <repository>
        <id>cactus-repository</id>
        <url>https://mvn.cactusmod.xyz/repository/cactus/</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.cactusteam</groupId>
        <artifactId>MCMapper</artifactId>
        <version>1.3</version>
    </dependency>
</dependencies>
```