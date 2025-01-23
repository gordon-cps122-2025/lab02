plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
	testImplementation(platform("org.junit:junit-bom:5.11.4"));
	testImplementation("org.junit.jupiter:junit-jupiter");
	testRuntimeOnly("org.junit.platform:junit-platform-launcher");
}

application {
    mainClass.set("pong.internal.Pong")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
