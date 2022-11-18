package br.senai.sp.jandira.appgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import br.senai.sp.jandira.appgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Retirada da 'action bar' (faixa superior)
        supportActionBar!!.hide()

        binding.textViewCreateAccount.setOnClickListener {
            val openUserDataActivity = Intent(this, UserDataActivity::class.java)

            startActivity(openUserDataActivity)
        }
    }
}