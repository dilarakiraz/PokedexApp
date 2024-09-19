package com.example.pokedexapp.data.remote.responses

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokedexapp.data.remote.responses.MoveLearnMethod,
    val version_group: com.example.pokedexapp.data.remote.responses.VersionGroup
)