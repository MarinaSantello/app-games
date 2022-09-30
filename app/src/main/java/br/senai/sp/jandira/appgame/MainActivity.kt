package br.senai.sp.jandira.appgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater

        inflater.inflate(R.menu.menu_new_user, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menu_save) {
            Toast.makeText(this, "salvo", Toast.LENGTH_SHORT).show()
            return true
        } else if (item.itemId == R.id.menu_settings) {
            Toast.makeText(this, "configurado", Toast.LENGTH_SHORT).show()
            return true
        } else {
            Toast.makeText(this, "saiu", Toast.LENGTH_SHORT).show()
            return true
        }
    }
}