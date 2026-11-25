package com.caronix.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.widget.TextView
import android.widget.LinearLayout
import android.view.Gravity

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val tela = LinearLayout(this)
        tela.orientation = LinearLayout.VERTICAL
        tela.gravity = Gravity.CENTER
        tela.setBackgroundColor(Color.rgb(35, 180, 155))

        val titulo = TextView(this)
        titulo.text = "CARONIX"
        titulo.textSize = 36f
        titulo.setTextColor(Color.WHITE)
        titulo.gravity = Gravity.CENTER

        tela.addView(titulo)

        setContentView(tela)
    }
}
