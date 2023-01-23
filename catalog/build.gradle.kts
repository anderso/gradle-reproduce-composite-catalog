plugins {
    `version-catalog`
    `maven-publish`
}

group = "group"
version = "1"

configurations.versionCatalogElements {
    outgoing.artifacts.clear()
    outgoing.artifact(layout.projectDirectory.dir("gradle/libs.versions.toml"))
}

catalog {
    versionCatalog {
        from(files("gradle/libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
