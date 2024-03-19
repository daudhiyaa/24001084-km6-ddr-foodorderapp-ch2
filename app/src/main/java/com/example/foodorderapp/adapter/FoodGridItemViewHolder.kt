package com.example.foodorderapp.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderapp.base.ViewHolderBinder
import com.example.foodorderapp.data.model.Food
import com.example.foodorderapp.databinding.ItemFoodGridBinding
import com.example.foodorderapp.utils.toIndonesianFormat

class FoodGridItemViewHolder(
    private val binding: ItemFoodGridBinding,
    private val listener: OnItemClickedListener<Food>
) : RecyclerView.ViewHolder(binding.root),
    ViewHolderBinder<Food> {
    override fun bind(item: Food) {
        item.let {
            binding.ivFoodImage.setImageResource(it.image)
            binding.tvFoodName.text = it.name
            binding.tvFoodPrice.text = it.price.toIndonesianFormat()

            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }
        }
    }
}