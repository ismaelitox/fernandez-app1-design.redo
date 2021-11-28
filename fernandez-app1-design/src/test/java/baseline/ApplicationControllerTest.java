
/*
 *  UCF COP3330 Summer 2021 Application Assignment 1 Solution
 *  Copyright 2021 Jonah Fernandez
 */


package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationControllerTest {

    @Test
    void editDateClicked() {
        // edit date clicked
        // run add date
        // set expected action
        // assert ture for editdate.Adddate
    }

    @Test
    void editTasksClicked() {
        // run 'addtasksclicked'
        // add 'new task'
        // set value of new AddTaskClicked
        // assert input value to new editValue
        // assertTrue 'newTaskEdit vs Previous Task
    }

    @Test
    void inputItemDescription() {
        // New itemDescription added to test List
        // new todoItemDescription object
        // set new itemDescription to value
        // assert true new itemDescription contained in new test list
    }

    @Test
    void inputItemString() {
        // New item added to test List
        // new todoItem object
        // set new item to value
        // assert true new item contained in new test list
    }

    @Test
    void loadTasksClicked() {
        // Try new add task method
        // run add selected tasks button
        // load all from path
        // try new list from file path
        // assert file path exists

    }

    @Test
    void newTasksCreate() {
        // try add task method
        // new task expected to test list
        // try to set new task name
        // assert true for filled variables
    }

    @Test
    void removeTaskClicked() {
        // try add task method
        // new task expected to test list
        // try to set new task name
        // remove test list
        // assert true task is empty
    }

    @Test
    void saveCurrentTask() {
        // create new item and description
        // Take item and description input
        // add to new test list
        // try new file path to for testlist
        // assert true if file exists

    }

    @Test
    void showAllTasksClicked() {
        // create new items and descriptions
        // create new test list
        // add to new test list
        // assert true all tasks displayed
    }

    @Test
    void showCompleteTskClicked() {
        // create new items and descriptions
        // create new test list
        // add to new test list
        // mark complete items
        // assert true complete items are displayed
    }

    @Test
    void showDateClicked() {
        // create new date item
        // assign to new test list
        // add to test list
        // assert true that date is shown in YYYY-MM-DD format

    }

    @Test
    void showIncompleteTasks() {
        // create new items and tasks
        // assign to new test list
        // mark items as complete
        // leave some incomplete
        // assert true items are completed
        // assert false items are incomplete
    }

    @Test
    void getAddDate() {
        // get input from add date action in Application
        // assert true add date is correct
    }

    @Test
    void setAddDate() {
        // set add date from get add date
        // assert true
    }

    @Test
    void getAddTask() {
        // get input from add task action in Application
        // assert true add task is correct
    }

    @Test
    void setAddTask() {
        // set add task from get add task
        // assert true
    }
}