package ru.aston.astonintensiv3

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.squareup.picasso.Picasso
import ru.aston.astonintensiv3.databinding.ActivityTask2Binding

class Task2Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTask2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var uri: String
        val pictureWidth = 800
        val pictureHeight = 0

        with(binding) {
            linkEdittext.addTextChangedListener {
                try {
                    uri = linkEdittext.text.toString()
                    Picasso.get().load(uri)
                        .resize(pictureWidth, pictureHeight)
                        .placeholder(R.drawable.ic_user_placeholder)
                        .error(R.drawable.ic_user_placeholder)
                        .into(pictureView)
                } catch (e: java.lang.Exception){
                    val toast = Toast.makeText(this@Task2Activity, "Unable to download image from this link", Toast.LENGTH_SHORT)
                    toast.show()
                }
            }
        }
    }
}