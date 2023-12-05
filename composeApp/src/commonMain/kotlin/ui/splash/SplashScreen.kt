package ui.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import kotlinx.coroutines.delay
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.EXTRA_LARGE_PADDING
import theme.md_theme_dark_onPrimary
import theme.md_theme_light_primary
import ui.home.HomeScreen

object SplashScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        SplashScreenContent {
            navigator.replace(HomeScreen)
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
private fun SplashScreenContent(
    onNextPage: () -> Unit,
) {
    LaunchedEffect(key1 = true) {
        delay(3000)
        onNextPage.invoke()
    }
    val modifier = if (!isSystemInDarkTheme()) Modifier.background(
        Brush.verticalGradient(listOf(md_theme_light_primary, md_theme_dark_onPrimary))
    ) else Modifier.background(md_theme_light_primary)

    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painterResource("ic_logo.xml"),
            null,
            modifier = Modifier.padding(horizontal = EXTRA_LARGE_PADDING),
        )
    }
}
