package com.example.veterinaria_rondon.Cart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.veterinaria_rondon.Adapters.CartProductosAdapter
import com.example.veterinaria_rondon.Adapters.ListaProductoAdapter
import com.example.veterinaria_rondon.R

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_cart)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CartProductosAdapter()


        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=adapter

    }
}