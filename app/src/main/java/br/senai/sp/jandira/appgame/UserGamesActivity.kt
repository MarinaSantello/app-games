package br.senai.sp.jandira.appgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.appgame.databinding.ActivityUserGamesBinding
import br.senai.sp.jandira.appgame.repository.UserRepository

class UserGamesActivity : AppCompatActivity() {
    
    lateinit var binding: ActivityUserGamesBinding
    lateinit var gameRepository: UserRepository
    private var id = 0
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        gameRepository = UserRepository(this)
        id = intent.getIntExtra("id", 0)

        val accountUser = gameRepository.getAccountUserByID(id)

        binding.textNamePerson.text = accountUser.name
        binding.textEmailPerson.text = accountUser.email
        binding.textViewLevel.text = accountUser.level
    }
}