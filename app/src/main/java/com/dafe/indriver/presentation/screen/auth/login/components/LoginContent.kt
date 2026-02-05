package com.dafe.indriver.presentation.screen.auth.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.dafe.indriver.presentation.components.InDriverTextField
import com.dafe.indriver.presentation.navigation.screen.auth.AuthScreen
import com.dafe.indriver.presentation.screen.auth.login.LoginViewModel

@Composable
fun LoginContent(navHostController: NavHostController, paddingValues: PaddingValues, vm: LoginViewModel = hiltViewModel()) {

    val state = vm.state

    var email by remember { mutableStateOf(state.email) }

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
            Spacer(modifier = Modifier.weight(.1f))
            Text(
                text = "InDrive",
                color = Color.White,
                fontSize = 34.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End
            )
            Spacer(modifier = Modifier.weight(1f))
            Text("Login", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.weight(.1f))
            InDriverTextField(
                modifier = Modifier,
                value = state.email,
                label = "Email",
                icon = Icons.Outlined.Email,
                keyboardType = KeyboardType.Email,
                onValueChange = { vm.onEmailInput(it) })
            Spacer(modifier = Modifier.weight(.1f))
            InDriverTextField(
                modifier = Modifier,
                value = state.password,
                label = "Password",
                icon = Icons.Outlined.Lock,
                hideText = true,
                onValueChange = { vm.onPasswordInput(it)}
            )
            Spacer(modifier = Modifier.weight(1f))
            Button(
                modifier = Modifier
                    .width(200.dp)
                    .height(55.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                ),
                onClick = {}) {
                Text("Login", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            }
            Spacer(modifier = Modifier.weight(.1f))
            HorizontalDivider(
                modifier = Modifier
                    .width(100.dp)
                    .padding(vertical = 16.dp),
                color = Color.White
            )
            Row {
                Text("Don't have an account?", color = Color.White)
                Text(" Sign up", color = Color.White, fontWeight = FontWeight.Bold, modifier = Modifier.clickable{
                    navHostController.navigate(AuthScreen.Register.route)
                })

            }
            Spacer(modifier = Modifier.weight(.1f))
        }
    }
}