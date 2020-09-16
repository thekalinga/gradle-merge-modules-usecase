plugins {
    java
    application
    id("de.jjohannes.extra-java-module-info") version "0.1"
}

extraJavaModuleInfo {
    automaticModule("epublib-core-${Constants.epubLibVersion}.jar", "nl.siegmann.epublib")
    automaticModule("kxml2-2.3.0.jar", "org.kxml2")
    automaticModule("xmlpull-1.1.3.4d_b4_min.jar", "net.sf.kxml")
    automaticModule("slf4j-simple-1.6.1.jar", "org.slf4j.simple")
    automaticModule("slf4j-api-1.6.1.jar", "org.slf4j.api")
}

group = "com.acme"
version = "1.0.0-SNAPSHOT"

configure<JavaPluginExtension> {
    modularity.inferModulePath.set(true)
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

application {
    mainClassName = "com.acme.Application"
    mainModule.set("com.acme")
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://github.com/psiegman/mvn-repo/raw/master/releases")
    }
}

dependencies {
    implementation("nl.siegmann.epublib:epublib-core:${Constants.epubLibVersion}")
}
