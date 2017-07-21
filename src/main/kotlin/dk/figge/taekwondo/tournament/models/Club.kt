package dk.figge.taekwondo.tournament.models

import org.hibernate.annotations.GenericGenerator
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "clubs")
data class Club(
        @Id @GeneratedValue(generator = "UUID") @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator") @Column(name = "id", updatable = false, nullable = false)
        val id: UUID,
        val name: String
)