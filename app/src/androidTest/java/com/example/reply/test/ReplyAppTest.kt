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
}