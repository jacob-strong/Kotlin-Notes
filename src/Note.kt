import java.time.LocalDateTime

// we out here noting i love making notes
class Note (
    val id: Int,
    var title: String,
    var content: String,
) {

    val timeCreated: LocalDateTime
    var lastEdited: LocalDateTime

    init {
        timeCreated = LocalDateTime.now()
        lastEdited = LocalDateTime.now()
    }

    fun setDate() {  }


}