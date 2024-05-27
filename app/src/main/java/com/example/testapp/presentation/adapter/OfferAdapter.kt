package com.example.testapp.presentation.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.testapp.R
import com.example.testapp.domain.model.Offer
import com.google.android.material.textview.MaterialTextView

class OfferAdapter : RecyclerView.Adapter<OfferAdapter.OfferViewHolder>() {

    private val offer_list = mutableListOf<Offer>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfferViewHolder {
        return OfferViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.offer_item, parent, false))
    }



    override fun onBindViewHolder(holder: OfferViewHolder, position: Int) {
        val offer = offer_list[position]
        holder.name.text = holder.itemView.resources.getString(R.string.name) + " " + offer.name
        holder.brand.text = holder.itemView.resources.getString(R.string.brand) + " " + offer.brand
        holder.category.text = holder.itemView.resources.getString(R.string.category) + " " + offer.category
        holder.merchant.text = holder.itemView.resources.getString(R.string.merchant) + " " + offer.merchant
        Glide.with(holder.itemView.context).load(offer.image).into(holder.image)
    }

    override fun getItemCount(): Int {
      return offer_list.size
    }


    fun setOfferList(list: List<Offer>){
        offer_list.addAll(list)
    }


    inner class OfferViewHolder(itemView: View) : ViewHolder(itemView){

        val name = itemView.findViewById<MaterialTextView>(R.id.item_name_mtv)
        val brand = itemView.findViewById<MaterialTextView>(R.id.item_brand_mtv)
        val category = itemView.findViewById<MaterialTextView>(R.id.item_category_mtv)
        val merchant = itemView.findViewById<MaterialTextView>(R.id.item_merchant_mtv)
        val image = itemView.findViewById<ImageView>(R.id.item_image_imv)

    }

}