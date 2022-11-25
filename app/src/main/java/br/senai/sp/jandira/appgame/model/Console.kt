//package br.senai.sp.jandira.appgame.model
//
//import androidx.room.ColumnInfo
//import androidx.room.Entity
//import androidx.room.PrimaryKey
//
//// Anotação responsável pela criação da tabela no banco (caso não exista, ela cria também), a partir dos atributos da classe
//@Entity(tableName = "tbl_console")
//class Console {
//    @PrimaryKey(autoGenerate = true)
//    var id = 0
//
//    @ColumnInfo(name = "nome_console")
//    var nomeConsole = ""
//
//    var fabricante = ""
//    var descricao = ""
//    //var photo: Drawable? = null
//
//    @ColumnInfo(name = "ano_lancamento")
//    var anoLancamento = 0
//}