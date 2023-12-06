package ui.home.component

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import app.cash.paging.compose.LazyPagingItems
import data.model.Hero
import theme.EXTRA_SMALL_PADDING
import theme.SMALL_PADDING
import ui.component.EmptyScreen
import ui.component.ShimmerEffect

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3WindowSizeClassApi::class)
@Composable
fun ListContent(
    modifier: Modifier = Modifier,
    heroes: LazyPagingItems<Hero>,
) {
    val windowSize = calculateWindowSizeClass()
    val count = when(windowSize.widthSizeClass){
        WindowWidthSizeClass.Compact -> 2
        WindowWidthSizeClass.Medium -> 4
        WindowWidthSizeClass.Expanded -> 6
        else  -> 2
    }

    val result = handlePagingResult(
        heroes = heroes,
        count = count,
    )

    if (result){
        LazyVerticalStaggeredGrid(
            modifier = modifier,
            columns = StaggeredGridCells.Fixed(count),
            verticalItemSpacing = EXTRA_SMALL_PADDING,
            horizontalArrangement = Arrangement.spacedBy(EXTRA_SMALL_PADDING),
            contentPadding = PaddingValues(SMALL_PADDING),
            content = {
                items(heroes.itemCount) { index ->
                    val hero = heroes[index]
                    hero?.let {
                        ItemHero(
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight()
                                .animateItemPlacement(tween(durationMillis = 300)),
                            hero = hero,
                            onClick = { heroId ->
//                            navController.navigate(Screen.Detail.passHeroId(heroId = heroId))
                            })
                    }
                }
            },
        )
    }
}

@Composable
fun handlePagingResult(
    heroes: LazyPagingItems<Hero>,
    count: Int = 2,
): Boolean {
    heroes.apply {
        val error = when {
            loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
            loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
//            loadState.append is LoadState.Error -> loadState.append as LoadState.Error
            else -> null
        }

        return when {
            loadState.refresh is LoadState.Loading -> {
                ShimmerEffect(count = count)
                false
            }

            loadState.prepend is LoadState.Loading -> {
                ShimmerEffect(count = count)
                false
            }

            heroes.itemCount == 0 -> {
                EmptyScreen(
                    message = "Data Tidak ditemukan",
                ){

                }
                false
            }

            error != null -> {
                EmptyScreen(
                    message = "Terjadi kesalahan",
                ){}

                false
            }

            else -> true
        }
    }
}

