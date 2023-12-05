import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import org.jetbrains.compose.resources.ExperimentalResourceApi
import theme.VaingloryAppTheme
import ui.splash.SplashScreen

@OptIn(ExperimentalResourceApi::class)
@Composable
fun App() {
    VaingloryAppTheme {
        Navigator(SplashScreen)
    }
}
