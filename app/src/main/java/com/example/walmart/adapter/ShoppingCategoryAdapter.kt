package com.example.walmart.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.walmart.R
import com.example.walmart.domain.Category
import kotlin.collections.ArrayList

class ShoppingCategoryAdapter: BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

    //Layout Inflater
        val inflater = parent?.context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = inflater.inflate(R.layout.category_layout, null)

        //Get ImageView and TextView from category_layout.xml
        val imageView = view.findViewById<ImageView>(R.id.imageView)
        val textView = view.findViewById<TextView>(R.id.textView)

        //Display Categories
        val category: Category = getCategories()[position]
        imageView.setImageResource(category.image)
        textView.text = category.name

        //ImageView Click Action
        imageView.setOnClickListener{
            Toast.makeText(parent?.context, "You have chosen ${category.name} category of shopping.",Toast.LENGTH_SHORT).show()
        }

        return view

    }

    override fun getItem(position: Int): Any {
        return getCategories()[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return getCategories().size
    }

    //Make ArrayList of Categories
    private fun getCategories(): ArrayList<Category>{
        return arrayListOf(
            Category("Electronics", R.drawable.product1),
            Category("Clothing", R.drawable.product2),
            Category("Beauty", R.drawable.product3),
            Category("Food", R.drawable.product4)
        )
    }
}