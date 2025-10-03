import java.util.Arrays;

public class ArrayStack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ArrayStack(int size) {
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    public void push(int value) {
        if (top < maxSize - 1) {
            stackArray[++top] = value;
        } else {
            System.out.println("Стек полон");
        }
    }

    public int pop() {
        if (top >= 0) {
            return stackArray[top--];
        } else {
            System.out.println("Стек пуст");
            return -1; // Или выбросить исключение
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Удалённый элемент: " + stack.pop());
        System.out.println("Текущий стек: " + Arrays.toString(stack.stackArray));
    }
}
