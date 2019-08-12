package com.toku345.alienvoice

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(listener)
    }

    private val listener: View.OnClickListener = View.OnClickListener {
        var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sample_voice)
        var playBackParams = mediaPlayer?.playbackParams
        playBackParams?.pitch = 2.0f
        mediaPlayer?.playbackParams = playBackParams!!
        mediaPlayer.start()
    }
}
