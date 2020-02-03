package com.mbazhlek.ufosightings.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.mbazhlek.ufosightings.entity.UFOSighting
import com.mbazhlek.ufosightings.repository.UFOSightingRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.TextStyle
import java.util.*

@Component
class UFOSightingsByDayOfTheWeekQueryResolver(private val ufoSightingRepository: UFOSightingRepository) : GraphQLQueryResolver {

    fun ufoSightingsByDayOfTheWeek(day: String): List<UFOSighting> {
        val dateFormatter = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm", Locale.ENGLISH)

        return ufoSightingRepository
                .findAll()
                .filter {
                    LocalDateTime
                            .parse(it.datetime, dateFormatter)
                            .dayOfWeek
                            .getDisplayName(TextStyle.FULL, Locale.ENGLISH) == day
                }
    }
}