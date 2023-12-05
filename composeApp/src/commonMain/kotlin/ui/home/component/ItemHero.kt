package ui.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import com.seiko.imageloader.rememberImagePainter
import data.model.Hero
import theme.LARGE_PADDING
import theme.SMALL_PADDING

@Composable
fun ItemHero(
    modifier: Modifier = Modifier,
    hero: Hero,
    onClick: (heroId: Int) -> Unit,
) {
    Box(
        modifier = modifier.clickable {
            onClick(hero.id)
        }, contentAlignment = Alignment.BottomCenter
    ) {
        Surface(shape = RoundedCornerShape(size = LARGE_PADDING)) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = rememberImagePainter(
                    hero.image
                ),
                contentDescription = hero.image,
                contentScale = ContentScale.Crop,

                )
        }

        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color.Black.copy(alpha = 0.4f),
            shape = RoundedCornerShape(
                bottomEnd = LARGE_PADDING,
                bottomStart = LARGE_PADDING,
            ),
        ) {
            Column(
                modifier = Modifier
                    .padding(bottom = LARGE_PADDING),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom,
            ) {
                Text(
                    modifier = Modifier.padding(top = SMALL_PADDING),
                    text = hero.name.uppercase(),
                    color = Color.White,
                    fontSize = MaterialTheme.typography.bodyLarge.fontSize,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
                Text(
                    modifier = Modifier,
                    text = "${hero.role}, ${hero.position}".uppercase(),
                    fontSize = MaterialTheme.typography.labelSmall.fontSize,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
        }
    }
}
