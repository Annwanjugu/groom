package net.ezra.ui.auth


import android.content.res.Configuration.UI_MODE_NIGHT_NO
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.R
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP

@Composable
fun LoginScreen(navController: NavHostController){


    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.krystal), contentScale = ContentScale.FillBounds)) {

        var firstname by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var contact by remember { mutableStateOf("") }


        Box (
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
//            Image(
//                painter = painterResource(id = R.drawable.register),
//                contentDescription ="register",
//                modifier = Modifier.size(180.dp))

        }
        Spacer(modifier = Modifier.height(70.dp))

        Text(
            text = "Login into your account",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            color = Color(0xFF000000))

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = firstname,
            onValueChange ={firstname = it},
            placeholder = { Text(text = "Firstname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),




            )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = lastname,
            onValueChange ={lastname = it},
            placeholder = { Text(text = "Lastname")},
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "person") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)



        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = email,
            onValueChange ={email = it},
            placeholder = { Text(text = "Email Address")},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)



        )
        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange ={password = it},
            placeholder = { Text(text = "Password")},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()



        )
        Spacer(modifier = Modifier.height(10.dp))


        Spacer(modifier = Modifier.height(10.dp))




        Text(
            text = "Do not have an account? Sign up",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .fillMaxWidth()
                .clickable {


                    navController.navigate(ROUTE_SIGNUP) {
                        popUpTo(ROUTE_LOGIN) { inclusive = true }
                    }
                },
            textAlign = TextAlign.Center,
            color = Color(0xFFE2E2E5))







    }




}





@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_NO)
@Composable
fun LoginScreenPreviewLight() {
    LoginScreen(rememberNavController())
}





