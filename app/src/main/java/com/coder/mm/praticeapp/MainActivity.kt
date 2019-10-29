package com.coder.mm.praticeapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.CompoundButton
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener(object:CompoundButton.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: CompoundButton?, p1: Boolean) {
                if(switch1.isChecked){
                    mainView.setBackgroundColor(Color.rgb(21,205,255))
                    edPass.inputType=InputType.TYPE_CLASS_TEXT
                    imgBtn.setImageResource(R.drawable.img1)
                    btn.setBackgroundResource(R.drawable.ic_star_border)
                    switch1.setCompoundDrawablesWithIntrinsicBounds( R.drawable.ic_star_border, 0, 0, 0);
                tvChange.text="Register User"
                    tvChange.setTextColor(Color.GREEN)
                }else{
                    mainView.setBackgroundColor(Color.rgb(100,255,100))

                   edPass.inputType=(InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD)

                    imgBtn.setImageResource(R.drawable.img2)
                    btn.setBackgroundResource(R.drawable.ic_star)
                    switch1.setCompoundDrawablesWithIntrinsicBounds( R.drawable.ic_music, 0, 0, 0)
                    tvChange.text="Login User"
                    tvChange.setTextColor(Color.RED)

                }
            }

        })

    }
}

