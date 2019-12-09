package com.mbazhlek.ufosightings.repository

import com.mbazhlek.ufosightings.entity.UFOSighting
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UFOSightingRepository : MongoRepository<UFOSighting, String> {
}