package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable
fun coursesCards (
    logo: Painter = painterResource(R.drawable.logo_image),
    sigla: String = "NN",
    nome: String = "nome não especificado",
    descricao: String = "sem descrição definida",
    semestres: Int = 0
) {
    Card (
        modifier = Modifier
            .padding(top = 10.dp)
            .height(209.dp)
            .width(322.dp),
        border = BorderStroke(1.dp, Color(255, 194, 61))
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(51, 71, 176),
                            Color(207, 212, 234)
                        )
                    )
                )
        ){
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ){
                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier
                            .size(100.dp),
                        painter = logo,
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier .width(10.dp))
                    Text(
                        text = sigla,
                        fontSize = 64.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(255, 194, 61)
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(top = 10.dp)
                ){
                    Text(
                        text = nome,
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier .height(2.dp))
                    Text(
                        text = descricao,
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
                Row (
                    modifier = Modifier
                        .padding(top = 15.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        modifier = Modifier
                            .size(15.dp),
                        painter = painterResource(
                            R.drawable.relogio_semestre
                        ),
                        contentDescription = ""
                    )
                    Spacer(modifier = Modifier .width(4.dp))
                    Text(
                        text = "$semestres semestres",
                        fontSize = 10.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun coursesCardsPreview() {
    coursesCards()
}