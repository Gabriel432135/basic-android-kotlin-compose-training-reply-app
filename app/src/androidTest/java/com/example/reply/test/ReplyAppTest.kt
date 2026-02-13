package com.example.reply.test

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.example.reply.ui.ReplyApp
import org.junit.Rule
import org.junit.Test

class ReplyAppTest {
    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun compactDevice_verifyUsingBottonNavigation(){
        composeTestRule.setContent {
            //Configura um ReplyApp com windowSize Compact
            ReplyApp(
                windowSize = WindowWidthSizeClass.Compact
            )
        }
        //Verifica se o bottonNavigation é exibido
        composeTestRule.onNodeWithTagForStringId(com.example.reply.R.string.navigation_bottom)
            .assertExists()
    }

    @Test
    fun mediumDevice_verifyUsingNavigationRail(){
        composeTestRule.setContent {
            //Configura um ReplyApp com windowSize Medium
            ReplyApp(
                windowSize = WindowWidthSizeClass.Medium
            )
        }
        //Verifica se o NavigationRail é exibido
        composeTestRule.onNodeWithTagForStringId(
            com.example.reply.R.string.navigation_rail
        ).assertExists()
    }

    @Test
    fun expandedDevice_verifyUsingNavigationDrawer() {
        composeTestRule.setContent {
            //Configura um ReplyApp com windowSize Expanded
            ReplyApp(
                windowSize = WindowWidthSizeClass.Expanded
            )
        }
        //Verifica se o NavigationDrawer é exibido
        composeTestRule.onNodeWithTagForStringId(
            com.example.reply.R.string.navigation_drawer
        ).assertExists()
    }
}