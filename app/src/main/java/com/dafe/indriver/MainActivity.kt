package com.dafe.indriver

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dafe.indriver.presentation.navigation.graph.root.RootNavGraph
import com.dafe.indriver.ui.theme.InDriverTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var navHostController: NavHostController

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InDriverTheme {
                Surface() {
                    navHostController = rememberNavController()
                    RootNavGraph(navHostController)
                }
            }
        }
    }
}
