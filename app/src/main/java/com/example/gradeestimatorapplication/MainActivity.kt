package com.example.gradeestimatorapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gradeestimatorapplication.ui.theme.GradeEstimatorApplicationTheme
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GradeEstimatorApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier, color = MaterialTheme.colorScheme.background) {
                    Greeting("Androids")
                    Button("test")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "test $name!",
            modifier = modifier
    )
}


@Composable
fun Button(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Button(
            onClick = {
            // Define the action to be performed when the button is clicked
            }
        ) {
            Text(
                text = "$name"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GradeEstimatorApplicationTheme {
        Button("tst")
    }
}