class InvalidInputException extends Exception {
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxInputException extends Exception {
    @Override
    public String toString() {
        return "Input can be greater than 100000";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CannotDivideByZeroException extends Exception {
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class MaxMultiplyInputException extends Exception {
    @Override
    public String toString() {
        return "Input can be greater than 7000 while multiplying";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

class CustomCalculator {
    double add(double a, double b) throws InvalidInputException, MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if (a==8 || b==9) {
            throw new InvalidInputException();
        }
        return a + b;
    }

    double subtract(double a, double b) throws MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        return a - b;
    }

    double multiply(double a, double b) throws MaxInputException, MaxMultiplyInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        else if(a>7000 || b>7000) {
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }

    double divide(double a, double b) throws CannotDivideByZeroException, MaxInputException {
        if(a>100000 || b>100000) {
            throw new MaxInputException();
        }
        if(b==0) {
            throw new CannotDivideByZeroException();
        }
        return a / b;
    }
}

public class Custom_Calculator {
    public static void main(String[] args) throws InvalidInputException,
            CannotDivideByZeroException, MaxInputException, MaxMultiplyInputException {
        CustomCalculator c = new CustomCalculator();
//        c.add(8, 9);
//        c.divide(6, 0);
//        c.divide(600000000, 40);
        c.multiply(5, 9888);

         /*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
         */
    }
}