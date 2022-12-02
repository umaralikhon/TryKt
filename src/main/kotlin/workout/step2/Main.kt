package workout.step2

import java.util.Scanner

fun main() {

    var handler: ExceptionHandler = ExceptionHandler();

    var a = handler.countNums(6, 0);
    println("Result ${a}");

    var filePath: String = "src/main/resources/files/SomeFile.txt";
    var fileData: String = handler.readFiles(filePath);

    println(fileData);



}