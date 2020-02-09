package com.smartherd.hazi_clean

public class locations {
    private var address : String
    private var crossStreet : String
    private var city : String
    private var state : String
    private var postalCode : String
    private var country : String

    private var lat : Double
    private var lng : Double
    private var distance : Double

    //var isFuzzed : Boolean

    constructor(address : String, crossStreet : String, city : String, state : String,
                postalCode : String, country : String, lat : Double, lng : Double,
                distance : Double, isFuzzed : Boolean) {

        //if (isFuzzed == false) {
            this.address = address
            this.crossStreet = crossStreet
            this.city = city
            this.state = state
            this.postalCode = postalCode
            this.country = country
            this.lat = lat
            this.lng = lng
            this.distance = distance
        // }


    }



}