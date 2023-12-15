package com.myshow4all.student_internship_program.model;

public class ProgressResponse {

    private long totalTasks;
    private long completedTasks;

    public ProgressResponse(long totalTasks, long completedTasks) {
        this.totalTasks = totalTasks;
        this.completedTasks = completedTasks;
    }

    public long getTotalTasks() {
        return totalTasks;
    }

    public long getCompletedTasks() {
        return completedTasks;
    }
}
