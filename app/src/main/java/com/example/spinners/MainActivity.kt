package com.example.spinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // using the data collected on runtime
        //lets assume the collection below the user has just input

        val items = arrayOf("First","Second","Third")
         // then we need an adapter to connect the data with each row in the spinner (like with recycler views)

        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item,items)   //support_simple_spinner_dropdown_item is a predefined layout for spinners in Android
        // we set the just created adapter to the spinner

        spMonths.adapter = adapter

        // create the OnItemSelectedListener
        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                adapterView: AdapterView<*>?,
                view: View?,
                index: Int,
                id: Long
            ) {

                //put here all the tasks needed
                Toast.makeText(
                    this@MainActivity,
                    "You selected item ${adapterView?.getItemAtPosition(index)}",
                    Toast.LENGTH_SHORT
                ).show()

            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }


        }

    }


}