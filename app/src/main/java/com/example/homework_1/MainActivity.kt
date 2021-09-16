package com.example.homework_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    var cost: Double = 0.0
    var calories: Int = 0
    var count: Int = 0
    var count1: Int = 0
    var toppingCount: Int = 0
    lateinit var costT: TextView
    lateinit var calory: TextView
    lateinit var num: EditText
    lateinit var btn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        costT = findViewById<TextView>(R.id.Result)
        calory = findViewById<TextView>(R.id.Result1)
        num = findViewById(R.id.Number)
        btn = findViewById<View>(R.id.button) as Button
        btn.setOnClickListener{
            var value: Int = Integer.parseInt(num.getText().toString())
            cost *= value
            calories *= value
            costT.setText(cost.toString())
            calory.setText(calories.toString())
        }

    }

    fun onBunCheckboxClicked(view: View){
        val whiteBun: CheckBox = findViewById(R.id.white)
        val wheatBun: CheckBox = findViewById(R.id.wheat)
        var checkboxjustclicked: CheckBox = CheckBox(this)

        if (view is CheckBox) {

            when (view.id) {
               R.id.white -> {
                    checkboxjustclicked = whiteBun
                    if(checkboxjustclicked.isChecked && count < 1){
                        cost += 1
                        calories += 140
                        count++
                    }
                   else if(!checkboxjustclicked.isChecked && count == 1){
                        cost -= 1
                        calories -= 140
                        count--
                    }
                   else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.wheat -> {
                    checkboxjustclicked = wheatBun
                    if(checkboxjustclicked.isChecked && count < 1){
                        cost += 1
                        calories += 100
                        count++
                    }
                    else if(!checkboxjustclicked.isChecked && count == 1){
                        cost -= 1
                        calories -= 100
                        count--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }


        costT.setText(cost.toString())
        calory.setText(calories.toString())

    }

    fun onPattyCheckboxClicked(view: View){
        var pattyCount: Int = 0
        val grilledChicken: CheckBox = findViewById(R.id.Grilled_Chicken)
        val beef: CheckBox = findViewById(R.id.Beef)
        val salmon: CheckBox = findViewById(R.id.Salmon)
        val turkey: CheckBox = findViewById(R.id.Turkey)
        val veggie: CheckBox = findViewById(R.id.Veggie)
        var checkboxjustclicked: CheckBox = CheckBox(this)
        if(view is CheckBox){
            when(view.id){
                R.id.Grilled_Chicken ->{
                    checkboxjustclicked = grilledChicken
                    if(checkboxjustclicked.isChecked && count1 < 1){
                        cost += 5
                        calories += 240
                        count1++
                    }
                    else if(!checkboxjustclicked.isChecked && count1 == 1){
                        cost -= 5
                        calories -= 240
                        count1--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Beef ->{
                    checkboxjustclicked = beef
                    if(checkboxjustclicked.isChecked && count1 < 1){
                        cost += 5
                        calories += 180
                        count1++
                    }
                    else if(!checkboxjustclicked.isChecked && count1 == 1){
                        cost -= 5
                        calories -= 180
                        count1--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }

                }
                R.id.Salmon ->{
                    checkboxjustclicked = salmon
                    if(checkboxjustclicked.isChecked && count1 < 1){
                        cost += 7.5
                        calories += 95
                        count1++
                    }
                    else if(!checkboxjustclicked.isChecked && count1 == 1){
                        cost -= 5
                        calories -= 95
                        count1--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Turkey ->{
                    checkboxjustclicked = turkey
                    if(checkboxjustclicked.isChecked && count1 < 1){
                        cost += 5
                        calories += 190
                        count1++
                    }
                    else if(!checkboxjustclicked.isChecked && count1 == 1){
                        cost -= 5
                        calories -= 190
                        count1--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Veggie ->{
                    checkboxjustclicked = veggie
                    if(checkboxjustclicked.isChecked && count1 < 1){
                        cost += 4.5
                        calories += 80
                        count1++
                    }
                    else if(!checkboxjustclicked.isChecked && count1 == 1){
                        cost -= 5
                        calories -= 80
                        count1--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 1 item", Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }

        costT.setText(cost.toString())
        calory.setText(calories.toString())

    }



    fun onToppingsCheckBox (view: View){
        val mushroom: CheckBox = findViewById(R.id.Mushroom)
        val lettuce: CheckBox = findViewById(R.id.Lettuce)
        val tomato: CheckBox = findViewById(R.id.Tomato)
        val mayo: CheckBox = findViewById(R.id.Mayo)
        val pickles: CheckBox = findViewById(R.id.Pickles)
        val mustard: CheckBox = findViewById(R.id.Mustard)
        var checkboxjustclicked: CheckBox = CheckBox(this)
        if (view is CheckBox)
        {
            when(view.id){
                R.id.Mushroom ->{
                    checkboxjustclicked = mushroom
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 1
                        calories += 60
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 1
                        calories -= 60
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }

                }
                R.id.Lettuce -> {
                    checkboxjustclicked = lettuce
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 0.3
                        calories += 20
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 0.3
                        calories -= 20
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Tomato -> {
                    checkboxjustclicked = tomato
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 0.3
                        calories += 20
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 0.3
                        calories -= 20
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Pickles -> {
                    checkboxjustclicked = pickles
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 0.5
                        calories += 30
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 0.5
                        calories -= 30
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }

                }
                R.id.Mustard -> {
                    checkboxjustclicked = mustard
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 0
                        calories += 60
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 0
                        calories -= 60
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.Mayo -> {
                    checkboxjustclicked = mayo
                    if(checkboxjustclicked.isChecked && toppingCount < 3){
                        cost += 0
                        calories += 100
                        toppingCount++
                    }
                    else if(!checkboxjustclicked.isChecked){
                        cost -= 0
                        calories -= 100
                        toppingCount--
                    }
                    else{
                        checkboxjustclicked.isChecked = false
                        Toast.makeText(application, "Only select 3 items", Toast.LENGTH_SHORT).show()
                    }
                }
            }

        }


        costT.setText(cost.toString())
        calory.setText(calories.toString())
    }


}



