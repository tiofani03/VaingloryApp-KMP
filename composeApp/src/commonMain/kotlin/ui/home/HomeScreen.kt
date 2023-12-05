package ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import ui.home.component.ListContent
import utils.helper.listHeroes

object HomeScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        HomeScreenContent()
    }
}

@Composable
private fun HomeScreenContent() {
    ListContent(
        modifier = Modifier
            .fillMaxSize(),
        heroes = listHeroes,
    )
}
