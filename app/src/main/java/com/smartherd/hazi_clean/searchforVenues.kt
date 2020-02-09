package com.smartherd.hazi_clean

class searchforVenues  {

    // var id: String
    // var name : String
    val location : locations
    // var categories

    var II : Array<Double>
    var near : String
    var intent : String
    var radius : Int
    var sw : Array<Double>
    var ne : Array<Double>
    var query : String
    var limit : Int
    var categoryId : String
    var llAcc : Double
    var alt : Int
    var altAcc : Double
    var url : String
    var providerId : String
    var linkedId : Int




    constructor (II : Array<Double>, near : String, intent : String, radius : Int,
                 sw : Array<Double>, ne : Array<Double>, query : String, limit : Int,
                 categoryId : String, llAcc : Double, alt : Int, altAcc : Double, url : String,
                 providerId : String, linkedId : Int,
                 id: String, name : String, location : locations
              /* ,categories : Array<> */
              ) {


        // Parameters
        this.II = II
        this.near = near
        this.intent = intent
        this.radius = radius
        this.sw = sw
        this.ne = ne
        this.query = query
        this.limit = limit
        this.categoryId = categoryId
        this.llAcc = llAcc
        this.alt = alt
        this.altAcc = altAcc
        this.url = url
        this.providerId = providerId
        this.linkedId = linkedId

        // Response Fields
        this.location = location






    }





}