import org.gradle.kotlin.dsl.registering

plugins {
    application
    java
    id("org.danilopianini.gradle-java-qa") version "1.71.0"
}

repositories {
    mavenCentral()
}

val runSet by tasks.registering(JavaExec::class) {
    mainClass.set("it.unibo.collections.sets.UseSet")
    classpath(sourceSets.main.get().runtimeClasspath)
}

tasks.run.get().dependsOn(runSet)

application {
    mainClass.set("it.unibo.collections.UseCollection")
}
