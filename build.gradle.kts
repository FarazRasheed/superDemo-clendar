// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
//    ext.kotlin_version = "1.5.20"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath (Libraries.classpathGradle)
        classpath (Libraries.classpathKotlinGradle)
        classpath ("com.github.dcendents:android-maven-gradle-plugin:2.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()

        jcenter() // Warning: this repository is going to shut down soon
        maven {
            url = uri("https://jitpack.io")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}