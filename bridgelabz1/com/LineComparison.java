package bridgelabz1.com;

public class LineComparison {
    public static double firstLineLength;
    public static double secondLineLength;
    // calculating length method
    private static  double calculatingLengthOfLine(int x1,int x2,int y1,int y2){
        double lineLength;
        lineLength = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2))) ;
        return lineLength;

    }
    // Method for checking equality of two lines.
    private static void checkingEqualityOfLine(){
        if(firstLineLength == secondLineLength){
            System.out.println("Both Lines are equal");
        }else{
            System.out.println("Lines are not equal");
        }
    }
    //
    public static void main(String[] args){
        System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
        firstLineLength = calculatingLengthOfLine(5,8,9,8);
        System.out.println(firstLineLength);
        secondLineLength = calculatingLengthOfLine(5,6,9,8);
        System.out.println(secondLineLength);
        checkingEqualityOfLine();
    }
}
