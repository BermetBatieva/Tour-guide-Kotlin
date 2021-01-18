package com.example.tourguide

class Location constructor(
        var Name: String,
        var imageResourceId: Int,
        var Description: String,
        var Address: String,
        var Number: String,
        var Coordinate: String
) {
    fun hasNumber(): Boolean {
        return Number != NO_NUMBER_PROVIDED
    }
}
var NO_NUMBER_PROVIDED: String
    get() = "NO_NUMBER_PROVIDED"
    set(value) = TODO()