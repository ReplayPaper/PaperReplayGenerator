pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "PaperReplayGenerator"

include("PaperReplayGenerator-api", "PaperReplayGenerator-server")
