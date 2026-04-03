package com.github.mcmarin21.skellar.app.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import skellar_app.composeapp.generated.resources.RedHatDisplay_ExtraBold
import skellar_app.composeapp.generated.resources.RedHatDisplay_ExtraBoldItalic
import skellar_app.composeapp.generated.resources.RedHatDisplay_Italic
import skellar_app.composeapp.generated.resources.RedHatDisplay_Regular
import skellar_app.composeapp.generated.resources.RedHatDisplay_SemiBold
import skellar_app.composeapp.generated.resources.RedHatDisplay_SemiBoldItalic
import skellar_app.composeapp.generated.resources.RedHatText_Italic
import skellar_app.composeapp.generated.resources.RedHatText_Light
import skellar_app.composeapp.generated.resources.RedHatText_LightItalic
import skellar_app.composeapp.generated.resources.RedHatText_Medium
import skellar_app.composeapp.generated.resources.RedHatText_MediumItalic
import skellar_app.composeapp.generated.resources.RedHatText_Regular
import skellar_app.composeapp.generated.resources.Res

@Composable
fun bodyTypography() = FontFamily(
    Font(Res.font.RedHatText_Light, FontWeight.Light, FontStyle.Normal),
    Font(Res.font.RedHatText_LightItalic, FontWeight.Light, FontStyle.Italic),
    Font(Res.font.RedHatText_Regular, FontWeight.Normal, FontStyle.Normal),
    Font(Res.font.RedHatText_Italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.RedHatText_Medium, FontWeight.Medium, FontStyle.Normal),
    Font(Res.font.RedHatText_MediumItalic, FontWeight.Medium, FontStyle.Italic)
)

@Composable
fun displayTypography() = FontFamily(
    Font(Res.font.RedHatDisplay_Regular, FontWeight.Normal, FontStyle.Normal),
    Font(Res.font.RedHatDisplay_Italic, FontWeight.Normal, FontStyle.Italic),
    Font(Res.font.RedHatDisplay_SemiBold, FontWeight.SemiBold, FontStyle.Normal),
    Font(Res.font.RedHatDisplay_SemiBoldItalic, FontWeight.SemiBold, FontStyle.Italic),
    Font(Res.font.RedHatDisplay_ExtraBold, FontWeight.ExtraBold, FontStyle.Normal),
    Font(Res.font.RedHatDisplay_ExtraBoldItalic, FontWeight.ExtraBold, FontStyle.Italic)
)

@Composable
fun AppTypography() = Typography().run {
    val displayFontFamily = displayTypography()
    val bodyFontFamily = bodyTypography()
    copy(
        displayLarge = displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = labelSmall.copy(fontFamily = bodyFontFamily),
    )
}