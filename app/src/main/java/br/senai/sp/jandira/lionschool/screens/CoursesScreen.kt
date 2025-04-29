package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.lionschool.R
import br.senai.sp.jandira.lionschool.screens.components.coursesCards


@Composable
fun CoursesScreen(modifier: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .height(56.dp),
                    painter = painterResource(
                        R.drawable.logo_image
                    ),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Lion School",
                    color = Color(51, 71, 176),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .width(70.dp),
                )
            }
            HorizontalDivider(
                color = Color(255, 194, 61),
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 24.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                 placeholder = {
                    Text(
                        text = "Find your course",
                        fontWeight = FontWeight.Thin,
                        fontSize = 14.sp
                    )
                 },
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = Color(255, 194, 61)
                ),
                modifier = Modifier
                    .fillMaxWidth(),
                trailingIcon = {
                    Icon(
                        painter = painterResource(
                            R.drawable.search
                        ),
                        contentDescription = "",
                        tint = Color.Gray,
                        modifier = Modifier
                            .height(20.dp)
                    )
                }
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .size(36.dp),
                    painter = painterResource(
                        R.drawable.lista_logo,
                    ),
                    contentDescription = ""
                )
                Text(
                    text = "Courses",
                    fontSize = 24.sp,

                )
            }
            coursesCards(
                logo = painterResource(R.drawable.ds_course),
                sigla = "DS",
                nome = "Desenvolvimento de Sistemas",
                descricao = "Learn to develop web and mobile applications.",
                semestres = 3
            )
            coursesCards(
                logo = painterResource(R.drawable.rds_course),
                sigla = "RDS",
                nome = "Redes de Computadores",
                descricao = "Learn to design communication networks.",
                semestres = 3
            )
            coursesCards(
                logo = painterResource(R.drawable.ele_course),
                sigla = "ELE",
                nome = "Eletroeletrônica",
                descricao = "Learn to design communication networks.",
                semestres = 3
            )
        }
    }
}

@Preview
@Composable
private fun CoursesScreenPreview() {
    CoursesScreen(null)
}

