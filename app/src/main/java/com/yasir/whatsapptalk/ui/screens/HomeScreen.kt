package com.yasir.whatsapptalk.ui.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yasir.whatsapptalk.data.INITIAL_SCREEN_INDEX
import com.yasir.whatsapptalk.data.tabs
import com.yasir.whatsapptalk.ui.components.AppbarComponent
import com.yasir.whatsapptalk.ui.components.TabsComponents
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen() {
    Column {

        val pagerState = rememberPagerState(
            initialPage = INITIAL_SCREEN_INDEX,
            initialPageOffsetFraction = 0f
        ) {
            tabs.size
        }
        val scope = rememberCoroutineScope()
        AppbarComponent()
        TabsComponents(
            initialIndex = INITIAL_SCREEN_INDEX,
            pagerState,
            onTabSelected = { selectedPage ->
                scope.launch {
                    pagerState.animateScrollToPage(selectedPage)
                }
            }
        )
        HorizontalPager(
            modifier = Modifier.fillMaxSize(),
            state = pagerState,
            pageSpacing = 0.dp,
            userScrollEnabled = true,
            pageSize = PageSize.Fill,
            pageContent = { page ->
                when (page) {
                    0 -> ChatsScreen()
                    1 -> StatusScreen()
                    2 -> CallsScreen()
                    else -> error("Invalid page index")
                }
            }
        )
    }
}

@Preview
@Composable
fun PreviewOfHomeScreen() {
    Column {
        AppbarComponent()
    }
}