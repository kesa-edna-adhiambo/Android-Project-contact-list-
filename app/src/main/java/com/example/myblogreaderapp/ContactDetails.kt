package com.example.myblogreaderapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactDetails(var contactDetails: List<MyBlog>): RecyclerView.Adapter<AuthorDetailsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorDetailsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.contacts_details_list,parent,false)
           return AuthorDetailsViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: AuthorDetailsViewHolder, position: Int) {
        val details = contactDetails[position]
        holder.rvAuthor.text = details.authorName
        holder.rvPublishedDate.text = details.PublishedDate
        holder.rvTitle.text = details.title

    }

    override fun getItemCount(): Int {
        return contactDetails.size

    }
}

class AuthorDetailsViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
    var rvAuthor = itemView.findViewById<TextView>(R.id.rvAuthor)
    var rvPublishedDate = itemView.findViewById<TextView>(R.id.rvPublishedDate)
    var rvTitle = itemView.findViewById<TextView>(R.id.rvTitle)


}
