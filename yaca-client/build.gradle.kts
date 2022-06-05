plugins {
    id("application")
    id("org.openjfx.javafxplugin") version "0.0.10"
}

group = "io.github.appleflavored"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
}

application {
    mainModule.set("yaca.main")
    mainClass.set("io.github.appleflavored.yaca.YacaMain")
}

javafx {
    version = "17.0.1"
    modules = mutableListOf("javafx.controls")
}