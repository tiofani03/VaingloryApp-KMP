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
import data.model.Hero
import theme.EXTRA_SMALL_PADDING
import theme.SMALL_PADDING

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListContent(
    modifier: Modifier = Modifier,
    heroes: List<Hero>,
) {
    LazyVerticalStaggeredGrid(
        modifier = modifier,
        columns = StaggeredGridCells.Fixed(2),
        verticalItemSpacing = EXTRA_SMALL_PADDING,
        horizontalArrangement = Arrangement.spacedBy(EXTRA_SMALL_PADDING),
        contentPadding = PaddingValues(SMALL_PADDING),
        content = {
            items(heroes.size) { index ->
                val hero = heroes[index]
                ItemHero(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .animateItemPlacement(tween(durationMillis = 300)),
                    hero = hero,
                    onClick = { heroId ->

                    })
            }
        },
    )
}

