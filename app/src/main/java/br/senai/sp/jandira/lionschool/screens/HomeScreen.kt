package br.senai.sp.jandira.lionschool.screens

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.lionschool.R

@Composable
fun HomeScreen(navegacao: NavHostController?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp)
    ){
        Column (
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    modifier = Modifier
                        .size(160.dp),
                    painter = painterResource(
                        R.drawable.logo_image
                    ),
                    contentDescription = ""
                )
                Text(
                    text = "Lion School",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(51, 71, 176),
                    modifier = Modifier
                        .width(150.dp)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Find your favorite course",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(51, 71, 176)
                )
                Card (
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 16.dp )
                        .height(6.dp)
                        .width(64.dp),
                    shape = RoundedCornerShape(64.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color(255, 194, 6)
                    )
                ){}
                Text(
                    textAlign = TextAlign.Center,
                    text = "Get to your destination faster, study at the best vocational school in Brazil. Be the best version of yourself.",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(158, 159, 164)
                )
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(255, 194, 61)
                ),
                border = BorderStroke(1.5.dp, Color(51, 71, 176)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "Get Started",
                    color = Color(51, 71, 176),
                    modifier = Modifier
                        .padding(horizontal = 64.dp)
                )
            }
            Row (
                modifier = Modifier
                    .padding(bottom = 16.dp)
            ){
                Image(
                    modifier = Modifier
                        .size(32.dp),
                    painter = painterResource(
                        R.drawable.youtube
                    ),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(24.dp))
                Image(
                    modifier = Modifier
                        .size(32.dp),
                    painter = painterResource(
                        R.drawable.twitter
                    ),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(24.dp))
                Image(
                    modifier = Modifier
                        .size(32.dp),
                    painter = painterResource(
                        R.drawable.instagram
                    ),
                    contentDescription = ""
                )
                Spacer(modifier = Modifier.width(24.dp))
                Image(
                    modifier = Modifier
                        .size(32.dp),
                    painter = painterResource(
                        R.drawable.facebook
                    ),
                    contentDescription = ""
                )
            }
        }
    }
}


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(null)
}