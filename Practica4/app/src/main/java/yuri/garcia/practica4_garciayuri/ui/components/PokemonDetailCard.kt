package yuri.garcia.practica4_garciayuri.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yuri.garcia.practica4_garciayuri.R
import yuri.garcia.practica4_garciayuri.model.Pokemon

@Composable
fun PokemonDetailCard(pokemon: Pokemon) {
    Card(
        modifier = Modifier
            .width(190.dp)
            .height(120.dp)
            .padding(12.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.blue)
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    horizontalArrangement = Arrangement.Center
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Altura:",
                            color = colorResource(R.color.white)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "${pokemon.height} m")
                    }
                    Spacer(modifier = Modifier.width(26.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Peso:",
                            color = colorResource(R.color.white)
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = "${pokemon.weight} kg")
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = "Tipo:",
                        color = colorResource(R.color.white)
                    )
                    Spacer(modifier = Modifier.height(2.dp))
                    Text(text = pokemon.type)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailCardPreview(){
    PokemonDetailCard(
        Pokemon(1, "Zeraora", 807, "Eléctrico", 1.5, 44.5, R.drawable.zeraora,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.")
    )
}