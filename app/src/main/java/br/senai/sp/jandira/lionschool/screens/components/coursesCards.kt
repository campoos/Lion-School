package br.senai.sp.jandira.lionschool.screens.components

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.lionschool.R

@Composable
fun coursesCards (
    logo: Painter = painterResource(R.drawable.logo_image),
    sigla: String = "NN",
    nome: String = "nome não especificado",
    descricao: String = "sem descrição",
    semestres: Int = 0
) {
    Card (
        modifier = Modifier
            .height(209.dp)
            .width(322.dp),
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
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
                    .background(Color.Red)
            ){
            }
        }
    }
}

@Preview
@Composable
private fun coursesCardsPreview() {
    coursesCards()
}