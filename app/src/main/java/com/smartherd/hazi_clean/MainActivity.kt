package com.smartherd.hazi_clean

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val PUSH_SECRET : String = "EMJZI33UEI51AHMKEDJF53SSS5O3JTA2AEUAMHPRPLLRLJF4"
        val APP_URL : String = "https://www.venuelisterwith4squarehomework.org"
        val PUSH_URL : String = "https://github.com/BitRaptors/interviewHomework"

        val Request_URL : String = "https://api.foursquare.com/v2/venues/search"

        // ID
        val CLIENT_ID: String = "KOQKPKQHE5QIXUKNFYLVYASPMIDRYZ2MS5FGX2MKRTLTP5XC"

        // Secret
        val CLIENT_SECRET: String = "SRWGCDH24P0G12ZUHJ3GJIPSALOSFZGZIM4BUTER5IAC1FPR"

        // Authentication
        val AUTH_url : String = "https://api.foursquare.com/v2/venues/search?ll=40.7,-74&client_id=$CLIENT_ID&client_secret=$CLIENT_SECRET&v=YYYYMMDD"
        RequestAuth().run(AUTH_url)



        // Get Details of a Venue
        var VENUE_ID : String


        val searchInput = findViewById<EditText>(R.id.searchInput)
        val searchVlu = searchInput.text.toString()
        val searchVew = findViewById<TextView>(R.id.textView).apply {
            text = searchVlu
        }








        //var searchButton = findViewById<Button>(R.id.searchButton)

        /*
        searchInput = EditText open fun findViewById()
        searchButton = Button open fun findViewById()
        searchButton.setOnClickListener(new View.OnClickListener)
        fun onClick(view: View) {
            VENUE_ID = searchInput.getText().toString()


         */


        }









}

