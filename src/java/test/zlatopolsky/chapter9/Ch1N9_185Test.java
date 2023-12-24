package zlatopolsky.chapter9;

class Ch1N9_185Test {
    public static void main(String[] args) {
        Ch1N9_185 test = new Ch1N9_185();
        System.out.println(test.validPairs("()()"));
        System.out.println(test.validPairs("(())"));
        System.out.println(test.validPairs("()"));
        System.out.println(test.validPairs("()(())"));
        System.out.println(test.validPairs("()(())()"));
        System.out.println(test.validPairs(")("));
        System.out.println(test.validPairs(")()"));
        System.out.println(test.validPairs("())(()"));
        System.out.println(test.validPairs("())(()))("));
        System.out.println(test.validPairs("))"));
        System.out.println(test.validPairs("(("));
        System.out.println(test.validPairs("(("));
        System.out.println(test.validPairs("))"));
        System.out.println(test.validPairs("((())))"));
        System.out.println(test.validPairs(")"));
        System.out.println(test.validPairs("(()"));
        System.out.println(test.validPairs("())"));
    }
}