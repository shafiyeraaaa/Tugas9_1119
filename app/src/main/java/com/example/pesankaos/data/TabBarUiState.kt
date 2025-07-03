package com.example.pesankaos.data
import androidx.compose.ui.graphics.vector.ImageVector
data class TabBarUiState(
    val title: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val badgeCount: Int? = null
)