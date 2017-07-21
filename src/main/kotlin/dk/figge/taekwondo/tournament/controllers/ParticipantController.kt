package dk.figge.taekwondo.tournament.controllers

import dk.figge.taekwondo.tournament.models.Participant
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class ParticipantController {

    @GetMapping("/participants")
    fun participants() : List<Participant> {
        return listOf<Participant>(Participant(UUID.randomUUID(), "test"))
    }

}