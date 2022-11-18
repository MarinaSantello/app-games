package br.senai.sp.jandira.appgame.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Console
import java.time.LocalDate

// Anotação responsável pela criação da tabela no banco (caso não exista, ela cria também), a partir dos atributos da classe
@Entity(tableName = "tbl_accountUser")
class AccountUser {
    @PrimaryKey(autoGenerate = true)
    var id = 0

//    var photo: Bitmap? = null
    var email = ""
    var password = ""
    var name = ""
    var city = ""

    @ColumnInfo(name = "birth_date")
//    var birthDate: LocalDate? = null

    var gender = 'I' // Char é '', 1 caracter
//    var console: Console? = null
    var level = EnumLevel.BEGINNER // valor padrão de inicio
}