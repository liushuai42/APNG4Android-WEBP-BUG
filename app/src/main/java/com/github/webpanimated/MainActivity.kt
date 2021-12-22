package com.github.webpanimated

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.github.penfeizhou.animation.webp.WebPDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.assets).apply {
            setImageDrawable(WebPDrawable.fromAsset(baseContext, "demo.webp"))
        }

        val fromUrl = findViewById<ImageView>(R.id.url)
        Glide.with(fromUrl)
            .load("https://isparta.github.io/compare-webp/image/gif_webp/webp/2.webp")
            .into(fromUrl)
    }
}