public class Main {
    public static void main(String[] args) {
        // искомая фигура представляет собой квадратную матрицу
        int x = 16; // порядок квадратной матрицы

        // нам нужны только нечетные числа
        if(x % 2 == 0)
        {
            System.out.println("The cross will be sad with 'X' = " + x + " :(");
        }
        else {
                int n = x; // число строк
                int m = x; // число столбцов

                // наш массив
                String[][] figure = new String[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        // условия, где должен стоять Х
                        // j==i => координаты [0;0], [1;1] ... [n;m]
                        // j == x - 1 - i => координаты(для х=7) [0;6], [1;5], [2;4] ...
                        if(j == i || j == x - 1 - i)
                        {
                            // записываем в "ячейку" матрицы Х
                            figure[i][j] = "X";
                        }
                        else
                        {
                            // в противном случае записываем туда пробел
                            figure[i][j] = " ";
                        }
                        // печатаем массив построчно, перебирая все элементы
                        System.out.print(figure[i][j]); // если использовать тут println, то получается ерунда
                    }
                    // без этого печатает все в одну строку
                    System.out.println();
                }
        }
    }
}
