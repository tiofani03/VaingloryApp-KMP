package ui.home.component

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import app.cash.paging.compose.LazyPagingItems
import data.model.Hero
import theme.EXTRA_SMALL_PADDING
import theme.SMALL_PADDING

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListContent(
    modifier: Modifier = Modifier,
    heroes: LazyPagingItems<Hero>,
) {
    LazyVerticalStaggeredGrid(
        modifier = modifier,
        columns = StaggeredGridCells.Fixed(2),
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

@Composable
fun handlePagingResult(
    heroes: LazyPagingItems<Hero>,
    onRefresh: () -> Unit? = {},
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
                false
            }

            loadState.prepend is LoadState.Loading -> {
                false
            }

            heroes.itemCount == 0 -> {
                false
            }

            error != null -> {
                false
            }

            else -> true
        }
    }
}

