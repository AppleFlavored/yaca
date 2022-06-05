plugins {
    id("java")
}

group = "io.github.appleflavored"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.netty:netty-all:4.1.77.Final")
}