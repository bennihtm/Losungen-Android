package schalter.de.losungen2.utils

object Constants {

    /**
     * Use this url to get the download path for all available year and language
     */
    val urlsOverviewAvailableData: List<String> = listOf(
//            "http://10.0.2.2/available-data.json",
            "https://raw.githubusercontent.com/schalterDev/Losungen-Android-2/master/data-for-webserver/available-data.json",
            "https://losungen.webdesign-schalter.de/available-data.json")

    const val urlPrivacyWebsite = "https://losungen.webdesign-schalter.de/privacy"
    const val programmerMail = "schalter.dev@gmail.com"
}