import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kylewold
 */
public class MaxHeapTest {

    @Test
    void testIsEmptyTrue(){
        MaxHeap testMaxHeap = new MaxHeap();

        boolean testIsEmpty = testMaxHeap.isEmpty();

        assertTrue(testIsEmpty);
    }

    @Test
    void testIsEmptyFalse(){
        Task[] arrayOfTasks = new Task[1];
        Task testTask = new Task(1, TaskInterface.TaskType.SOCIALIZING, "test");
        arrayOfTasks[0] = testTask;
        MaxHeap testMaxHeap = new MaxHeap(arrayOfTasks);

        boolean testIsEmpty = testMaxHeap.isEmpty();

        assertFalse(testIsEmpty);
    }

    @Test
    void testInsert(){
        MaxHeap testMaxHeap = new MaxHeap();
        Task testTask = new Task(1, TaskInterface.TaskType.SOCIALIZING, "test");
        testMaxHeap.insert(testTask);

        boolean testIsEmpty = testMaxHeap.isEmpty();

        assertFalse(testIsEmpty);
        assertEquals(testMaxHeap.max(), testTask);
    }

    @Test
    void testExtractMaxOutOf2(){
        Task[] arrayOfTasks = new Task[10];
        Task testTask = new Task(1, TaskInterface.TaskType.SOCIALIZING, "test");
        Task testTask1 = new Task(1, TaskInterface.TaskType.MINING, "test1");
        arrayOfTasks[0] = testTask1;
        arrayOfTasks[1] = testTask;
        MaxHeap testMaxHeap = new MaxHeap(arrayOfTasks);

        Task taskToCompare = testMaxHeap.extractMax();

        assertEquals(taskToCompare, testTask1);
        assertEquals(testMaxHeap.size, 1);
    }

    @Test
    void testExtractMaxOutOf3(){
        Task[] arrayOfTasks = new Task[10];
        Task testTask = new Task(1, TaskInterface.TaskType.SOCIALIZING, "test");
        Task testTask1 = new Task(1, TaskInterface.TaskType.MINING, "test1");
        arrayOfTasks[0] = testTask1;
        arrayOfTasks[1] = testTask;
        MaxHeap testMaxHeap = new MaxHeap(arrayOfTasks);

        Task taskToCompare = testMaxHeap.extractMax();

        assertEquals(taskToCompare, testTask1);
        assertEquals(testMaxHeap.size, 1);
    }

    @Test
    void testIncreaseKeyInSize2(){

    }

    @Test
    void testIncreaseKeyInSize3(){

    }

    @Test
    void testCheckIfMaxHeap(){

    }

    @Test
    void testIfSorted(){

    }

    @Test
    void testInsertAscending(){

    }

    @Test
    void testInsertDescending(){

    }

    @Test
    void testInsertRandom(){

    }

}
