package com.danimotors.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.danimotors.app.model.Product
import com.danimotors.app.ui.ProductsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recyclerProducts)

        val products = mutableListOf(
            Product("Aceite", 25000.0, 10),
            Product("Cadena", 45000.0, 5),
            Product("Bujía", 8000.0, 20)
        )

        adapter = ProductsAdapter(products,
            onEdit = {
                // editar producto
            },
            onSell = {
                // vender producto
            }
        )

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }
}
