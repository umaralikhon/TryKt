package workout.step3

fun main() {

    var calculator: Calculator = Calculator();
    var operations: Operations = Operations.MINUS;

    print("Enter first number: ");
    var fstNum: Int = readLine()?.toInt() ?: 0;

    print("Enter second number: ");
    var sndNum: Int = readLine()?.toInt() ?: 0;

    print("Enter type of operation: ");
    var operation: String? = readLine();

    when (operation) {
        "*" -> operations = Operations.MULTIPLE;
        "/" -> operations = Operations.DIVIDE;
        "-" -> operations = Operations.MINUS;
        "+" -> operations = Operations.PLUS;
    }

    var result = calculator.calculate(fstNum, sndNum, operations);

    println("Result: ${result}");


}