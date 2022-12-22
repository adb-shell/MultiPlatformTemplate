object Versions {
    const val composeUIVersion = "1.3.2"
    const val composeActivityVersion = "1.6.1"
    const val coreKTXVersion = "1.9.0"
    const val appCompatVersion = "1.5.1"
}


object Dependencies {
    object AndroidDependencies {
        const val compileSDK = 33
        const val targetSDK = 33
        const val minSDK = 21

        const val composeUI = "androidx.compose.ui:ui:${Versions.composeUIVersion}"
        const val composeTooling = "androidx.compose.ui:ui-tooling:${Versions.composeUIVersion}"
        const val composePreview = "androidx.compose.ui:ui-tooling-preview:${Versions.composeUIVersion}"
        const val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivityVersion}"
        const val coreKTX = "androidx.core:core-ktx:${Versions.coreKTXVersion}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    }
}