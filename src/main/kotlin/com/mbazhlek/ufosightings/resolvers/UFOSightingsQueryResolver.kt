package com.mbazhlek.ufosightings.resolvers

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.mbazhlek.ufosightings.entity.UFOSighting
import com.mbazhlek.ufosightings.repository.UFOSightingRepository
import org.springframework.stereotype.Component
import java.time.LocalDateTime


@Component
class UFOSightingsQueryResolver(private val ufoSightingRepository: UFOSightingRepository) : GraphQLQueryResolver {

    fun ufoSightings(): List<UFOSighting> {
        return ufoSightingRepository
                .findAll()
    }
}