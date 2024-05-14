package net.ezra.ui.students


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter

import coil.request.ImageRequest
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import com.google.firebase.storage.FirebaseStorage
import java.util.UUID

class LottieActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AddStudents(rememberNavController())
        }
    }
}











@Composable
fun AddStudents(navController: NavHostController) {


    Column(

        modifier = Modifier.padding(15.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "BOOK APPOINTMENT")

        var photoUri: Uri? by remember { mutableStateOf(null) }
        val launcher =
            rememberLauncherForActivityResult(ActivityResultContracts.PickVisualMedia()) { uri ->
                photoUri = uri
            }

        var Name by rememberSaveable {
            mutableStateOf("")
        }

        var Class by rememberSaveable {
            mutableStateOf("")
        }




        OutlinedTextField(
            value = Name,
            onValueChange = { Name = it },
            label = { Text(text = "Name") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )

        OutlinedTextField(
            value = Class,
            onValueChange = { Class = it },
            label = { Text(text = "Service you require") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )

        OutlinedTextField(
            value = Class,
            onValueChange = { Class = it },
            label = { Text(text = "Desired specialist") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )

        OutlinedTextField(
            value = Class,
            onValueChange = { Class = it },
            label = { Text(text = "date of appointment") },
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
        )








    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    AddStudents(rememberNavController())
}




