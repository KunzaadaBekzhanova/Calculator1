package kg.tutrialapp.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.coroutines.EmptyCoroutineContext.plus


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var firstNumber = findViewById<EditText>(R.id.firstNumber)
        var secondNumber = findViewById<EditText>(R.id.secondNumber)
        var result = findViewById<TextView>(R.id.result_id)
    val button1 = findViewById(R.id.button1) as Button
    button1.setOnClickListener (object : View.OnClickListener {

        override fun onClick(view: View?) {
           result.text = "Result: "+(firstNumber.text.toString().toInt()+secondNumber.text.toString().toInt()).toString()

        }
    })
        val button2 = findViewById(R.id.button2) as Button
        button2.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View?) {
                result.text = "Result: "+ (firstNumber.text.toString().toInt()- secondNumber.text.toString().toInt()).toString()

            }
        })
        val button3 = findViewById(R.id.button3) as Button
        button3.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View?) {
                result.text = "Result: "+ (firstNumber.text.toString().toInt() * secondNumber.text.toString().toInt()).toString()

            }
        })
        val button4 = findViewById(R.id.button4) as Button
        button4.setOnClickListener (object : View.OnClickListener {
            override fun onClick(view: View?) {
                result.text = "Result: "+ (firstNumber.text.toString().toInt()/secondNumber.text.toString().toInt()).toString()

            }
        })

}
}



