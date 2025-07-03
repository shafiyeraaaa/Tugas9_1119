package com.example.pesankaos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pesankaos.data.DataSource.homeTab
import com.example.pesankaos.data.DataSource.moreTab
import com.example.pesankaos.data.DataSource.notificationTab
import com.example.pesankaos.data.DataSource.shopTab
import com.example.pesankaos.data.DataSource.tabItems
import com.example.pesankaos.ui.theme.PesanKaosApp
import com.example.pesankaos.ui.theme.PesankaosTheme
import com.example.pesankaos.ui.theme.TabView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            PesankaosTheme {
                Scaffold(
                    bottomBar = {
                        TabView(
                            tabBarItems = tabItems,

                            navController = navController
                        )
                    },

                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = homeTab.title,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(route = homeTab.title) {
                            Text(text = "Menu Home Dalam Pengembangan")
                        }
                        composable(route = shopTab.title) {
                            PesanKaosApp()
                        }
                        composable(route = notificationTab.title) {
                            Text(text = "Menu Notification Dalam Pengembangan")
                        }
                        composable(route = moreTab.title) {
                            Text(text = "Menu More Dalam Pengembangan")
                        }
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PesankaosTheme {
    }
}