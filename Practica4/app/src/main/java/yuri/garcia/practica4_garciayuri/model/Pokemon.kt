package yuri.garcia.practica4_garciayuri.model

import yuri.garcia.practica4_garciayuri.R

data class Pokemon(
    val id: Int,
    val name: String,
    val numPkdx: Int,
    val type: String,
    val height: Double,
    val weight: Double,
    val imageRes: Int = 0,
    val description: String
)

val samplePokemon = listOf(
    Pokemon(1, "Zeraora", 807, "Eléctrico", 1.5, 44.5, R.drawable.zeraora,
        "Las almohadillas de sus patas desprenden descargas eléctricas. Cuando corre, hace que los rayos caigan y que los truenos resuenen."),
    Pokemon(2, "Sprigatito", 906, "Planta", 0.4, 4.1, R.drawable.sprigatito,
        "Su sedoso pelaje se asemeja en composición a las plantas. Se lava la cara con diligencia para que no se le seque."),
    Pokemon(3, "Meowscarada", 908, "Planta / Siniestro", 1.5, 31.2, R.drawable.meowscarada,
        "Después de desviar hábilmente la atención del oponente, le lanza sus bombas florales rellenas de polen y las hace estallar sin que se dé cuenta."),
    Pokemon(4, "Riolu", 447, "Lucha", 0.7, 20.2, R.drawable.riolu,
        "Se comunica con los suyos emitiendo ondas. Puede pasarse toda una noche corriendo."),
    Pokemon(5, "Lucario", 448, "Lucha / Acero", 1.2, 54.0, R.drawable.lucario,
        "Puede percibir el aura de aquello que lo rodea. Es capaz de percibir las emociones de otros incluso a 1 km de distancia."),
    Pokemon(6, "Zorua", 570, "Siniestro", 0.7, 12.5, R.drawable.zorua,
        "Se transforma en otros para crear desconcierto. A menudo, adopta la forma de un niño parco en palabras."),
    Pokemon(7, "Zoroark", 571, "Siniestro", 1.6, 81.1, R.drawable.zoroark,
        "Se dice que Zoroark atrapa en un mundo de ilusiones a quien lo intenta capturar y que, de esta manera, lo castiga."),
    Pokemon(8, "Rockruff", 744, "Roca", 0.5, 9.2, R.drawable.rockruff,
        "Cuando es pequeño es muy cariñoso. A medida que crece se vuelve más agresivo, pero la lealtad hacia su Entrenador perdura para siempre."),
    Pokemon(9, "Lycanroc", 745, "Roca", 1.1, 25.0, R.drawable.lycanroc,
        "Desgarra a cualquiera que se acerque con su melena de piedra. Si no está de acuerdo con las instrucciones de su Entrenador, las ignora."),
    Pokemon(10, "Eevee", 133, "Normal", 0.3, 6.5, R.drawable.eevee,
        "Es capaz de evolucionar de muchas maneras para adaptarse sin problemas a cualquier medio."),
    Pokemon(11, "Umbreon", 197, "Siniestro", 1.0, 27.0, R.drawable.umbreon,
        "Si se expone al aura de la luna, los anillos de su cuerpo relucen y adquiere un poder misterioso"),
    Pokemon(12, "Fletchling", 661, "Normal / Volador", 0.3, 1.7, R.drawable.fletchling,
        "Por lo general se muestra calmado, pero, al entrar en combate, su equilibrio hormonal se altera y se vuelve agresivo.")
)

var selectedPokemon: Pokemon? = null