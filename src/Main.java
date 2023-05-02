public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задача 1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr){
            sum+=i;
        }
        String message = String.format("Сумма трат за месяц составила %s рублей",sum);
        System.out.println(message);
    }
    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i : arr)
            if (i < max) {
                max=i;
            }
        String message = String.format("Минимальная сумма трат за день составила %s рублей. Максимальная сумма трат за день составила %s рублей",min,max);
        System.out.println(message);
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int sumForAvg = 0;
        for (int i:arr){
            sumForAvg+=i;
        }
        int days = arr.length;
        double avg = (double) sumForAvg/days;
        String message = String.format("Средняя сумма трат за месяц составила %s рублей",avg);
        System.out.println(message);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1 ; i >= 0; i --) {
            System.out.print(reverseFullName[i]);
        }
    }
}