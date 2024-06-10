package com.example.tabview

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.PopupWindow
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    private lateinit var nameSign: EditText
    private lateinit var passwordSign: EditText
    private lateinit var loginButton: Button
    private lateinit var clearButton: Button
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var instructionsButton: ImageButton
    private lateinit var instructionsPopup: PopupWindow

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameSign = findViewById(R.id.nameSign)
        passwordSign = findViewById(R.id.passwordSign)
        loginButton = findViewById(R.id.signInButton)
        clearButton = findViewById(R.id.clearButton)
        instructionsButton = findViewById(R.id.instructions)

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        loginButton.setOnClickListener {
            val inputText = nameSign.text.toString()
            val inputText1 = passwordSign.text.toString()
            val editor = sharedPreferences.edit()
            editor.putString("name", inputText)
            editor.putString("password", inputText1)
            editor.apply()
            val intent = Intent(this, TabViewPage::class.java)
            startActivity(intent)
        }

        clearButton.setOnClickListener {
            nameSign.text.clear()
            passwordSign.text.clear()
        }

        instructionsButton.setOnClickListener {
            val inflater = getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            instructionsPopup = instructPopUp(this, inflater)
            instructionsPopup.showAtLocation(findViewById(android.R.id.content), Gravity.CENTER, 0, 50)
        }
    }

    private fun instructPopUp(context: Context, inflater: LayoutInflater): PopupWindow {
        val popupView = inflater.inflate(R.layout.instructionspopup, null)
        val popupWindow = PopupWindow(popupView, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        popupWindow.setBackgroundDrawable(ContextCompat.getDrawable(context, R.drawable.popupbg))

        val closeButton = popupView.findViewById<Button>(R.id.closeButton)
        closeButton.setOnClickListener {
            popupWindow.dismiss()
        }

        return popupWindow
    }
}
