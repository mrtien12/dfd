package com.example.registerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var emailList: ArrayList<ItemModel> = ArrayList()
        repeat(3) {
            emailList.add(
                ItemModel(
                    "A",
                    "Antony",
                    "Contact me please",
                    "I don't know how can...",
                    "12:34 PM"
                )
            )
            emailList.add(
                ItemModel(
                    "C",
                    "Chris Abad",
                    "Help make Campaign...",
                    "Let us know your thoughts! No Images...",
                    "12:34 PM"
                )
            )
            emailList.add(
                ItemModel(
                    "T",
                    "Tuto.com",
                    "8h de formation gratuite et les nouvea...",
                    "Photoshop, SEO, Blender, CSS, WordPre...",
                    "11:04 AM"
                )
            )
            emailList.add(
                ItemModel(
                    "S",
                    "support",
                    "Societe Ovh",
                    "SAS OVH - http://www.ovh.com 2 rue K...",
                    "10:26 AM"
                )
            )
            emailList.add(
                ItemModel(
                    "E",
                    "Edurila.com",
                    "$19 Only (First 10 spots) - Best selling...",
                    "Are you looking to learn web designin...",
                    "12h: 34 PM"
                )
            )
        }
        var emailAdapter: EmailAdapter = EmailAdapter(emailList)
        findViewById<ListView>(R.id.list_view).adapter = emailAdapter
    }
}