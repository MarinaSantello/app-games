package br.senai.sp.jandira.appgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import br.senai.sp.jandira.appgame.databinding.ActivityUserDataBinding
import br.senai.sp.jandira.appgame.model.AccountUser
//import br.senai.sp.jandira.appgame.model.Console
//import br.senai.sp.jandira.appgame.repository.ConsoleRepository
import br.senai.sp.jandira.appgame.repository.GameRepository

class UserDataActivity : AppCompatActivity() {

    lateinit var binding: ActivityUserDataBinding
    lateinit var gameRepository: GameRepository
    lateinit var accountUser: AccountUser
//    lateinit var consoleRepository: ConsoleRepository
//    lateinit var console: Console

//    private var id = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityUserDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        accountUser = AccountUser()
//        console = Console()

//        insertConsole()

//        id = intent.getIntExtra("id", 0)
    }

//    private fun insertConsole() {
//        val consoles = arrayOf("PlayStation 5", "PlayStation 4", "PlayStation 3", "XBox One", "XBox 360", "Nintendo Switch", "Super Nintendo", "Nintendo 6")
//        var i = 0
//        consoleRepository = ConsoleRepository(this)
//
//        while (i < consoles.size) {
//            console.nomeConsole = "teste"
//            Toast.makeText(this, "${consoles[i]}", Toast.LENGTH_SHORT).show()
//
//            consoleRepository.saveConsole(console)
//
//            i++
//        }
//
//    }

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

        val option = binding.radioGroup!!.checkedRadioButtonId

        accountUser.gender = option.toChar()

        // demais dados não sei como fazer

        val id = gameRepository.save(accountUser)

        Toast.makeText(this, "ID: ${option.toChar()}", Toast.LENGTH_LONG).show()

        finish()
    }
}