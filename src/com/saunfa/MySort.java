package com.saunfa;

import java.util.Arrays;

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
        int h = 1;
        while (h < a.length / 2) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < a.length; i++) {
                // 如果待插入的元素比前面有序元素的最后一个大。就不需要做出改变
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
        int a[] = {4, 5, 3, 5, 6, 7, 2, 7, 8, 2, 6};
        int[] m = new MySort().shell(a);
        System.out.println(Arrays.toString(a));
    }
}
