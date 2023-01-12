rootProject.name = "project"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from("group:catalog:1")
        }
    }
    repositories {
        mavenLocal()
    }
}