import java.util.Stack;

public class ReverseByStack {
    public static void main(String[] args) {
        reverseNumber();
        reverseString();
    }

    public static void reverseNumber() {
        int [] array = {1, 3, 5, 7, 9};
        System.out.println("Mang ban dau:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        Stack<Integer> integerStack = new Stack<Integer>();
        for(int i = 0; i < array.length; i++) {
            integerStack.push(array[i]);
        }
        System.out.println("\nStack sau khi them vao:");
        System.out.println(integerStack);
        for(int i = 0; i < array.length; i++) {
            array[i] = integerStack.pop();
        }
        System.out.println("Mang dao nguoc:");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
    public static void reverseString() {
        String stringReverse = "Hello World I Love YOU";
        System.out.println("\nChuoi ban dau: ");
        System.out.println(stringReverse);
        Stack<String> stringStack = new Stack<String>();
        String [] array = stringReverse.split(" ");
        for(int i = 0; i < array.length; i++) {
            stringStack.push(array[i]);
        }
        System.out.println("\nStack sau khi them vao:");
        System.out.println(stringStack);
        stringReverse = "";
        while (!stringStack.isEmpty()) {
            stringReverse += stringStack.pop() + " ";
        }
        System.out.println("Chuoi dao nguoc:");
        System.out.println(stringReverse);
    }
}
