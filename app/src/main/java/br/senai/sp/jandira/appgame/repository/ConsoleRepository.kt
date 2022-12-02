package br.senai.sp.jandira.appgame.repository

import android.content.Context
import br.senai.sp.jandira.appgame.dao.GameDB
import br.senai.sp.jandira.appgame.model.AccountUser
import br.senai.sp.jandira.appgame.model.Console

class ConsoleRepository (context: Context) {

    private val db = GameDB.getDataBase(context).consoleDAO()

//    // função para salvar os dados inseridos pelo novo usuário, que retorna a quantidade de usuários criados no banco
//    fun save(console: Console): Long{
//        return db.save(console)
//    }
//
//    // função para atualizar os dados do usário, de acordo com as informações passadas pelo usuário, que retorna a quantidade de contas atualizadas
//    fun update(console: Console): Int {
//        return db.update(console)
//    }
//
//    // função para deletar um usuário, que retorna a quantidade de contatos excluídos
//    fun delete(console: Console): Int {
//        return db.delete(console)
//    }
//
//    // função que solicita a lista de contatos do banco, que retorna uma lista com eles
//    fun getAll(): List<Console> {
//        return db.getAll()
//    }
//
//    // função que solicita um usuário expecífico, a partir do ID do registro, que retorna o contato requerido
//    fun getConsoleByID(id: Int): Console {
//        return db.getConsoleByID(id)
//    }
}