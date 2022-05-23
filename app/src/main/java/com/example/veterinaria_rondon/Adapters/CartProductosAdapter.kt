package com.example.veterinaria_rondon.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.veterinaria_rondon.R

class CartProductosAdapter: RecyclerView.Adapter<CartProductosAdapter.ViewHolder>() {

    val titles = arrayOf("Ricocan",)
    val details = arrayOf("Comida para perros")
    val images = arrayOf(R.drawable.ricocan)
    val precios = arrayOf("S/. 25.00")

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemPrecio: TextView


        init{
            itemImage=itemView.findViewById(R.id.item_image)
            itemTitle=itemView.findViewById(R.id.item_title)
            itemDetail=itemView.findViewById(R.id.item_detail)
            itemPrecio=itemView.findViewById(R.id.item_precio)

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemTitle.text=titles[position]
        holder.itemDetail.text=details[position]
        holder.itemImage.setImageResource(images[position]);
        holder.itemPrecio.text=precios[position]



    }

    override fun getItemCount(): Int {
        return titles.size
    }
}