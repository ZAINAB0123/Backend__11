package task_5.one;

// Дополнительное задание Работа с массивами 1:
//у нас есть массив из 10 случайных целых чисел, которые разбросаны в нем в случайном порядке.
//например int [] arr = new int[] {5, -3, 2, 1, 7, 11, 12, -4, 1, 10};
//Необходимо вывести в консоль:
//
//1. количество четных чисел в массиве
//2. количество нечетных чисел в массиве
//3. количество простых чисел в массиве
//4. сумму всех чисел в массиве
//5. разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве
//6. количество 0 (сколько раз встречается число "0") в массиве
//то есть для примера выше вывод в консоль будет:
//1. 4
//2. 6
//3. 4
//4. 42
//5. 12
//6. 0
//Числа могут быть каждый раз разные.
//Каждый из 6 пунктов должен быть реализован отдельно от остальных, например в отдельном классе (все 6 в одном классе) и отдельных методах!
public class Mas {
    public static void main(String[] args) {
        EvenNumbers();
        OddNumbers();
        PrimeNumbers();
        SumArrays();
        DifferenceOfArrays();
        NumberOfZeros();
    }

    private static void EvenNumbers() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("1. Количество четных чисел = " + count);
    }

    private static void OddNumbers() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 != 0) {
                count++;
            }
        }
        System.out.println("2. Количество нечетных чисел = " + count);
    }

    private static void PrimeNumbers() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8};

        int count = 0;
        for (int i = 2; i < nums.length; i++) {

            if (i > 1 && i % 2 != 0) {
                count++;
            }
        }
        System.out.println("3.Количество простых чисел = " + count);
    }

    private static void SumArrays() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8};
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];

        }
        System.out.println("4. Сумма всех чисел массива = " + sum);
    }

    // разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве
    private static void DifferenceOfArrays() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8, 0, 0};
        int sum1 = 0;
        int sum2 = 0;
        int result = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                sum1 = sum1 + nums[i];
            } else {
                sum2 = sum2 + nums[i];
            }
        }
        System.out.println("Сумма четных индексов массива = " + sum1);

        System.out.println("Сумма нечетных индексов массива = " + sum2);

        result = sum1 - sum2;

        System.out.println("5. " + result);
    }

    private static void NumberOfZeros() {
        int[] nums = new int[]{4, 5, 3, 2, 8, 0, -2, -20, 5, 9, 8, 0, 0};
        int x = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                count++;
            }
        }
        System.out.println("6. Количество 0 в массиве =  " + count);

    }
}
