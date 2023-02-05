package com.example.recyclerview_parliament

import MemberOfParliament
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_parliament.databinding.RecyclerviewItemBinding

class MainAdapter(val members: List<MemberOfParliament>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(val itemBinding: RecyclerviewItemBinding):RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(members: MemberOfParliament){
            itemBinding.name.text = members.first + " " + members.last
            itemBinding.party.text = members.party
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return members.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = members[position]
        holder.bindItem(item)
    }

}