package my.android.thirdloginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.android.thirdloginapplication.databinding.ActivityHomeBinding
import my.android.thirdloginapplication.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}