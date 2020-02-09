package com.smartherd.hazi_clean

import android.os.Bundle
import android.util.Log
import okhttp3.*
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL




class RequestDetailsOfVenue {

    fun run(VENUE_ID : String) {
        val details_url: String = "https://api.foursquare.com/v2/venues/$VENUE_ID"
        val forecastJson = URL(details_url).readText()


    }


}