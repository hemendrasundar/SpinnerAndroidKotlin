package com.hemendra.spinnertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.MultiAutoCompleteTextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var courses_Array = arrayOf("AI","DS","ML","CNN","IOT","BLOCK CHAIN","c++","IOS")

        var arrayadapter = ArrayAdapter<String>(this@MainActivity,android.R.layout.simple_list_item_1,courses_Array)

        gallery.adapter = arrayadapter
      //   lv.adapter = arrayadapter
        /*mtv.setAdapter(arrayadapter)*/
      /*  mtv.threshold = 3
        mtv.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())*/

      /*  lv.onItemClickListener = object :AdapterView.OnItemClickListener{

            override fun onItemClick(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                Toast.makeText(this@MainActivity,courses_Array[position],Toast.LENGTH_SHORT).show()
            }
        }*/
        /* spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener

            {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                //logic
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {

                Toast.makeText(this@MainActivity,courses_Array[position],Toast.LENGTH_SHORT).show()

            }

        }*/
}


}