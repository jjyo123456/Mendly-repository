package com.example.lasttry.sev

import android.annotation.SuppressLint
import android.widget.EditText
import android.widget.TextView
import com.example.lasttry.R
import com.google.ai.client.generativeai.GenerativeModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class Geminii {
  
  //  val editText = (R.id.editText)

    // val response = generativeModel.generateContent(prompt)
    // print(response.text)
    // Inside your activity or fragment
    @SuppressLint("SetTextI18n")
    fun someFunction(textView: TextView,editText: EditText) {
        val generativeModel = GenerativeModel(
            // For text-only input, use the gemini-pro model
            modelName = "gemini-pro",
            // Access your API key as a Build Configuration variable (see "Set up your API key" above)
            apiKey = "AIzaSyDoOmWuyvYJFkW_OhjPYHHw2y2ku9hbC7c"
        )

        val prompt = editText.text.toString()
        CoroutineScope(Dispatchers.Main).launch {
            val response = generativeModel.generateContent(prompt)
            // Update the UI with the response text
            textView.text = response.text
            //   text.setText(getString(R.string.name))
        }
    }

// Access the TextView using findViewById
//val textView: TextView = findViewById(R.id.textview)

// Change the text of the TextView
}



