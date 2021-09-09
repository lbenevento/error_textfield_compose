package com.lbenevento.examples.errortextfields

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Error
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import com.lbenevento.examples.errortextfields.ui.theme.ErrorTextFieldsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ErrorTextFieldsTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Text("Filled text field ꞏ TextFieldValue version")
                        var value1 by remember {
                            mutableStateOf(TextFieldValue())
                        }
                        TextField(
                            value = value1,
                            onValueChange = { value1 = it },
                            errorMessage = {
                                Text("This is an error")
                            },
                            helperMessage = {
                                Text(text = "This is an helper! ")
                            }
                        )


                        Text("Filled text field ꞏ String version")
                        var value2 by remember {
                            mutableStateOf("")
                        }
                        TextField(
                            value = value2,
                            onValueChange = { value2 = it },
                            errorMessage = {
                                Text("This is an error")
                            },
                            helperMessage = {
                                Text(text = "This is an helper! ")
                            },
                            errorIcon = {
                                Icon(
                                    painter = rememberVectorPainter(image = Icons.Rounded.Error),
                                    contentDescription = null
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    painter = rememberVectorPainter(image = Icons.Rounded.AccountCircle),
                                    contentDescription = null
                                )
                            }
                        )


                        var value3 by remember {
                            mutableStateOf(TextFieldValue())
                        }
                        OutlinedTextField(
                            value = value3,
                            onValueChange = { value3 = it },
                            errorMessage = {
                                Text("This is an error")
                            },
                            helperMessage = {
                                Text(text = "This is an helper! ")
                            },
                            errorIcon = {
                                Icon(
                                    painter = rememberVectorPainter(image = Icons.Rounded.Error),
                                    contentDescription = null
                                )
                            },
                            trailingIcon = {
                                Icon(
                                    painter = rememberVectorPainter(image = Icons.Rounded.AccountCircle),
                                    contentDescription = null
                                )
                            }
                        )


                        var value4 by remember {
                            mutableStateOf("")
                        }
                        OutlinedTextField(
                            value = value4,
                            onValueChange = { value4 = it },
                            errorMessage = {
                                Text("This is an error")
                            },
                            helperMessage = {
                                Text(text = "This is an helper! ")
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ErrorTextFieldsTheme {
        OutlinedTextField(
            value = TextFieldValue(),
            onValueChange = {}
        )
    }
}