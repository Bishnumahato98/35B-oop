package task.Week1;

public class queueExample {
    public static void main(String[] args) {
        
        
    }
}


class QueueDataStructure{
    int capacity;
    int front;
    int rear;
    int currentsize=0;
    int[] queue_arr;
    QueueDataStructure(int capacity){
        this.capacity=capacity;
        front=0;
        rear=-1;
        queue_arr=new int[this.capacity];

    }
    boolean isFull(){
        return this.currentsize==this.capacity;
    }
    boolean isEmpty(){
        return this.currentsize==this.capacity;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return-1;
        }
        return queue_arr[front];
    }
    void enqueue (int data){
        if(isFull()){
            System.out.println("Full");
        }else{
            rear ++;
            if(rear==capacity-1){
                rear=0;
            }
            queue_arr[rear]=data;
            currentsize ++;
        }
    }

    int dequeue(){
        if(isEmpty()){
            System.out.println("Empty");
            return-1;
        }else{
            front++;
            currentsize--;
            if(front==capacity-1){
                int ret=queue_arr[front-1];
                return ret;
            }else{
                return queue_arr[front-1];
            }
        }

    }
}