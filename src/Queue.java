public class Queue {

    static int arr[];
    static int size;
    static int rear;
    static int front;


    Queue(int n) {
        arr = new int[n];
        size = n;
        rear = -1;
        front = -1;

    }

    public static boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isFull() {
        if (rear == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void Enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } if (isEmpty()) {
            front = 0;
        }

        rear = rear + 1;
        arr[rear] = x;
    }

    public static int Dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty cannot remove");
            return -1;
        } else {
            front = front + 1;

        }

        return front;
    }


    public static int peek() {
        if (isEmpty()) {
            System.out.println("Cannot peek Queue is empty");
        }
        return arr[front];
    }

    public static void display(){
        for(int i=front; i<arr.length; i++){
            System.out.print(Queue.arr[i] + " ");
        }
    }

}
    class Main {

    public static void main(String[] args){

        Queue q = new Queue(10);

        Queue.Enqueue(5);
        Queue.Enqueue(8);
        Queue.Enqueue(9);
        Queue.Enqueue(12);



       Queue.display();



        System.out.println();

        Queue.Dequeue();
        Queue.display();






    }
}
