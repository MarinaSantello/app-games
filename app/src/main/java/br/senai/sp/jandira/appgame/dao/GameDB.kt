package br.senai.sp.jandira.appgame.dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import br.senai.sp.jandira.appgame.model.AccountUser

// Classe que acessa o banco de dados
@Database(entities = [AccountUser::class], version = 1)
abstract class GameDB: RoomDatabase() {

    abstract fun gameDAO(): GameDAO

//    abstract fun consoleDAO(): ConsoleDAO

    companion object {
        private lateinit var instance: GameDB

        fun getDataBase(context: Context): GameDB {
            // '::' - forçar a incialização da variável
            // validação se a instancia já existe
            if(!::instance.isInitialized) {
                // Criação de apenas uma instância
                instance = Room.databaseBuilder(context,
                                                GameDB::class.java,
                                                "db_game").allowMainThreadQueries().build()

                return instance
            }

            return instance
        }
    }

}