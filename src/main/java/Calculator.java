public class Calculator {

    private Integer firstNumber;
    private Integer secondNumber;
    private String operation;
    public Calculator(){
        this.firstNumber = null;
        this.secondNumber = null;
        this.operation = "+-*/^%";
    }

    private void parseString(String mathFrom) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < mathFrom.length(); i++) {
            if(!Character.isSpaceChar(mathFrom.charAt(i))){
                res.append(mathFrom.charAt(i));
            }
        }
        String[] form = res.toString().split("");
        firstNumber = Integer.parseInt(form[0]);
        secondNumber = Integer.parseInt(form[2]);
        operation = form[1];
    }

    public void result(String mathFrom) {
        parseString(mathFrom);
        if (operation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } else if (operation.equals("-")) {
            System.out.println(firstNumber - secondNumber);
        } else if (operation.equals("*")) {
            System.out.println(firstNumber * secondNumber);
        } else if (operation.equals("/")) {
            try {
                System.out.println(firstNumber / secondNumber);
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль!");
            }
        } else if (operation.equals("^")) {
            System.out.println((int) Math.pow(firstNumber, secondNumber));
        } else if (operation.equals("%")) {
            System.out.println(firstNumber % secondNumber);
        } else {
            System.out.println("Используйте только операторы: +, -, *, /, ^, %");
        }
    }
}
