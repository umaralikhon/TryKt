package workout.step4

interface Note {

    fun createNote(title: String?, description: String?): String;
    fun getNoteByTitle(title: String?): String;
}