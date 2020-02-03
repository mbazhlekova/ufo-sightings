package com.mbazhlek.ufosightings.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.mbazhlek.ufosightings.entity.UFOSighting
import com.mbazhlek.ufosightings.repository.UFOSightingRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class UFOSightingByIdQueryResolver(private val ufoSightingRepository: UFOSightingRepository) : GraphQLQueryResolver {

    //TO DO: Better error handling here
    fun ufoSightingById(id: String): UFOSighting? {
        return ufoSightingRepository.findByIdOrNull(id)
    }
}