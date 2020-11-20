package com.saunfa;

public class MySort {

    // 冒泡排序
    public int[] maopao(int[] a) {

        int tmp = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    tmp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tmp;
                } else {

                }
            }
        }
        return a;
    }

    // 选择排序
    public int[] chooice(int[] a) {
        int tmp = 0;
        int swap = 0;
        for (int i = 0; i < a.length; i++) {
            tmp = a[i];
            for (int j = i; j < a.length; j++) {
                if (tmp > a[j]) {

                } else {
                    swap = tmp;
                    tmp = a[j];
                    a[j] = swap;
                }
            }
            a[i] = tmp;
        }
        return a;
    }

    // 插入排序
    public int[] insert(int[] a) {
        // 此时假设a[0]是最大的
        for (int i = 0; i < a.length - 1; i++) {
            // 此时a【j】指向代插入到前面有序集合的那个数
            int j = i + 1;
            // 如果此时a【j】比前面有序的最后一个大的话，那么就不需要改变
            if (a[j] >= a[j - 1]) {

            } else {
                int cur = a[j];
                while (j > 0 & cur <= a[j - 1]) {
                    // 如果此时a[j]比前面有序的集合要小，那么就需要找到这个元素的位置
                    // 在找的过程中，应该让比这个元素大的元素都往后移动一位，直到我们找到那个位置
                    a[j] = a[j - 1];
                    j--;
                }
                a[j] = cur;
            }
        }
        return a;
    }


    // 希尔排序
    public int[] shell(int[] a) {
        // 首先根据数组的长度找到增量h
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        // 进行排序
        while (h >= 1) {
            // 从前往后，默认前h个元素是前h个组中的有序元素
            int cur = 0;
            for (int i = h; i < a.length; i++) {

                if (a[i] > a[i - h]) {
                    // 如果待插入元素比前面的最后一个元素还大，就不进行操作
                } else {
                    // 记录下代插入的元素
                    cur = a[i];
                    // 找到待插入元素的位置
                    int j = i;   //辅助位置
                    while (j - h > 0) {
                        if (a[j - h] > a[j]) {
                            a[j] = a[j - h];
                        } else {
                            break;
                        }
                        j -= h;
                    }
                    a[j] = cur;
                }
            }

            h = h / 2;
        }
        return a;
    }


    // 希尔排序测试
    public int[] shell1(int[] a) {
        // 首先通过数组的长度确定增量h
        int h = 1;
        while (h < a.length / 2) {
            h = h * 2 + 1;
        }
        while (h >= 1) {
            // 将元素分成了h组，第h个元素就是我们要插入的地方
            for (int i = h; i < a.length; i++) {
                if (a[i] > a[i - h]) {
                    // 如果待插入元素比前面有序的那个数组大，就不需要进行操作了
                } else {
                    // 否则的话就需要对前面的数组和待插入的元素进行比较，找到待插入元素的插入位置
                    int cur = a[i]; //记录待插入的元素
                    int j = i;      // 辅助变量
                    while (j - h > 0) {   // 避免数组越界
                        if (cur < a[j - h]) { // 如果待插入元素比前面有序数组中的元素小，就让数组后移一位
                            a[j] = a[j - h];
                        } else {
                            // 如果不大于了就说明找到了待插入元素的位置
                            break;
                        }
                        j -= h;
                    }
                    a[j] = cur;
                }
            }
            h = h / 2;
        }
        return a;
    }

    // 希尔排序
    public int[] shell2(int[] a) {
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                if (a[i] > a[i - h]) {

                } else {
                    int cur = a[i];
                    int j = i;
                    while (j - h > 0) {
                        if (a[j - h] > cur) {
                            a[j] = a[j - h];
                        } else {
                            break;
                        }
                        j -= h;
                    }
                    a[j] = cur;
                }
            }
            h = h / 2;
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = {1, 6, 12, 65, 86, 2, 8, 8, 34, 3, 54, 57, 78, 89, 3};
        int[] m = new MySort().shell2(a);
        for (int i : m) {
            System.out.println(i);
        }

    }

}
