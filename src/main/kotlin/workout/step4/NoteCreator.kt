package workout.step4

import java.io.File
import java.lang.Exception

class NoteCreator : Note {

    val path: String = "src/main/resources/notes/";

    override fun createNote(title: String?, description: String?): String {

        if (title.isNullOrBlank()) {
            return "Title can not be empty...";
        };

        return try {
            File(path + title).writeText(description!!);
            "Note created";
        } catch (ex: Exception) {
            "Error in creating note: ${ex.message}";
        }
    }

    override fun getNoteByTitle(title: String?): String {

        return try {
            File(path + title).readText();
        } catch (ex: Exception) {
            ex.message.toString();
        }
    }
}