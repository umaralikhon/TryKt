package workout.step2

import workout.step3.Operations
import java.lang.Exception
import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.Paths

class ExceptionHandler {

    var x: Int = 0;
    var y: Int = 0;

    fun countNums(num1: Int, num2: Int): Int {

        try {
            return num1 / num2;
        } catch (ex: ArithmeticException) {
            println(
                ex.message
            );
        }
        return 0;
    }

    fun readFiles(fileName: String): String {

        try {
            return Files.readAllLines(Paths.get(fileName)).toString();
        } catch (ex: NoSuchFileException) {
            return "No such file: ${ex.message.toString()}";
        }

        return "File not found";
    }


}