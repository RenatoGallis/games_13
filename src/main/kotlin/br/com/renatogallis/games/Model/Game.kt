package br.com.renatogallis.games.Model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class  Game (
        @Id val id: String? = null, // nao vai mais ser alterado
        var nome: String,
        var urlImagem: String,
        var anoLancamento: Integer)

