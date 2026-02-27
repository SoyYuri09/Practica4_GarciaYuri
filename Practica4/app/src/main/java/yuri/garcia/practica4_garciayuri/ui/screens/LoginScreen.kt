package yuri.garcia.practica4_garciayuri.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(
    onLoginSucces: () -> Unit
){
    var username by remember { mutableStateOf("") } //Declarar un estado (un valor que conforme a su estado se cambiaran cosas de la UI)
    var password by remember {mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Inicio de sesión")
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = username,
            onValueChange = { username = it},
            label = {Text(text = "Nombre de usuario")},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(6.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it},
            label = {Text(text = "Contraseña")}

        )
        Spacer(modifier = Modifier.height(6.dp))
        Button(
            onClick = { onLoginSucces() },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Iniciar")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}