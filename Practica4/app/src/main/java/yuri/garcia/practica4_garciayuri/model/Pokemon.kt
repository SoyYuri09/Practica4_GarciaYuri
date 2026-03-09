package yuri.garcia.practica4_garciayuri.model

import yuri.garcia.practica4_garciayuri.R

data class Pokemon(
    val id: Int,
    val nombre: String,
    val numPkdx: Int,
    val tipo: String,
    val altura: Double,
    val peso: Double,
    val imageRes: Int = 0
)

val samplePokemon = listOf(
    Pokemon(1, "Zeraora", 807, "Eléctrico", 1.5, 44.5, R.drawable.zeraora),
    Pokemon(2, "Sprigatito", 906, "Planta", 0.4, 4.1, R.drawable.sprigatito),
    Pokemon(3, "Meowscarada", 908, "Planta / Siniestro", 1.5, 31.2, R.drawable.meowscarada),
    Pokemon(4, "Riolu", 447, "Lucha", 0.7, 20.2, R.drawable.riolu),
    Pokemon(5, "Lucario", 448, "Lucha / Acero", 1.2, 54.0, R.drawable.lucario),
    Pokemon(6, "Zorua", 570, "Siniestro", 0.7, 12.5, R.drawable.zorua),
    Pokemon(7, "Zoroark", 571, "Siniestro", 1.6, 81.1, R.drawable.zoroark),
    Pokemon(8, "Rockruff", 744, "Roca", 0.5, 9.2, R.drawable.rockruff),
    Pokemon(9, "Lycanroc", 745, "Roca", 1.1, 25.0, R.drawable.lycanroc),
    Pokemon(10, "Eevee", 133, "Normal", 0.3, 6.5, R.drawable.eevee),
    Pokemon(11, "Umbreon", 197, "Siniestro", 1.0, 27.0, R.drawable.umbreon),
    Pokemon(12, "Fletchling", 661, "Normal / Volador", 0.3, 1.7, R.drawable.fletchling)
)