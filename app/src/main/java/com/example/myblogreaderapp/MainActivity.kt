package com.example.myblogreaderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myblogreaderapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvRecycler.layoutManager = LinearLayoutManager(this)
        displayDetails()
    }

    fun displayDetails(){
        val detail1 = MyBlog("H.R Ole Kulet","20th-April-2010","Blossoms","")
        val detail2 = MyBlog("Henrick Ibsen","1st-January-2015","The Peral","")
        val detail3 = MyBlog("Edna Kesa","20th-April-2000","Blossoms","")
        val detail4 = MyBlog("Faith Munyao","1st-January-2005","The Peral","")
        val detail5 = MyBlog("Kame Bashuna","20th-April-2019","Blossoms","")
        val detail6 = MyBlog("Levin Kesa","1st-January-2011","The Peral","")
        val detail7 = MyBlog("Judy Gati","20th-April-2010","Blossoms","")
        val detail8 = MyBlog("Ian Omondi","1st-January-2015","The Peral","")
        val detail9 = MyBlog("Brenda Atieno","20th-April-2010","Blossoms","")
        val detail10 = MyBlog("Precious Nelly","1st-January-2015","The Peral","")
        val detail11 = MyBlog("Raul Castro","1st-January-2015","The Peral","")
        val detail12 = MyBlog("Shirleen Mercy","1st-January-2015","The Peral","")
        val detail13 = MyBlog("Agnes Ajema","1st-January-2015","The Peral","")
        val detail14 = MyBlog("Collins Mwamba","1st-January-2015","The Peral","")
        val detail15 = MyBlog("Nassir Shell Den","1st-January-2015","The Peral","")

        val  myBlog = listOf(detail11,detail2,detail3,detail4,detail5,detail6,detail7,detail8,detail9,detail10,
        detail1,detail12,detail13,detail14,detail15)

        val contactDetails = ContactDetails(myBlog)
        binding.rvRecycler.adapter = contactDetails

    }

}