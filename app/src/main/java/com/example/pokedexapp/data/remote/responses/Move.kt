package com.example.pokedexapp.data.remote.responses

data class Move(
    val move: com.example.pokedexapp.data.remote.responses.MoveX,
    val version_group_details: List<com.example.pokedexapp.data.remote.responses.VersionGroupDetail>
)