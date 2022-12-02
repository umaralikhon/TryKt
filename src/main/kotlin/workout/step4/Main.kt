package workout.step4

fun main() {

    println("1 - Create");
    println("2 - Read");
    println("Choose operation: ")
    var operation: String? = readLine();

    if(operation == "1"){
        noteCreator();
    }else if(operation == "2"){
        noteReader();
    }

}

fun noteCreator(){
    var note: Note = NoteCreator();

    println("Enter title: ")
    var title: String? = readLine();

    println("Enter description: ")
    var description: String? = readLine();

    println(note.createNote(title, description));
}

fun noteReader(){
    var note: Note = NoteCreator();
    println("Enter title: ")
    var title: String? = readLine();
    println(note.getNoteByTitle(title));
}