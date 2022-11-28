package NextGreaterElement.NavieNextGreaterElement;

public class NextGreaterElement {
    public static void NextGreaterNumber(int number[]) {
        int next;
        for (int i = 0; i < number.length; i++) {
            next = -1;
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] < number[j]) {
                    next = number[j];
                    break;
                }
            }
            System.out.println(number[i] + " -- " + next);
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 5, -3, -4, 6, 7, 2 };
        NextGreaterNumber(number);
    }
}
