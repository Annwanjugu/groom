package net.ezra.ui.mit

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.ui.theme.AppTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MitScreen(navController: NavHostController) {
    LazyColumn {
      item {
    Column (modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFDAD6))) {
        val mContext = LocalContext.current


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.crop),
                contentDescription = "stamp",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = "",
                fontSize = 50.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif
            )

        }


        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },
            placeholder = { Text(text = "Search by specialist/category") },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        Spacer(modifier = Modifier.height(10.dp))


        Card(
            modifier = Modifier
                .width(900.dp)
                .height(200.dp)
        ) {
            Row {


                Text(
                    text = "Category",
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.width(220.dp))

                Text(
                    text = "View all",
                    color = Color.DarkGray,
                    modifier = Modifier.clickable {
                        navController.navigate(ROUTE_SERVICES)
                    }
                )

            }
            LazyRow {

                item {
                    // Card 1

                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFFFB4AB)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(200.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.haircut),
                                    contentDescription = "betty"
                                )
                            }

                            Text(
                                text = "HairCut",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                    //End of Card 1
                    Spacer(modifier = Modifier.width(5.dp))
                    // Card 2

                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFFFB4AB)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(200.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.hairdessing),
                                    contentDescription = "betty"
                                )
                            }

                            Text(
                                text = "Hairdressing",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                    //End of Card 2
                    Spacer(modifier = Modifier.width(5.dp))
                    // Card 3

                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFFFB4AB)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(200.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.makeup),
                                    contentDescription = "betty"
                                )
                            }

                            Text(
                                text = "Makeup",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                    //End of Card 3
                    Spacer(modifier = Modifier.width(5.dp))
                    // Card 4

                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFFFB4AB)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(200.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mani),
                                    contentDescription = "betty"
                                )
                            }

                            Text(
                                text = "Manicure",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                    //End of Card 4
                    Spacer(modifier = Modifier.width(5.dp))
                    // Card 5

                    Card(
                        colors = CardDefaults.cardColors(Color(0xFFFFB4AB)),
                        modifier = Modifier
                            .width(150.dp)
                            .height(200.dp)
                    ) {
                        Column {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pedicure),
                                    contentDescription = "betty"
                                )
                            }

                            Text(
                                text = "Pedicure",
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                fontSize = 20.sp,
                                color = Color.DarkGray
                            )
                        }
                    }
                    //End of Card 5
                    Spacer(modifier = Modifier.width(5.dp))
                }


            }

        }
        Spacer(modifier = Modifier.height(10.dp))
        Card {
            Row {


                Text(
                    text = "Specialist",
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.width(220.dp))

                Text(
                    text = "View all",
                    color = Color.DarkGray,
                    modifier = Modifier.clickable {
                        navController.navigate(ROUTE_CONTACT)
                    }
                )

            }
            LazyRow {
                item {
                    Column(modifier = Modifier.height(150.dp)
                        .width(100.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.jane),
                            contentDescription = "betty"
                        )
                        Text(
                            text = "Jane",
                            color = Color.DarkGray
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(modifier = Modifier.height(150.dp)
                        .width(100.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.lindsey),
                            contentDescription = "betty"
                        )
                        Text(
                            text = "Lindsey",
                            color = Color.DarkGray
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))
                    Column (modifier = Modifier.height(150.dp)
                        .width(100.dp)){
                        Image(modifier = Modifier.height(120.dp),
                            painter = painterResource(id = R.drawable.jesee),
                            contentDescription = "betty"
                        )
                        Text(
                            text = "Jesse",
                            color = Color.DarkGray
                        )
                    }

                    Spacer(modifier = Modifier.width(10.dp))
                    Column (modifier = Modifier.height(150.dp)
                        .width(100.dp)){
                        Image(
                            painter = painterResource(id = R.drawable.masaki),
                            contentDescription = "betty"
                        )
                        Text(
                            text = "Purity",
                            color = Color.DarkGray
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column (modifier = Modifier.height(150.dp)
                        .width(100.dp)){
                        Image(
                            painter = painterResource(id = R.drawable.georgia),
                            contentDescription = "betty"
                        )
                        Text(
                            text = "Georgia",
                            color = Color.DarkGray
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))


                }
            }


        }


    }}    }
}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    MitScreen(rememberNavController())
}

