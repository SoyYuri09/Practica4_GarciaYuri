package yuri.garcia.practica4_garciayuri.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yuri.garcia.practica4_garciayuri.R
import yuri.garcia.practica4_garciayuri.model.Pokemon

@Composable
fun PokemonImageCard(pokemon: Pokemon){
    Card(
        modifier = Modifier
            .width(190.dp)
            .height(190.dp)
            .padding(12.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = colorResource(R.color.gray)
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(pokemon.imageRes),
                contentDescription = "img${pokemon.id}",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(150.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PokemonImageCardPreview(){
    PokemonImageCard(
        Pokemon(1, "Zeraora", 807, "Eléctrico", 1.5, 44.5, R.drawable.zeraora,
            "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen.")
    )
}