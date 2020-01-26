package com.mbazhlek.ufosightings.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.mbazhlek.ufosightings.entity.UFOSighting
import com.mbazhlek.ufosightings.repository.UFOSightingRepository
import org.springframework.stereotype.Component


@Component
class UFOSightingsQueryResolver(val ufoSightingRepository: UFOSightingRepository) : GraphQLQueryResolver {

    fun ufoSightings(): List<UFOSighting> {
        return ufoSightingRepository.findAll()
    }

    fun ufoSightingById(id: String): UFOSighting? {
        return ufoSightingRepository.findById(id)
                .orElse(null)
    }

    fun ufoSightingsByCountry(country: String): List<UFOSighting> {
        return findAllByCountry(country)
    }

    // TO DO: implement query
    fun ufoSightingsByDayOfTheWeek(day: String): List<UFOSighting> {
        return emptyList()
    }

    private fun findAllByCountry(country: String): List<UFOSighting> {
        return ufoSightingRepository
                .findAll()
                .filter { it.country == country }
    }
}