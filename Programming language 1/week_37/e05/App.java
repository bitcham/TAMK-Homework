public class App {
    public static void main(final String[] args){
        int numbers[] = {-1, 0, 1, 9, 10};
        for (int i = 0; i < 5; ++i)
        {
            System.out.println("number " + numbers[i] + " == 0 : " + (numbers[i] == 0));
            System.out.println("number " + numbers[i] + " > 0 : " + (numbers[i] > 0));
            System.out.println("number " + numbers[i] + " < 10 : " + (numbers[i] < 10));
            System.out.println("number " + numbers[i] + " > 0 && number < 10 : " + (numbers[i] > 0 && numbers[i] < 10));
            System.out.println("!(number " + numbers[i] + " > 0 && number " + numbers[i] + " < 10) : " + (!(numbers[i] > 0 && numbers[i] < 10)));
            System.out.println("number " + numbers[i] + " > 0 || number " + numbers[i] + " < 10 : " + (numbers[i] > 0 || numbers[i] < 10));
            System.out.print("\n");
        }
    }
}


/* Boolean logic answers
 * | -1 |  false | true   | false  | true  | true  |
 * | 0  |  flase | true   | false  | true  | true  |
 * | 1  |  true  | true   | true   | false | true  |
 * | 9  |  true  | true   | true   | false | true  |
 * | 10 |  true  | false  | false  | true  | true  |
 */