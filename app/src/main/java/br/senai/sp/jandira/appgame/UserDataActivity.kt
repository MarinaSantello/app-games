package br.senai.sp.jandira.appgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.senai.sp.jandira.appgame.databinding.ActivityUserDataBinding
import br.senai.sp.jandira.appgame.model.AccountUser
import br.senai.sp.jandira.appgame.repository.GameRepository

class UserDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserDataBinding
    lateinit var gameRepository: GameRepository
    lateinit var accountUser: AccountUser

//    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        accountUser = AccountUser()

//        id = intent.getIntExtra("id", 0)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater

        inflater.inflate(R.menu.menu_new_user, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menu_save) {
            save()
            return true
        } else if (item.itemId == R.id.menu_settings) {
            Toast.makeText(this, "configurado", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "saiu", Toast.LENGTH_SHORT).show()
            return true
        }
    }

    private fun save() {
        gameRepository = GameRepository(this)

        accountUser.email = binding.editTextEmail.text.toString()
        accountUser.password = binding.editTextPassword.text.toString()
        accountUser.name = binding.editTextName.text.toString()
        accountUser.city = binding.editTextCity.text.toString()

        // demais dados não sei como fazer

        gameRepository.save(accountUser)

//        if (id > 0) {
//            accountUser.id = id
//            gameRepository.update(accountUser)
//        }
//
//        else {
//            val id = gameRepository.save(accountUser)
//        }

        Toast.makeText(this, "ID: ${accountUser.id}", Toast.LENGTH_LONG).show()

        finish()
    }
}