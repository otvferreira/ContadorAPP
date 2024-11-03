package br.com.otavio.contadorapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val btnIncrease = findViewById<Button>(R.id.btnIncrease)
        val btnDecrease = findViewById<Button>(R.id.btnDecrease)

        btnIncrease.setOnClickListener {
            counter++
            tvCounter.text = counter.toString()
            btnDecrease.isEnabled = counter > 0
        }

        btnDecrease.setOnClickListener {
            if (counter > 0) {
                counter--
                tvCounter.text = counter.toString()
                btnDecrease.isEnabled = counter > 0
            }
        }

        btnDecrease.isEnabled = false
    }
}
