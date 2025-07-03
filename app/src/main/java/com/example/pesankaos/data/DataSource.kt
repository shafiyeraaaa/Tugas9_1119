package com.example.pesankaos.data
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.ShoppingCart
import com.example.pesankaos.R
object DataSource {
    val colors = listOf(
        R.string.putih,
        R.string.merah,
        R.string.biru,
        R.string.hijau,
        R.string.coklat,
        R.string.hitam
    )
    val quantityOptions = listOf(
        Pair(R.string.satu_kaos, 1),
        Pair(R.string.enam_kaos, 6),
        Pair(R.string.duabelas_kaos, 12)
    )
    val homeTab = TabBarUiState(title = "Home", selectedIcon =
        Icons.Filled.Home, unselectedIcon = Icons.Outlined.Home)
    val shopTab = TabBarUiState(title = "Shop", selectedIcon =
        Icons.Filled.ShoppingCart, unselectedIcon = Icons.Outlined.ShoppingCart)
    val notificationTab = TabBarUiState(title = "Notification",
        selectedIcon = Icons.Filled.Notifications, unselectedIcon =
            Icons.Outlined.Notifications)
    val moreTab = TabBarUiState(title = "More", selectedIcon =
        Icons.Filled.Menu, unselectedIcon = Icons.Outlined.Menu)
    val tabItems = listOf(homeTab, shopTab, notificationTab, moreTab)
}