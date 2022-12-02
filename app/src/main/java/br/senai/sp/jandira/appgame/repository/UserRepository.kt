package br.senai.sp.jandira.appgame.repository

import android.content.Context
import br.senai.sp.jandira.appgame.dao.GameDB
import br.senai.sp.jandira.appgame.model.AccountUser
//import br.senai.sp.jandira.appgame.model.Console

class UserRepository(context: Context) {

    private val db = GameDB.getDataBase(context).gameDAO()

    // função para salvar os dados inseridos pelo novo usuário, que retorna a quantidade de usuários criados no banco
    fun save(accountUser: AccountUser): Long{
        return db.save(accountUser)
    }

    // função para atualizar os dados do usário, de acordo com as informações passadas pelo usuário, que retorna a quantidade de contas atualizadas
    fun update(accountUser: AccountUser): Int {
        return db.update(accountUser)
    }

    // função para deletar um usuário, que retorna a quantidade de contatos excluídos
    fun delete(accountUser: AccountUser): Int {
        return db.delete(accountUser)
    }

    // função que solicita a lista de contatos do banco, que retorna uma lista com eles
    fun getAll(): List<AccountUser> {
        return db.getAll()
    }

    // função que solicita um usuário expecífico, a partir do ID do registro, que retorna o contato requerido
    fun getAccountUserByID(id: Int): AccountUser {
        return db.getAccountUserByID(id)
    }

//    fun getAccountUser(email: String, password: String): AccountUser {
//        return db.getAccountUser(email, password)
//    }

}