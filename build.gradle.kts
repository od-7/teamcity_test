plugins {
    java
    application
}

java {
    if(plugins.hasPlugin("java")) { //Programmatically adding new stuff
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
        println("It works just fine!")
    }
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
        "Implementation-Version" to project.version,
        "Main-Class" to "HtmlResponder"))
    }
    println("Just made a jar. Wow!")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
}
