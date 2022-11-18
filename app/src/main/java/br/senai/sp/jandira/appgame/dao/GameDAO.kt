package br.senai.sp.jandira.appgame.dao

import androidx.room.*
import br.senai.sp.jandira.appgame.model.AccountUser

// Anotação responsável por indicar que o ROOM deve gerenciar a classe como um DAO
@Dao
interface GameDAO {

    // Anotação responsável por fazer o método 'save' retornar o id do contato gerado no banco (retorno importante para controle de sucesso da execução)
    @Insert
    fun save(game: AccountUser): Long

    // Anotação responsável por fazer o método 'delete' retornar a quantidade de contatos deletados no banco (retorno importante para controle de sucesso da execução)
    @Delete
    fun delete(game: AccountUser): Int

    // Anotação responsável por fazer o método 'update' retornar a quantidade de contatos atualizados no banco (retorno importante para controle de sucesso da execução)
    @Update
    fun update(game: AccountUser): Int

    // Anotação responsável por fazer o método 'getAll' retornar uma lista com todos os contatos da tabela de contatos, em ordem alfabética
    @Query("select * from tbl_accountUser order by name asc")
    fun getAll(): List<AccountUser>

    // Anotação responsável por fazer o método 'getContactByID' retornar um contato do banco
    @Query("SELECT * FROM tbl_accountUser WHERE id = :id") // ':id'- parâmetro que recebe informação do argumento do método 'getContactByID'
    fun getAccountUserByID(id: Int): AccountUser

}