package com.yasir.whatsapptalk.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yasir.whatsapptalk.data.TabData
import com.yasir.whatsapptalk.data.tabs
import kotlinx.coroutines.flow.collectLatest

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun TabsComponents(
    initialIndex: Int=0,
    pagerState: PagerState,
    onTabSelected :(Int)-> Unit
) {
    var selectedIndex by remember {
        mutableIntStateOf(0)
    }
    LaunchedEffect(pagerState){
        snapshotFlow { pagerState.currentPage }.collectLatest { page->
            selectedIndex =page
            onTabSelected(selectedIndex)
        }
    }
    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth(),
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.tertiary,
        indicator = { tabPosition ->
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(tabPosition[selectedIndex]),
                height = 4.dp,
                color = MaterialTheme.colorScheme.tertiary
            )
        }
    ) {
        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = {
                    selectedIndex = index
                    onTabSelected(selectedIndex)
                },
                text = {
                    TabContent(tabData = tabData)
                }
            )
        }
    }

}

@Composable
fun TabContent(tabData: TabData) {
    if (tabData.unreadCount == null) {
        TabsTitle(title = tabData.title)
    }else{
        TabWithUnreadCount(tabData = tabData)
    }
}

@Composable
fun TabsTitle(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 16.sp
        )
    )
}

@Composable
fun TabWithUnreadCount(tabData: TabData) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        TabsTitle(title = tabData.title)
        tabData.unreadCount?.also { unreadCount ->
                CircularCount(
                    unreadCount = unreadCount.toString(),
                    backgroundColor = MaterialTheme.colorScheme.background,
                    textColor = MaterialTheme.colorScheme.primary
                )
        }

    }

}