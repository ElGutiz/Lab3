package com.example.laboratorio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first_place = findViewById<Button>(R.id.first_place)
        val second_place = findViewById<Button>(R.id.second_place)
        val third_place = findViewById<Button>(R.id.third_place)
        val f_name = findViewById<FloatingActionButton>(R.id.f_name)
        val textView = findViewById<TextView>(R.id.textView)
        val get_name = findViewById<TextView>(R.id.get_name)
        val nombre = findViewById<EditText>(R.id.nombre)
        val comentario = intent.getStringExtra("Comentario_final")

        Toast.makeText(this, comentario, Toast.LENGTH_SHORT).show();

        first_place.setOnClickListener {
            val quetzal = Intent(this@MainActivity, Puerto_Quetzal::class.java)
            startActivity(quetzal)
        }

        second_place.setOnClickListener {
            val tikall = Intent(this@MainActivity, Tikal::class.java)
            startActivity(tikall)
        }

        third_place.setOnClickListener {
            val lago = Intent(this@MainActivity, Lago_Atitlan::class.java)
            startActivity(lago)
        }

        f_name.setOnClickListener {
            if(nombre.getVisibility() == VISIBLE){
                textView.visibility = View.INVISIBLE
                get_name.visibility = View.VISIBLE
                get_name.text = nombre.text
                nombre.visibility = View.INVISIBLE
            }else{
                if(nombre.getVisibility() == INVISIBLE) {
                    textView.visibility = View.VISIBLE
                    get_name.visibility = View.INVISIBLE
                    nombre.visibility = View.VISIBLE
                }
            }
        }
    }
}
