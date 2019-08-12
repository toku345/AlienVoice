package com.toku345.alienvoice

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mediaPlayer = MediaPlayer.create(applicationContext, R.raw.sample_voice)
        var playBackParams = mediaPlayer?.playbackParams
        playBackParams?.pitch = 2.0f
        mediaPlayer?.playbackParams = playBackParams!!
        mediaPlayer.start()
    }
}
