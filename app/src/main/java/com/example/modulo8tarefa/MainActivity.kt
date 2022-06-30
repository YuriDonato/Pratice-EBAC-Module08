package com.example.modulo8tarefa

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.appcompat.widget.LinearLayoutCompat
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    var botao: Button? = null
    var textoDeEdicao: EditText? = null
    var textoDeCima: TextView? = null
    var numeroClick: Int = 1
    var tela: LinearLayoutCompat? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        botao = findViewById(R.id.buttonDeTroca)
        textoDeEdicao = findViewById(R.id.textInserirNome)
        textoDeCima = findViewById(R.id.texto)
        tela = findViewById(R.id.tela)


        botao?.setOnClickListener {
            clickNoBotao()
            numeroClick++


            when{
                numeroClick%2 == 0 -> tela?.setBackgroundResource(R.drawable.bola)
                numeroClick%3 == 0 -> tela?.setBackgroundResource(R.drawable.coracao)
                else -> tela?.setBackgroundResource(R.drawable.x)
            }


        }
    }


    fun clickNoBotao(){
        textoDeCima?.text = "Olá ${textoDeEdicao?.text} você clicou no botão $numeroClick vezes!"
    }
}