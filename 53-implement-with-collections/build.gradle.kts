plugins {
    application
    java
    id("org.danilopianini.gradle-java-qa") version "1.71.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass.set("it.unibo.collections.design.UseWarehouse")
}

val runOrderedWarehouse by tasks.registering(JavaExec::class) {
    mainClass.set("it.unibo.collections.design.UseOrderedWarehouse")
    classpath(sourceSets.main.get().runtimeClasspath)
}

tasks.run.get().dependsOn(runOrderedWarehouse)
