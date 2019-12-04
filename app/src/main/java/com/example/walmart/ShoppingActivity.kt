package com.example.walmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.TextView
import com.example.walmart.adapter.ShoppingCategoryAdapter
import kotlinx.android.synthetic.main.activity_shopping.*

class ShoppingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping)

        //get username from Main Activity
        val intent = getIntent();
        val username = intent.getStringExtra("username")

        //show Username as "Welcome <username>" at the top of ShoppingActivity
        var welcomeMsg = findViewById<TextView>(R.id.showUsernameInWelcome)
        welcomeMsg.text = "Welcome " + username

        //Find View By Id for GridView
        val gridView = findViewById<GridView>(R.id.shoppingGridView)

        //ShoppingCategory Adapter
        val adapter = ShoppingCategoryAdapter()
        shoppingGridView.adapter = adapter
        

    }
}
