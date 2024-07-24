package com.example.cctissue

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.browser.customtabs.CustomTabsIntent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.cctissue.ui.theme.ReproCCTIssueTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ctx = this
        val uri =
            Uri.parse("https://www.australiansuper.com/-/media/australian-super/files/tools-and-advice/forms-and-fact-sheets/superannuation/forms/update-your-details/binding-death-benefit-nomination-for-super-members.pdf")
        enableEdgeToEdge()
        setContent {
                Column(
                    modifier = Modifier.fillMaxWidth().fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = {
                        val builder = CustomTabsIntent.Builder()
                        val customTabsIntent: CustomTabsIntent = builder.build()
                        customTabsIntent.launchUrl(ctx, uri)
                    }) {
                        Text("Repro CCT issue")
                    }
                }

        }
    }
}