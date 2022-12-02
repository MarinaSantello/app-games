package br.senai.sp.jandira.appgame.dao

import androidx.room.*
import br.senai.sp.jandira.appgame.model.Console

@Dao
interface ConsoleDAO {
    // Anotação responsável por fazer o método 'save' retornar o id do contato gerado no banco (retorno importante para controle de sucesso da execução)
//    @Insert
//    fun save(console: Console): Long
//
//    // Anotação responsável por fazer o método 'delete' retornar a quantidade de contatos deletados no banco (retorno importante para controle de sucesso da execução)
//    @Delete
//    fun delete(console: Console): Int
//
//    // Anotação responsável por fazer o método 'update' retornar a quantidade de contatos atualizados no banco (retorno importante para controle de sucesso da execução)
//    @Update
//    fun update(console: Console): Int
//
//    // Anotação responsável por fazer o método 'getAll' retornar uma lista com todos os contatos da tabela de contatos, em ordem alfabética
//    @Query("select * from tbl_console order by nome_console")
//    fun getAll(): List<Console>
//
//    // Anotação responsável por fazer o método 'getContactByID' retornar um contato do banco
//    @Query("SELECT * FROM tbl_console WHERE id = :id") // ':id'- parâmetro que recebe informação do argumento do método 'getContactByID'
//    fun getConsoleByID(id: Int): Console
}