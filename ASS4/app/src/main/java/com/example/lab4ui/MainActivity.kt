package com.example.lab4ui

import android.app.DatePickerDialog
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.*

import androidx.annotation.RequiresApi
import com.example.myapplication.DatePickerFragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListenerOnButton()
    }


    fun addListenerOnButton() {
        val btn_click:Button = findViewById(R.id.register) as Button
        btn_click.setOnClickListener{
            var radioGroup : RadioGroup = findViewById(R.id.radiogroup)
            var selectedId : Int = radioGroup.checkedRadioButtonId;
            var radioButton : RadioButton = findViewById(selectedId);

            text_show.text = "Name : ${id.text}\nPassword : ${pass_id.text}\nGender : ${radioButton.text}\n" +
                             "Email : ${email_id.text}\n Birthday : ${dateex.text}"
        }
    }

    fun showDatePickerDialog(v : View){
        val newDateFragment = DatePickerFragment()

        newDateFragment.show(supportFragmentManager, "Date Picker")
    }

    fun reset(v : View){
        id.text.clear()
        pass_id.text.clear()
        email_id.text.clear()
        text_show.text = "Show Information"
        dateex.text = " mm / dd / yy "
    }
}



