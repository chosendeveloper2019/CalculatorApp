package com.kritsanadum.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    var cal = 0
//    var conText = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("Hola")

        btn_plus.setOnClickListener {

           calculator(et_input1.text.toString(),et_input2.text.toString(),1)

        }

        btn_minus.setOnClickListener {

            calculator(et_input1.text.toString(),et_input2.text.toString(),2)

        }

        btn_squre.setOnClickListener {

            calculator(et_input1.text.toString(),et_input2.text.toString(),3)
        }

        btn_divide.setOnClickListener {

            calculator(et_input1.text.toString(),et_input2.text.toString(),4)
        }

    }

    fun calculator(input1:String , input2:String ,condition : Int){
        /*  condition
        *   if 1 then plus
        *   if 2 then minus
        *   if 3 then squre
        *   if 4 then divide
        * */
        if(condition == 1)
          tv_result.text = ""+(input1.toInt() + input2.toInt())
        else if(condition == 2)
            tv_result.text = ""+(input1.toInt() - input2.toInt())
        else if(condition == 3)
            tv_result.text = ""+(input1.toInt() * input2.toInt())
        else if(condition == 4)
            tv_result.text = ""+(input1.toFloat() / input2.toFloat())

    }
}
