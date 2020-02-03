package com.mbazhlek.ufosightings.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.mbazhlek.ufosightings.entity.UFOSighting
import com.mbazhlek.ufosightings.repository.UFOSightingRepository
import org.springframework.stereotype.Component

@Component
class UFOSightingsByCountryQueryResolver(private val ufoSightingRepository: UFOSightingRepository) : GraphQLQueryResolver {

    fun ufoSightingsByCountry(country: String): List<UFOSighting> {
        return findAllByCountry(country)
    }

    private fun findAllByCountry(country: String): List<UFOSighting> {
        return ufoSightingRepository
                .findAll()
                .filter { it.country == country }
    }
}