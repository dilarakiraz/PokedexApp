package com.example.pokedexapp.data.remote.responses

data class Pokemon(
    val abilities: List<com.example.pokedexapp.data.remote.responses.Ability>,
    val base_experience: Int,
    val cries: com.example.pokedexapp.data.remote.responses.Cries,
    val forms: List<com.example.pokedexapp.data.remote.responses.Form>,
    val game_indices: List<com.example.pokedexapp.data.remote.responses.Gameİndice>,
    val height: Int,
    val held_items: List<Any?>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokedexapp.data.remote.responses.Move>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any?>,
    val past_types: List<Any?>,
    val species: com.example.pokedexapp.data.remote.responses.Species,
    val sprites: com.example.pokedexapp.data.remote.responses.Sprites,
    val stats: List<com.example.pokedexapp.data.remote.responses.Stat>,
    val types: List<com.example.pokedexapp.data.remote.responses.Type>,
    val weight: Int
)