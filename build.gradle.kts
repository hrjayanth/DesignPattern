plugins {
    id("java")
}

allprojects {
    group = "com.learn.jay"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

subprojects {
    apply(plugin = "java")

    configure<JavaPluginExtension> {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }

    dependencies {
        // Lombok
        "compileOnly"("org.projectlombok:lombok:1.18.44")
        "annotationProcessor"("org.projectlombok:lombok:1.18.44")
        "testCompileOnly"("org.projectlombok:lombok:1.18.44")
        "testAnnotationProcessor"("org.projectlombok:lombok:1.18.44")

        // Logging
        "implementation"("org.slf4j:slf4j-api:2.0.17")
        "implementation"("ch.qos.logback:logback-classic:1.5.32")

        "testImplementation"("org.junit.jupiter:junit-jupiter-api:5.10.2")
        "testRuntimeOnly"("org.junit.jupiter:junit-jupiter-engine:5.10.2")
        "testRuntimeOnly"("org.junit.vintage:junit-vintage-engine:5.10.2")
        "testImplementation"("junit:junit:4.13.2")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}
