plugins {
    java
    groovy
}

group = "pl.ppiekarski.vcoding"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.apache.groovy:groovy:4.0.27")
    testImplementation("org.spockframework:spock-core:2.3-groovy-4.0")

    // or JUNIT?
    testImplementation("org.assertj:assertj-core:3.27.3")
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
