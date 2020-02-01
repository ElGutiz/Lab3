package com.example.laboratorio3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.laboratorio3.databinding.ActivityTikalBinding

import kotlinx.android.synthetic.main.activity_tikal.*

class Tikal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityTikalBinding = DataBindingUtil.setContentView(this, R.layout.activity_tikal)

        val comentario = findViewById<EditText>(R.id.final_comment)
        val sub_coment = findViewById<Button>(R.id.sub_comment)

        sub_coment.setOnClickListener {
            val comment_final = comentario.text.toString()

            val main = Intent(this@Tikal, MainActivity::class.java)
            main.putExtra("Comentario_final", comment_final)
            startActivity(main)
        }
    }

}
