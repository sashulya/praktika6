import java.util.Random;

public class Sorter {
    public static Student[] students;

    private static void doSort(int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i - (i - j) / 2;
        while (i < j) {
            while (i < cur && (students[i].getId() <= students[cur].getId())) {
                i++;
            }
            while (j > cur && (students[cur].getId() <= students[j].getId())) {
                j--;
            }
            if (i < j) {
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(start, cur);
        doSort(cur+1, end);
    }

    public static void main(String[] args) {
        students = new Student[100];
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            students[i] = new Student(i + " student", random.nextInt(1000), random.nextInt(100));
        }

        doSort(0, students.length-1);
        for (int i = 0; i < students.length; i++) {
            students[i].print();
        }
    }
}
