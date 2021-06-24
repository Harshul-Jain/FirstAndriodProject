package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //var btnAdd:Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var btnAdd: Button=findViewById(R.id.btnAdd)
        /*
        if btnAdd was declared outside the onCreate function we got error.To resolve it we have two Methods
        1.Remove from above and in OnCreate function write
        var btnAdd: Button=findViewById(R.id.btnAdd)
        2.Simply add ? or !! after btnAdd at setOnClickListener
        i.e btnAdd?.setOnClickListener(View.OnClickListener
        a?.b() means
        if(a!=null){
        a.b()
        }
        btnAdd!!.setOnClickListener(View.OnClickListener
        if(a==b){
         throw NullPointerException()
        }else{
        a.b()
        }
        * */

        /*Another good Feature that kotlin gives is that it smartly assign value
        So,no need to write
        var btnAdd: Button=findViewById(R.id.btnAdd)
        or any other declaration

        simply write the original id from activity_main.xml here
        kotlin itself would smartly change it like
        btnAdd->findViewById<Button>( R.id.btnAdd)
        by importing import kotlinx.android.synthetic.main.activity_main.*

        */
        /*IN JAVA
        a.setListener(new Listener(){
            @Override
            void onListen(){
                //..
            }
        })
        //KOTLIN STAGE 1
        a.setListener(Listener(){
            Override fun onListener():Void{
                //..
            }
        })

        //KOTLIN STAGE 2
        a.setListener(Listener(){ //kotlin knows the only possible function is onListener()
            //..
        })

        //KOTLIN STAGE 3
        a.setListener({ //kotlin knows that setListener always take value of type Listener()
        so no need to write
            //..
        })
        so
        btnAdd.setOnClickListener(View.OnClickListener() {
            Override fun OnClick(v:View ){
            //
            }
        })


        btnAdd.setOnClickListener(View.OnClickListener {
            //..

        })

         */
        btnAdd.setOnClickListener( {
            /*In Java setter and getter
            a.setAlpha(10) Setter
            int b=a.getAlpha() getter
            in Kotlin
            a.alpha=10 //setter
            b=a.alpha //getter
            */
            val result=etVar1.text.toString().toInt()+etVar2.text.toString().toInt()
            tvResult.text=result.toString()

        })
    }

}