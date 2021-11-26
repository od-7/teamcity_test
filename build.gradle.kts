plugins {
    java
}

java {
    if(plugins.hasPlugin("java")) { //Programmatically adding new stuff
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
        println("It works just fine!")
    }
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}
