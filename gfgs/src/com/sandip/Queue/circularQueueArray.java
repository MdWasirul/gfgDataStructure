package com.sandip.Queue;

public class circularQueueArray {

    public static class CqA {
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        //[0,0,0,0,0,0,0,0,0,0];

        public void add(int x) throws Exception {
            if (size == arr.length) {
                throw new Exception("Queue is full");
            } else if (size == 0) {
                f = r = 0;
                arr[0] = x;
            } else if (r < arr.length - 1) {
                arr[++r] = x;

            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = x;

            }
            size++;

        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");

            } else if (f == arr.length - 1) {
                int val = arr[f];
                f = 0;
                size--;
                return val;


            } else {
                int val = arr[f];
                f++;
                size--;
                return val;
            }
        }

        public int peek() throws Exception {
            if (size == 0) {
                throw new Exception("Queue is Empty!");
            } else return arr[f];
        }

        public boolean isEmpty() {
            if (size == 0) return true;
            else return false;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty!");
                return;
            } else if (f <= r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {  // (r < f)
                //r greater than f
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                // r less than f
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");

                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws Exception {
        CqA q = new CqA();
//        System.out.println(q.isEmpty());
        q.display();
//        System.out.println(q.peek());
        q.add(1);
//        System.out.println(q.isEmpty());
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); //1 2 3 4
        q.remove();
        q.display(); // 2 3 4
//        System.out.println(q.size);
        q.add(5);
        q.display();
        q.add(6);
        q.display(); // 6 2 3 4 5 -->Queue- 2 3 4 5 6
//        q.add(7);
//        q.display();

        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i] + " ");
        }


    }
}
