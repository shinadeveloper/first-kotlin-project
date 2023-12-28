package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var currentimage= 0
    lateinit var image: ImageView
    val places= arrayOf("Golden Temple","Ram Tirath","Wagah Border","jallianwala Bagh","Khalsa College")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var next=findViewById<ImageButton>(R.id.btnnext)
        var prev=findViewById<ImageButton>(R.id.btnback)
        var placename=findViewById<TextView>(R.id.textView2)

        next.setOnClickListener{
            var idcurrentimagestring= "pic$currentimage"
            var idcurrentimageint=this.resources.getIdentifier(idcurrentimagestring,"id",packageName)
            image=findViewById(idcurrentimageint)
            image.alpha=0f

            currentimage=(5+currentimage+1)%5
            var idimagetoshowstring= "pic$currentimage"
            var imageidtoshowint=this.resources.getIdentifier(idimagetoshowstring,"id",packageName)
            image=findViewById(imageidtoshowint)
            image.alpha=1f
            placename.text=places[currentimage]
        }
        prev.setOnClickListener{
            var idcurrentimagestring= "pic$currentimage"
            var idcurrentimageint=this.resources.getIdentifier(idcurrentimagestring,"id",packageName)
            image=findViewById(idcurrentimageint)
            image.alpha=0f

            currentimage=(5+currentimage-1)%5
            var idimagetoshowstring= "pic$currentimage"
            var imageidtoshowint=this.resources.getIdentifier(idimagetoshowstring,"id",packageName)
            image=findViewById(imageidtoshowint)
            image.alpha=1f
            placename.text=places[currentimage]
        }

    }
}