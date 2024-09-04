package com.gabriel.zapzap

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Message
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.CameraAlt
import androidx.compose.material.icons.filled.CircleNotifications
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Search

sealed class ScreenItem(
    val topAppBarItem: TopAppBarItem,
    val bottomAppBarItem: BottomAppBarItem
) {
    data object Chats : ScreenItem(
        topAppBarItem = TopAppBarItem(
            title = "Zap Zap",
            icons = listOf(
                Icons.Default.CameraAlt,
                Icons.Default.MoreVert
            )
        ),
        bottomAppBarItem = BottomAppBarItem(
            icon = Icons.AutoMirrored.Filled.Message,
            label = "Chats"
        )
    )

    data object Update : ScreenItem(
        topAppBarItem = TopAppBarItem(
            title = "Update",
            icons = listOf(
                Icons.Default.CameraAlt,
                Icons.Default.Search,
                Icons.Default.MoreVert
            )
        ),

        bottomAppBarItem = BottomAppBarItem(
            icon = Icons.Default.CircleNotifications,
            label = "Update"
        )
    )

    data object Communities : ScreenItem(
        topAppBarItem = TopAppBarItem(
            title = "Communities",
            icons = listOf(
                Icons.Default.CameraAlt,
                Icons.Default.MoreVert
            )
        ),
        bottomAppBarItem = BottomAppBarItem(
            icon = Icons.Default.People,
            label = "Communities"
        )
    )

    data object Calls : ScreenItem(
        topAppBarItem = TopAppBarItem(
            title = "Calls",
            icons = listOf(
                Icons.Default.CameraAlt,
                Icons.Default.Search,
                Icons.Default.MoreVert
            )
        ),
        bottomAppBarItem = BottomAppBarItem(
            icon = Icons.Default.Call,
            label = "Calls"
        )
    )
}