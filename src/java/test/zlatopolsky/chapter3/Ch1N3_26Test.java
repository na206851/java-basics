package zlatopolsky.chapter3;

class Ch1N3_26Test{
    public static void main(String[] args) {
        Ch1N3_26 test=new Ch1N3_26();
        System.out.println(test.expressionA(true, true, true));
        System.out.println(test.expressionA(true, true, false));
        System.out.println(test.expressionA(true, false, false));
        System.out.println(test.expressionA(false, false, false));
        System.out.println(test.expressionA(false, true, true));
        System.out.println(test.expressionA(false, false, true));
        System.out.println(test.expressionA(false, true, false));

        System.out.println(test.expressionB(true, true, true));
        System.out.println(test.expressionB(true, true, false));
        System.out.println(test.expressionB(true, false, false));
        System.out.println(test.expressionB(false, false, false));
        System.out.println(test.expressionB(false, true, true));
        System.out.println(test.expressionB(false, false, true));
        System.out.println(test.expressionB(false, true, false));

        System.out.println(test.expressionC(true, true, true));
        System.out.println(test.expressionC(true, true, false));
        System.out.println(test.expressionC(true, false, false));
        System.out.println(test.expressionC(false, false, false));
        System.out.println(test.expressionC(false, true, true));
        System.out.println(test.expressionC(false, false, true));
        System.out.println(test.expressionC(false, true, false));
    }
}