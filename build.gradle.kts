plugins {
    id("java")
}

group = "io.github.eziocdl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation ("log4j:log4j:1.2.17");

}

tasks.test {
    useJUnitPlatform()
}