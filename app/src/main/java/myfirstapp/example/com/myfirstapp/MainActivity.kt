package myfirstapp.example.com.myfirstapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { setupButtonClickListener() }
    }

    private fun setupButtonClickListener() {
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

    companion object {
        val EXTRA_MESSAGE = ""
    }
}
