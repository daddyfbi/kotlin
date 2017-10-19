package startandroid.myapplication1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.jetbrains.anko.toast
import startandroid.myapplication1.R.id.*


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val result = findViewById(R.id.textView_result) as TextView
        val button_plus = findViewById(R.id.plus) as Button
        val button_minus = findViewById(R.id.minus) as Button
        val button_multiply = findViewById(R.id.multiple) as Button
        val button_divide = findViewById(R.id.divide) as Button


        button_plus.setOnClickListener(View.OnClickListener {
            view -> result.text = getNum1()  +  getNum2().toString()

        })

        button_minus.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() - getNum2().toString())

        })

        button_multiply.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() * getNum2().toString())

        })

        button_divide.setOnClickListener(View.OnClickListener {
            view -> result.text = (getNum1() / getNum2().toString())

        })
    }

    fun getNum1(): Int{
        val input_num1 = findViewById(R.id.edittext_num1) as EditText
        return Integer.parseInt(input_num1.text.toString())
    }
    fun getNum2(): Int{
        val input_num1 = findViewById(R.id.edittext_num1) as EditText
        return Integer.parseInt(input_num1.text.toString())
    }





}




