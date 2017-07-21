package dk.figge.taekwondo.tournament.controllers

import dk.figge.taekwondo.tournament.repository.ClubRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ClubController(val repository: ClubRepository) {

    @GetMapping("/clubs")
    fun findAll() = repository.findAll()
}