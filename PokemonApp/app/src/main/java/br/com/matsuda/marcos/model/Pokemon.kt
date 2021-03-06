package br.com.matsuda.marcos.model

import com.google.gson.annotations.SerializedName

data class Pokemon(
        val id: Int,
        @SerializedName("name") val nome: String,
        @SerializedName("sprites") val imagens: PokemonImagens
) {
}