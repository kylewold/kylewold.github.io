/**
 *
 * @author kylewold
 */
public class MaxHeap {
    int size;
    protected Task[] taskArray;

    /*Constructor for top-down heap*/
    public MaxHeap(){
        taskArray = new Task[10];
    }

    /*Constructor for bottom-up heap*/
    public MaxHeap(Task[] taskArray){
        this.taskArray = taskArray;
    }  //handling size variable value?

    private void heapify(int index){
        int leftChildIndex = (index * 2) + 1;
        int rightChildIndex = (index * 2) + 2;
        int largestIndex;

        /*Compare current node with left and right child*/
        if(leftChildIndex <= size && taskArray[leftChildIndex].compareTo(taskArray[index]) > 0){
            largestIndex = leftChildIndex;
        }
        else{
            largestIndex = index;
        }
        if(rightChildIndex <= size && taskArray[rightChildIndex].compareTo(taskArray[largestIndex]) > 0){
            largestIndex = rightChildIndex;
        }

        /*Handle if current node is not the largest by swapping the two*/
        if(largestIndex != index){
            Task tempTask = taskArray[index];
            taskArray[index] = taskArray[largestIndex];
            taskArray[largestIndex] = tempTask;

            heapify(largestIndex);
        }
    }

    public Task max(){
        if(size < 1){
            //double array size
        }

        return taskArray[0];
    }

    public Task extractMax(){
        Task max = max();
        taskArray[0] = taskArray[size - 1];
        size --;
        heapify(1);

        return max;
    }

    public void insert(Task newTask){
        if(size == taskArray.length){
            //double array size
        }

        size ++;
        /*k = x.key
          x.key = infinity  is this operation necessary?
         */
        taskArray[size] = newTask;
        increaseKey(size, newTask);
    }

    public void increaseKey(int index, Task newTask){
        if(newTask.compareTo(taskArray[index]) < 0 ){
            //throw exception
        }

        taskArray[index] = newTask; //Should this line really be here?

        while(index > 1 && taskArray[(index-1)/2].compareTo(taskArray[index]) < 0){
            //exchange A[i] and A[Parent(i)]
            Task tempTask = taskArray[index];
            taskArray[index] = taskArray[(index-1)/2];
            taskArray[(index-1)/2] = tempTask;
            index = (index-1)/2;
        }
    }

    public boolean isEmpty(){
        if(size < 1){
            return true;
        }

        return false;
    }

    private void buildMaxHeap(){
        size = taskArray.length;

        for(int i = taskArray.length/2; i > 1; i--){
            heapify(i);
        }
    }

}
