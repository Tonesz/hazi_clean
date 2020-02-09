package com.smartherd.hazi_clean

import android.os.Bundle
import android.util.Log
import okhttp3.*
import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL




class RequestAuth() {

    fun run(url : String) {
        val forecastJson = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJson)

    }
}







//AsyncTaskHandleJson().execute(URL)

//FoursquareOAuth.getConnectIntent(CLIENT_ID)

/*
val request = Request.Builder().url(URL).build()

val client = OkHttpClient()
client.newCall(request).enqueue(object: Callback {
    override fun onResponse(call: Call, response: Response) {
        val body = response?.body?.string()
        println(body)

    }

    override fun onFailure(call: Call, e: IOException) {
        println("failed to execute request")
         }
} )

 */










/*
import java.net.URL
import android.util.Log

class Request(private val url: String) {

    fun run() {
        val forecastJson = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJson)

    }
}
*/