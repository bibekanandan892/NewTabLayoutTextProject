package com.isu.newtablayouttextproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.debugInspectorInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.isu.newtablayouttextproject.ui.theme.AppBlue
import com.isu.newtablayouttextproject.ui.theme.WLOrangeDark

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val selectedTabIndex = remember {
                mutableStateOf(0)
            }
            // A surface container using the 'background' color from the theme
            Surface(modifier = Modifier
                .fillMaxSize()
                .background(Color.White)) {
                CustomScrollableTabRow() {
                    selectedTabIndex.value = it
                }
            }
        }
    }
}

@Composable
fun CustomScrollableTabRow(
    tabs: List<String> = listOf("alskd",
        "skjf",
        "klsadj",
        "kasl;",
        "klasj",
        "alskd",
        "skjf",
        "klsadj",
        "kasl;",
        "klasj"),
    selectedTabIndex: Int = 0,
    onTabClick: (Int) -> Unit = {},
) {
    var tabIndex: Int? by remember { mutableStateOf(null) }

    val density = LocalDensity.current
    val tabWidths = remember {
        val tabWidthStateList = mutableStateListOf<Dp>()
        repeat(tabs.size) {
            tabWidthStateList.add(0.dp)
        }
        tabWidthStateList
    }
    Spacer(modifier = Modifier.height(20.dp))

    ScrollableTabRow(
        selectedTabIndex = selectedTabIndex,
        contentColor = Color.White,
        edgePadding = 3.dp,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                modifier = Modifier.customTabIndicatorOffset(
                    currentTabPosition = tabPositions[selectedTabIndex],
                    tabWidth = tabWidths[selectedTabIndex]
                )
            )
        }
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
            verticalAlignment = Alignment.Top) {
            tabs.forEachIndexed { index, _ ->

                val selected = tabIndex == index

                Tab(selected = selected, onClick = {
                    tabIndex = index

                }) {
                    SeatDetails(avlClass = "1A",
                        borderColor = if (selected) AppBlue else WLOrangeDark.copy(alpha = 0.2f),
                        selected = selected,
                        backgroundColor = if (tabIndex == null || selected) {
                            Color. White
                        } else {
                            WLOrangeDark
                        }) {
                        tabIndex = index
                    }

                }
            }
        }

    }
}

fun Modifier.customTabIndicatorOffset(
    currentTabPosition: TabPosition,
    tabWidth: Dp,
): Modifier = composed(
    inspectorInfo = debugInspectorInfo {
        name = "customTabIndicatorOffset"
        value = currentTabPosition
    }
) {
    val currentTabWidth by animateDpAsState(
        targetValue = tabWidth,
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )
    val indicatorOffset by animateDpAsState(
        targetValue = ((currentTabPosition.left + currentTabPosition.right - tabWidth) / 2),
        animationSpec = tween(durationMillis = 250, easing = FastOutSlowInEasing)
    )
    fillMaxWidth()
        .wrapContentSize(Alignment.BottomStart)
        .offset(x = indicatorOffset)
        .width(currentTabWidth)
}