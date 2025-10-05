//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var noteList = mutableListOf<Note>()

    var answer: Int = 1
    while(answer != 0) {
        basicMessage()
        answer = readln().toIntOrNull() ?: 0
        println()

        if(answer == 1) {
            createNote(noteList)
        }
        else if(answer == 2){
            readNote(noteList)
        }
        else if(answer == 3){
            editNote(noteList)
        }
    }
    println("Exiting...")
}

fun basicMessage() {
    println("Welcome to your notes!")
    println("Instructions: ")
    println("1 - Create note")
    println("2 - Read last note")
    println("3 - Edit last note")
    println("0 - Exit")
}

fun createNote(noteList: MutableList<Note>) {
    println("What is the title of the note?: ")
    var title: String = readln()
    println("Please write your note: ")
    var content: String = readln()
    noteList.add(Note(noteList.size, title, content))
    println("Note added!")
    println()
}

fun readNote (noteList: MutableList<Note>) {
    println(noteList[noteList.size - 1].title)
    println(noteList[noteList.size - 1].content)
    println()
}

fun editNote (noteList: MutableList<Note>) {
    println("What is the title of the note?: ")
    noteList[noteList.size - 1].title = readln()
    println("Please write your new note: ")
    noteList[noteList.size - 1].content = readln()
}