package br.senai.sp.jandira.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.senai.sp.jandira.appgame.databinding.ActivityMainBinding
import br.senai.sp.jandira.appgame.repository.UserRepository

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var gameRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retirada da 'action bar' (faixa superior)
        supportActionBar!!.hide()

        binding.buttonEnter.setOnClickListener {
            validarLogin()
        }

        binding.textViewCreateAccount.setOnClickListener {
            val openUserDataActivity = Intent(this, UserDataActivity::class.java)

            startActivity(openUserDataActivity)
        }
    }

    private fun validarLogin() {
        var i = 0

        gameRepository = UserRepository(this)

        val email = binding.editTextEmail.text.toString()
        val password = binding.editTextPassword.text.toString()

        val accountUsers = gameRepository.getAll()

        while (i < accountUsers.size) {
            if(email == accountUsers[i].email && password == accountUsers[i].password) {
                val openUserGamesActivity = Intent(this, UserGamesActivity::class.java)

                openUserGamesActivity.putExtra("id", accountUsers[i].id)

                startActivity(openUserGamesActivity)

                break
            }

            else if (i > accountUsers.size) {
                Toast.makeText(this, "email ou senha incorretos.", Toast.LENGTH_SHORT).show()
                break
            }

            i++
        }
    }
}