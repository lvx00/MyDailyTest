package com.saunfa;

import java.util.Arrays;

public class MyQuck {

    public static void main(String[] args) {
        int a[] = {4, 5, 3, 5, 6, 7, 2, 7, 8, 2, 6, 5, 6, -13834, -349, 434024, -211414};
        int[] ints = new MyQuck().quick(a, 0, a.length);
        System.out.println(Arrays.toString(ints));
    }

    public int[] quick(int a[], int begin, int end) {
        if (end - begin < 2) return a;

        int mid = sort(a, begin, end);

        // 左边递归
        quick(a, begin, mid);
        // 右边递归
        quick(a, mid + 1, end);

        return a;
    }

    public int sort(int [] a, int begin, int end) {

        int cur = a[begin];
        end--;

        while (begin < end) {

            while (begin < end) {
                // 从后面开始遍历
                if (a[end] > cur) {
                    end--;
                } else {
                    a[begin] = a[end];
                    begin++;
                    break;
                }
            }

            while (begin < end) {
                // 从前边开始遍历
                if (a[begin] < cur) {
                    begin++;
                } else {
                    a[end] = a[begin];
                    end--;
                    break;
                }
            }
        }
        a[begin] = cur;

        return begin;
    }

}
