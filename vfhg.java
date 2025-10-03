public class LetterSplit {
    public static void main(String[] args) {
        char[] arr = {'A', 'a', 'B', 'b', 'C', 'c'};

        // Подсчет количества заглавных и строчных
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        for (char ch : arr) {
            if (Character.isUpperCase(ch)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseCount++;
            }
        }

        char[] uppercaseLetters = new char[uppercaseCount];
        char[] lowercaseLetters = new char[lowercaseCount];

        int uIndex = 0, lIndex = 0;
        for (char ch : arr) {
            if (Character.isUpperCase(ch)) {
                uppercaseLetters[uIndex++] = ch;
            } else if (Character.isLowerCase(ch)) {
                lowercaseLetters[lIndex++] = ch;
            }
        }

        System.out.println("Заглавные: " + new String(uppercaseLetters));
        System.out.println("Строчные: " + new String(lowercaseLetters));
    }
}