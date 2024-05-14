package net.ezra.ui.home

import android.content.Intent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SIGNUP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(id = R.drawable.home), contentScale = ContentScale.FillBounds)) {


        Column {



Text(text = "Select Beauty for your skin",
    color = Color.DarkGray,
    fontSize = 100.sp,
    fontFamily = FontFamily.Cursive)

Spacer(modifier = Modifier.height(5.dp))

Text(text = "Explore More",
    modifier = Modifier
        .clickable {
            navController.navigate(ROUTE_SERVICES){
                popUpTo(ROUTE_HOME){ inclusive = true}
            }

        }, color = Color.Black

    )




   Button(onClick = { navController.navigate(ROUTE_MIT) {
       popUpTo(ROUTE_HOME){ inclusive = true }
   }  }) {


            Text(
                text = "LOGIN",
                fontSize = 10.sp,
                fontWeight = FontWeight.ExtraLight,
                color = Color.Black,

            )}
            Spacer(modifier = Modifier.height(5.dp))

            Button(onClick = {
                navController.navigate(ROUTE_LOGIN) {
                    popUpTo(ROUTE_HOME) { inclusive = true }
                }}) {


                    Text(text = "CREATE ACCOUNT",
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 10.sp,
                        color = Color.Black,
                        )


                }
            }

    }


}



@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

