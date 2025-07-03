package com.example.pesankaos.ui.theme

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavController
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.pesankaos.data.TabBarUiState
@Composable
fun TabView(tabBarItems: List<TabBarUiState>, navController:
NavController) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = backStackEntry?.destination
    NavigationBar {
        tabBarItems.forEach { tabBarItem ->
            val itemIsSelected = currentDestination?.hierarchy?.any {
                it.route == tabBarItem.title
            } == true
            NavigationBarItem(
                selected = itemIsSelected,
                onClick = {
                    navController.navigate(tabBarItem.title) {
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    TabBarIconView(
                        isSelected = itemIsSelected,
                        item = tabBarItem
                    )
                },
                label = {
                    Text(text = tabBarItem.title)
                }
            )
        }
    }
}
@Composable
fun TabBarIconView(
    isSelected: Boolean,
    item: TabBarUiState
) {
    BadgedBox(badge = { TabBarBadgeView(item.badgeCount)}) {
        Icon(
            imageVector = if (isSelected) item.selectedIcon else

                item.unselectedIcon,

            contentDescription = item.title
        )
    }
}
@Composable
fun TabBarBadgeView(count: Int? = null) {
    if (count != null) {
        Badge {
            Text(count.toString())
        }
    }
}