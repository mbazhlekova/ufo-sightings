package com.mbazhlek.ufosightings.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field

@Document(collection = "ufosightings")
data class UFOSighting(
        var datetime: String,
        var state: String,
        var city: String,
        var country: String,
        var shape: String,
        @Field("duration (seconds)")
        var durationSeconds: String,
        @Field("duration (hours/min)")
        var durationHoursMin: String,
        var comments: String,
        @Field("date posted")
        var datePosted: String,
        var latitude: String,
        var longitude: String
) {
    @Id
    var id: String = ""
}