/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab11_5;


public abstract class State{
    Task task;
    State(Task task) {
        this.task = task;
    }

    public abstract String given();
    public abstract String done();
    public abstract String onCheck();
    public abstract String checked();
    public abstract String onRecheck();
    public abstract String notDone();
}

