/**
 *
 * @author kylewold
 */
public class Task implements TaskInterface, Comparable<Task>{
    public int taskPriority;
    public TaskInterface.TaskType taskType;
    public int waitingTime;
    public int hourCreated;
    public String taskDescription;

    public Task(int hourCreated, TaskInterface.TaskType taskType, String taskDescription){
        this.hourCreated = hourCreated;
        this.taskType = taskType;
        this.taskDescription = taskDescription;
        taskPriority = 0;
    }

    @Override
    public int getPriority() {
        return taskPriority;
    }

    @Override
    public void setPriority(int priority) {
        taskPriority = priority;
    }

    @Override
    public TaskType getTaskType() {
        return taskType;
    }

    @Override
    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public void incrementWaitingTime() {
        waitingTime ++;
    }

    @Override
    public void resetWaitingTime() {
        waitingTime = 0;
    }

    @Override
    public int getWaitingTime() {
        return waitingTime;
    }

    @Override
    public int compareTo(Task toCompare) {
        /*Check priority first*/
        int compareVal = Integer.compare(taskPriority, toCompare.taskPriority);
        if(compareVal != 0){
            return compareVal;
        }

        /*Check hourCreated if necessary (to distinguish from alike priority values*/
        return Integer.compare(taskPriority, toCompare.taskPriority);
    }
}
