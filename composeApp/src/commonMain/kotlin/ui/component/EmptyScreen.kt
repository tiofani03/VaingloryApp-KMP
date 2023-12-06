package ui.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import theme.NETWORK_ERROR_ICON_HEIGHT
import theme.SMALL_PADDING


@OptIn(ExperimentalResourceApi::class)
@Composable
fun EmptyScreen(
    modifier: Modifier = Modifier,
    icon: String = "compose-multiplatform.xml",
    message: String = "Error",
    alphaAnim: Float = 1f,
    swipeEnabled: Boolean = true,
    onRefresh: () -> Unit,
) {
    /*----- declarations ----- */
    var isRefreshing by remember { mutableStateOf(false) }


    /*----- Ui ----- */
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            modifier = Modifier
                .alpha(alphaAnim)
                .size(NETWORK_ERROR_ICON_HEIGHT),
            painter = painterResource(icon),
            contentDescription = "Empty Image",
            tint = MaterialTheme.colorScheme.surfaceTint
        )
        Text(
            modifier = Modifier
                .alpha(alphaAnim)
                .padding(top = SMALL_PADDING),
            text = message,
            color = MaterialTheme.colorScheme.surfaceTint,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium,
            fontSize = MaterialTheme.typography.bodyMedium.fontSize
        )
    }

}

