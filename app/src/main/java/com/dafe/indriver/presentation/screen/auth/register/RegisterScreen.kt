package com.dafe.indriver.presentation.screen.auth.register

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dafe.indriver.presentation.components.InDriverButton
import com.dafe.indriver.presentation.components.InDriverTextField
import com.dafe.indriver.presentation.navigation.screen.auth.AuthScreen
import com.dafe.indriver.ui.theme.InDriverTheme

@Composable
fun RegisterScreen(navHostController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }


    Scaffold { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(15, 40, 123),
                            Color(27, 100, 211)
                        )
                    )
                )
                .padding(paddingValues)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(.3f))
                Text(
                    text = "Register",
                    color = Color.White,
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold,
                )
                Spacer(modifier = Modifier.weight(1f))
                InDriverTextField(
                    modifier = Modifier,
                    value = name,
                    label = "Name",
                    icon = Icons.Default.Person,
                    onValueChange = { name = it }
                )
                Spacer(modifier = Modifier.weight(.1f))
                InDriverTextField(
                    modifier = Modifier,
                    value = lastName,
                    label = "Lastname",
                    icon = Icons.Default.Person,
                    onValueChange = { lastName = it }
                )
                Spacer(modifier = Modifier.weight(.1f))

                InDriverTextField(
                    modifier = Modifier,
                    value = email,
                    label = "Email",
                    icon = Icons.Default.Email,
                    keyboardType = KeyboardType.Email,
                    onValueChange = { email = it }
                )
                Spacer(modifier = Modifier.weight(.1f))

                InDriverTextField(
                    modifier = Modifier,
                    value = phone,
                    label = "Phone",
                    icon = Icons.Default.Phone,
                    keyboardType = KeyboardType.Phone,
                    onValueChange = { phone = it }
                )
                Spacer(modifier = Modifier.weight(.1f))

                InDriverTextField(
                    modifier = Modifier,
                    value = password,
                    label = "Password",
                    icon = Icons.Default.Lock,
                    hideText = true,
                    onValueChange = { password = it }
                )
                Spacer(modifier = Modifier.weight(.1f))

                InDriverTextField(
                    modifier = Modifier,
                    value = confirmPassword,
                    label = "Confirm Password",
                    icon = Icons.Default.Lock,
                    hideText = true,
                    onValueChange = { confirmPassword = it }
                )
                Spacer(modifier = Modifier.weight(1f))
                InDriverButton(
                    modifier = Modifier,
                    text = "Register",
                    onClick = { TODO() }
                )
                Spacer(modifier = Modifier.weight(.1f))
                HorizontalDivider(
                    modifier = Modifier
                        .width(100.dp)
                        .padding(vertical = 16.dp),
                    color = Color.White
                )
                Row {
                    Text("Already have an account?", color = Color.White)
                    Text(
                        " Log in",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.clickable {
                            navHostController.popBackStack()
                        })

                }
                Spacer(modifier = Modifier.weight(.1f))
            }
        }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    InDriverTheme {
        RegisterScreen(rememberNavController())

    }
}