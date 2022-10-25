package com.example.ra2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ra2.ui.theme.Ra2Theme
import com.example.ra2.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            component()
        }
    }
}

@Composable
fun component() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Teal200)
        ) {
            Text(
                text = "IMSS Digital",
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(top = 16.dp)
                    .padding(start = 16.dp),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.W500
            )

            Text(
                text = "consulta",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 13.dp)
                    .padding(end = 16.dp),
                color = Color.White
            )
        }
        Column() {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Teal200)
                    .padding(end = 16.dp,)
            ) {
                Text(
                    text = "Bienvenidos",
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(start = 16.dp)
                        .padding(bottom = 16.dp),
                    color = Color.White
                )

                Text(
                    text = "NSS",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .clip(CircleShape)
                        .background(Color.White)
                        .padding(horizontal = 8.dp, vertical = 4.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 2.dp)
        ) { //Primer Row img
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(start = 10.dp, end = 3.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 8.dp, bottom = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pulmones),
                        contentDescription = "Imagen de pulmon",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(40.dp)
                    )
                    Text(text = "Módulo Atención Respiratoria (MARSS)",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 3.dp, end = 10.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp, bottom = 12.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.coronavirus),
                        contentDescription = "ImgCOVID",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Permiso COVID 4.0",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 2.dp)
        ) { //Segundo Row img
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(start = 10.dp, end = 3.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp, bottom = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.calendario),
                        contentDescription = "Imagen de calendario",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Cita Medica Familiar",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 3.dp, end = 10.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 8.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.revision),
                        contentDescription = "ImgCOVID",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(57.dp)
                    )
                    Text(text = "CHKT en Línea",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 2.dp)
        ) { //tercer Row img
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(start = 10.dp, end = 3.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp, bottom = 15.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.documento),
                        contentDescription = "Imagen de un documento",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Vigencia de Derechos",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 3.dp, end = 10.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ubicacion),
                        contentDescription = "ImgCOVID",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Alta o cambio de clinica",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp, bottom = 2.dp)
        ) { //cuarto Row img
            Card(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .padding(start = 10.dp, end = 3.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.hombre),
                        contentDescription = "Imagen de una persona",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(45.dp)
                    )
                    Text(text = "informate de tu familiar",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 3.dp, end = 10.dp),
                shape = RoundedCornerShape(20.dp),
                border = BorderStroke(1.dp, color = Color.LightGray)
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)
                        .padding(top = 10.dp, bottom = 10.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cancer),
                        contentDescription = "Icono del cancer",
                        modifier = Modifier
                            .fillMaxWidth()
                            .size(50.dp)
                    )
                    Text(text = "Licencia de 140 Bis",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold)
                }
            }
        }
        Column(
            modifier = Modifier
                .padding(top = 25.dp)
        ) {
            Row() {
                Image(painter = painterResource(id = R.drawable.iconhogar),
                    contentDescription = "icono de inicio",
                    modifier = Modifier
                        .weight(1f)
                        .width(40.dp)
                        .height(40.dp)
                )
                Image(painter = painterResource(id = R.drawable.iconmarcador),
                    contentDescription = "icono de marcador",
                    modifier = Modifier
                        .weight(1f)
                        .width(40.dp)
                        .height(40.dp)
                )
                Image(painter = painterResource(id = R.drawable.iconcalendario),
                    contentDescription = "icono de calendario",
                    modifier = Modifier
                        .weight(1f)
                        .width(40.dp)
                        .height(40.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    component()
}