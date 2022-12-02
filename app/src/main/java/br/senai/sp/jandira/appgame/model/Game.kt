package br.senai.sp.jandira.appgame.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// Anotação responsável pela criação da tabela no banco (caso não exista, ela cria também), a partir dos atributos da classe
@Entity(tableName = "tbl_game")
class Game {
    @PrimaryKey(autoGenerate = true)
    var id = 0

    var titulo = ""
    var descricao = ""
    var estudio = ""

    @ColumnInfo(name = "ano_lancamento")
    var anoLancamento = ""

    var finalizado = false
}