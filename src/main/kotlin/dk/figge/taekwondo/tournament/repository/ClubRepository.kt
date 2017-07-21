package dk.figge.taekwondo.tournament.repository

import dk.figge.taekwondo.tournament.models.Club
import org.springframework.data.repository.CrudRepository
import java.util.*

interface ClubRepository : CrudRepository<Club, UUID>