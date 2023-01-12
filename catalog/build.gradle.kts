plugins {
    `version-catalog`
    `maven-publish`
}

group = "group"
version = "1"

catalog {
    versionCatalog {
        library("junit", "junit:junit:4.13")
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
}
