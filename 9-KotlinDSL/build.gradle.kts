plugins {
	id("java")
}

project.group = "com.denofprogramming"
project.version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

repositories{
	mavenCentral()
}

dependencies {
	implementation("org.apache.commons:commons-math3:3.6.1")
	testImplementation("junit:junit:4.12")
}


tasks.jar {
	archiveBaseName.set("${project.name}-all")
	
	manifest {
		attributes["Main-Class"] = "com.denofprogramming.random.App"
		attributes["Implementation-Title"] = "Gradle all deps inclusive jar"
		attributes["Implementation-Version"] = project.version
		attributes["Created-By"] = "denOfprogramming"
	}
	
	from(project.configurations["runtimeClasspath"].map({file -> project.zipTree(file)}))

}