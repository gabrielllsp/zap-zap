package com.gabriel.zapzap.features.chatsList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DoneAll
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gabriel.zapzap.ui.theme.ZapZapTheme

@Composable
fun ChatsListScreen(modifier: Modifier = Modifier) {
    LazyColumn(modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        //Search text field
        item {
            Row(
                Modifier
                    .clip(CircleShape)
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(16.dp)
            ) {
                Icon(Icons.Default.Search, contentDescription = null)
                Spacer(modifier = Modifier.size(8.dp))
                Text(text = "Search")
            }
            Spacer(modifier = Modifier.size(16.dp))
            //chats filter
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                val filter = remember {
                    mutableListOf("All", "Unread", "Groups")
                }
                filter.forEach { filter ->
                    Box(
                        Modifier
                            .clip(CircleShape)
                            .background(Color.LightGray)
                            .padding(16.dp, 8.dp)
                    ) {
                        Text(filter)
                    }
                }
            }
        }
        //chats list
        items(12) {
            val avatarSize = 56.dp
            Row(Modifier.fillMaxWidth()) {
                Box(
                    Modifier
                        .size(avatarSize)
                        .clip(CircleShape)
                        .background(Color.LightGray)
                )
                Spacer(Modifier.size(16.dp))
                Column(
                    Modifier.heightIn(avatarSize),
                    verticalArrangement = Arrangement.Center,

                ) {
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "chat name")
                        Text(text = "last message date")
                    }
                    Row(
                        Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(Modifier.weight(1f)) {
                        Icon(Icons.Default.DoneAll, contentDescription = null, tint = Color.Gray)
                            Spacer(modifier = Modifier.size(4.dp))
                        Text(text = "last message")
                        }
                        Box(
                            Modifier
                                .clip(CircleShape)
                                .background(Color.Green)
                                .padding(6.dp)
                        ){
                            Text(text = "99")
                        }

                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun ChatsListScreenPreview() {
    ZapZapTheme {
        Surface {
            ChatsListScreen()
        }
    }
}