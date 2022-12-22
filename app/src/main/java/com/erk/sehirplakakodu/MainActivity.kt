package com.erk.sehirplakakodu

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.os.SystemClock
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.erk.sehirplakakodu.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            if (binding.editTextNumber.text.isNotEmpty()) {
                
                var plakakodu = binding.editTextNumber.text.toString().toInt()
                when(plakakodu){
                    1 -> binding.textView2.text="Adana"
                    2 -> binding.textView2.text="Adıyaman"
                    3 -> binding.textView2.text="Afyonkarahisar"
                    4 -> binding.textView2.text="Ağrı"
                    5 -> binding.textView2.text="Amasya"
                    6 -> binding.textView2.text="Ankara"
                    7 -> binding.textView2.text="Antalya"
                    8 -> binding.textView2.text="Artvin"
                    9 -> binding.textView2.text="Aydın"
                    10 -> binding.textView2.text="Balıkesir"
                    11 -> binding.textView2.text="Bilecik"
                    11 -> binding.textView2.text="Bingöl"
                    else -> binding.textView2.text="Bulunmadı"
                }
            }
            else{
                binding.textView2.text="Şehir plaka kodunu giriniz"
            }
        }
        binding.editTextNumber.text.clear()
    }
}