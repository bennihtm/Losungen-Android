package de.schalter.losungen.utils

object Constants {

    /**
     * Use this url to get the download path for all available year and language
     */
    val urlsOverviewAvailableData: List<String> = listOf(
//          "http://10.0.2.2/available-data.json",
            "https://losungen.awesomebible.de/available-data.json",
            "https://bennihtm.github.io/Losungen-Server/available-data.json")

    const val urlPrivacyWebsite = "https://losungen.webdesign-schalter.de/privacy"
    const val programmerMail = "benjamin@awesomebible.de"
    const val urlProgrammer = "https://bendaha.eu.org"
    const val urlGitHub = "https://github.com/bennihtm/Losungen-Android"
    const val urlTranslation = "https://poeditor.com/join/project/WWqXh1OIBE"
}