package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn=findViewById<Button>(R.id.button)


        btn.setOnClickListener(View.OnClickListener {
            //var a:Editable =input.text;
            //var num:Int=a.toString().toInt();
            var input=findViewById<EditText>(R.id.inputNumber).text.toString().toInt()
            var result=findViewById<TextView>(R.id.tv_3)
            var i:Int= 1;
            var s:String = "";
            while(i<=input){
                s += "$i@";//concatinating s = s + i
                i++
                result.text="$s"
            }

        });
    }
}