package yuri.garcia.practica4_garciayuri.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PokemonDetailCard(){
    Card(
        modifier = Modifier
            .fillMaxWidth()
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun PokemonDetailCardPreview(){
    PokemonDetailCard()
}