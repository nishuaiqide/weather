package com.example.a32002007njtweather.logic.model

import com.google.gson.annotations.SerializedName

class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

class Location(val lng: String, val lat: String)