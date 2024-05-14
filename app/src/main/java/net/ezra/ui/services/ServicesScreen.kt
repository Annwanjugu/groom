package net.ezra.ui.services


import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ServicesScreen(navController: NavHostController) {



    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Specialists")
                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.AutoMirrored.Filled.ArrowBack, "backIcon")
                    }
                },

            )
        },

        content = {

            LazyColumn(modifier = Modifier.fillMaxSize()) {
                item {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.White)

                    ) {

                        Spacer(modifier = Modifier.height(70.dp))



                        Row(modifier = Modifier.fillMaxWidth()){

                            Text(
                                text = "salons",
                                fontSize = 30.sp,
                                fontWeight = FontWeight.Bold,
                                fontFamily = FontFamily.Cursive,
                                color = Color.Green
                            )

                            Spacer(modifier = Modifier.width(80.dp))

                            Button(onClick = {navController.navigate(ROUTE_ADD_STUDENTS) /*TODO*/ }) {
                                Text(text = "BOOK NOW",
                                    color = Color.White)
                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))
//                //Row 1
//
                        Row(modifier = Modifier.padding(start = 15.dp)) {
                            //Col 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.greg),
                                            contentDescription = "",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "glamour salon",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "443 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.300",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Gray

                                )


                            }
                            //End of Col 1

                            Spacer(modifier = Modifier.width(20.dp))

                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.barber),
                                            contentDescription = "col",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "Peter's cuts",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "1952 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.200",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Blue

                                )


                            }
                            //End of Col 2


                        }
                        //End of row1
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.padding(start = 15.dp)) {
                            //Col 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.vipspa),
                                            contentDescription = "colo",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "VIP spa",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "547 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.2000",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Blue

                                )


                            }
                            //End of Col 1

                            Spacer(modifier = Modifier.width(20.dp))

                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.rosa),
                                            contentDescription = "co",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "Makeup",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "648 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.1500",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Blue

                                )


                            }
                            //End of Col 2


                        }
                        //End of row 2
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.padding(start = 15.dp)) {
                            //Col 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pedicure),
                                            contentDescription = "co",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "pedicures",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "2345 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.500",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Gray

                                )


                            }
                            //End of Col 1

                            Spacer(modifier = Modifier.width(20.dp))

                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.mani),
                                            contentDescription = "co",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "manicure",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Gray
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "876 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.800",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Gray

                                )


                            }
                            //End of Col 2


                        }
                        //End of row 2
                        Spacer(modifier = Modifier.height(20.dp))
                        Row(modifier = Modifier.padding(start = 15.dp)) {
                            //Col 1
                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.crystal),
                                            contentDescription = "co",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "Sharon salon",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "475 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.200",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Gray

                                )


                            }
                            //End of Col 1

                            Spacer(modifier = Modifier.width(20.dp))

                            Column {
                                Card(
                                    modifier = Modifier
                                        .height(100.dp)
                                        .width(150.dp)
                                ) {
                                    Box(
                                        modifier = Modifier.fillMaxWidth(),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.chalo),
                                            contentDescription = "co",
                                            modifier = Modifier.fillMaxSize(),
                                            contentScale = ContentScale.FillBounds
                                        )
                                        Icon(
                                            imageVector = Icons.Default.FavoriteBorder,
                                            contentDescription = "",
                                            tint = Color.White,
                                            modifier = Modifier
                                                .align(Alignment.TopEnd)
                                                .padding(15.dp)
                                        )
                                    }

                                }
                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "janey salon",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Serif,
                                    fontWeight = FontWeight.Bold
                                )
                                Spacer(modifier = Modifier.height(5.dp))

                                Row {
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                    Icon(
                                        imageVector = Icons.Default.Star,
                                        contentDescription = "star",
                                        tint = Color.Blue
                                    )
                                }
                                Spacer(modifier = Modifier.height(5.dp))
                                Text(
                                    text = "900 reviews",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,

                                    )
                                Text(
                                    text = "From sh.500",
                                    fontSize = 15.sp,
                                    fontFamily = FontFamily.Serif,
                                    color = Color.Blue

                                )


                            }
                            //End of Col 2


                        }
                        //End of row 2




                    }
                }
            }


        })











}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ServicesScreen(rememberNavController())
}

