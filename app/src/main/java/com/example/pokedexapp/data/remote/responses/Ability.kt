package com.example.pokedexapp.data.remote.responses

data class Ability(
    val ability: com.example.pokedexapp.data.remote.responses.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)