package ui.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import app.cash.paging.compose.collectAsLazyPagingItems
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import ui.home.component.ListContent

class HomeScreen : Screen, KoinComponent {
    private val homeViewModel: HomeViewModel by inject()

    @Composable
    override fun Content() {
        val navigator = LocalNavigator.currentOrThrow
        HomeScreenContent()
    }

    @Composable
    private fun HomeScreenContent() {
        val result = homeViewModel.allHeroes.collectAsLazyPagingItems()
        ListContent(
            modifier = Modifier
                .fillMaxSize(),
            heroes = result,
        )
    }
}
