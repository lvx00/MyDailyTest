package com.thread;

public class MyThread implements Runnable {
    int j = 1;
    @Override
    public void run() {
        new MyThread().operation();
        System.out.println(Thread.currentThread().getName() + j++ + "操作了数字");
    }

    public void operation(){
        j++;
    }


    public static void main(String[] args) {
        MyThread thread = new MyThread();
        new Thread(thread).start();
    }

}
