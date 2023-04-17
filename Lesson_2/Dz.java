
/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова
 * TEST и метод,
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
public static void main(String[] args) {
    FourthTask fourthTask = new FourthTask();
    fourthTask.writer();
    class FourthTask {
        public StringBuilder generateString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                stringBuilder.append("TEST ");
            }
            return stringBuilder;
        }
        public void writer() {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
                fileOutputStream.write(generateString().toString().getBytes());
                fileOutputStream.close();
            } catch (IOException e) {
                System.out.println("Проблема вывода!");
                e.printStackTrace();
            }
        }
    }
}

/*
     * Напишите метод, который принимает на вход строку (String)
     * и определяет является ли строка палиндромом (возвращает boolean значение).
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(isPalindrom(string));
        in.close();
    }

    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }
    