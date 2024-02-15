package my.android.thirdloginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import my.android.thirdloginapplication.databinding.ActivityMainBinding
import my.android.thirdloginapplication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}