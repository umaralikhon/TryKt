package workout.step3

import java.lang.Exception

class Calculator constructor() {

    fun calculate(fstNum: Int, sndNum: Int, operation: Operations): Int {

        if (operation.name.equals("DIVIDE") && sndNum == 0) {
            throw ArithmeticException();
        }

        when (operation) {
            Operations.MULTIPLE -> return fstNum * sndNum;
            Operations.DIVIDE -> return fstNum / sndNum;
            Operations.MINUS -> return fstNum - sndNum;
            Operations.PLUS -> return fstNum + sndNum;
            else -> throw Exception("No such operation");
        }
    }
}