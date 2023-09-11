package br.com.fiap.ecotech.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.ecotech.R
import br.com.fiap.ecotech.ui.theme.EcoTechTheme
import br.com.fiap.ecotech.usuarios.Users

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    var cidade = remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            //----cabeçario----
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(160.dp)
                    .background(colorResource(id = R.color.white))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logohorizontal),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(220.dp)
                        .padding(top = 3.dp)
                )
                Divider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    color = Color.Black,
                    thickness = 1.dp
                )
            }
            //---titulo---
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 32.dp)
            ) {
                Column(
                    modifier = Modifier
                        .offset(y = (-30).dp)
                        .fillMaxWidth(),
                ) {
                    Text(
                        text = "Agende a Retirada do seu resíduo:",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 18.sp,
                        fontWeight = FontWeight(400),
                        color = Color(0xFF717F7F),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
                Column(
                    modifier = Modifier
                        .offset(y = (-30).dp)
                        .fillMaxWidth(),
                ) {
                    OutlinedTextField(
                        value = cidade.value,
                        onValueChange = { cidade.value = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(60.dp),
                        placeholder = {
                            Text(
                                text = "Qual cidade você esta?",
                                fontSize = 20.sp,
                                fontWeight = FontWeight(400),
                                color = Color(0xFFA0A0A0),
                                textAlign = TextAlign.Center
                            )
                        },
                        shape = RoundedCornerShape(31.dp),
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(8.dp)
                            .weight(0.3f)
                    ) {
                        Card(
                            modifier = Modifier
                                .offset(y = (-10).dp)
                                .fillMaxWidth()
                                .height(30.dp),
                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xFFF1F5F4)),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {

                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(8.dp)
                            .weight(0.3f)
                    ) {
                        Card(
                            modifier = Modifier
                                .offset(y = (-30).dp)
                                .fillMaxWidth()
                                .height(30.dp),

                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xFFF1F5F4)),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {

                        }
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(8.dp)
                            .weight(0.3f)
                    ) {
                        Card(
                            modifier = Modifier
                                .offset(y = (-30).dp)
                                .fillMaxWidth()
                                .height(30.dp),

                            colors = CardDefaults
                                .cardColors(containerColor = Color(0xFFF1F5F4)),
                            elevation = CardDefaults.cardElevation(4.dp)
                        ) {

                        }
                    }
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column() {

                        }
                        Column() {

                        }
                        Column() {

                        }
                    }

                }
            }
        }
    }
}