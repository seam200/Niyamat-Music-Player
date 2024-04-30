package com.example.niyamatmusicplayer

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnPlay: ImageButton
    private lateinit var btnNext: ImageButton
    private lateinit var btnPause: ImageButton
    private lateinit var btnPrevious: ImageButton // Corrected variable name
    private lateinit var imageView: ImageView
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize mediaPlayer with your audio file
        mediaPlayer = MediaPlayer.create(this, R.raw.your_audio_file)


        btnPlay = findViewById(R.id.btnPlay)
        btnNext = findViewById(R.id.btnNext)
        btnPause = findViewById(R.id.btnPause)
        btnPrevious = findViewById(R.id.btnPreviouse) // Corrected ID
        imageView = findViewById(R.id.imageView)

        btnPlay.setOnClickListener {
            if (!mediaPlayer.isPlaying) {
                // Start playing audio
                mediaPlayer.start()
                Toast.makeText(this, "Audio started playing", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Audio is already playing", Toast.LENGTH_SHORT).show()
            }
        }

        btnNext.setOnClickListener {
            // Handle next button click
            Toast.makeText(this, "Next button clicked", Toast.LENGTH_SHORT).show()
        }

        btnPause.setOnClickListener {
            // Handle pause button click
            Toast.makeText(this, "Pause button clicked", Toast.LENGTH_SHORT).show()
        }

        btnPrevious.setOnClickListener {
            // Handle previous button click
            Toast.makeText(this, "Previous button clicked", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release() // Release MediaPlayer resources
    }
}
