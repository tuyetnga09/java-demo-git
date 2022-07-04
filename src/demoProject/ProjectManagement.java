/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoProject;


/**
 *
 * @author phamtuyetnga
 */
public class ProjectManagement {
    //Basic Information 

    private String id;
    private String nameProject;
    private String describe;
    private String  startDay;
    private String projectTopic;

    //Feature information: người thực hiện và thời gian thực hiện dự án 
    private String executor;
    private int executionTime;

    public ProjectManagement() {
    }

    public ProjectManagement(String id, String nameProject, String describe, String startDay, String projectTopic, String executor, int executionTime) {
        this.id = id;
        this.nameProject = nameProject;
        this.describe = describe;
        this.startDay = startDay;
        this.projectTopic = projectTopic;
        this.executor = executor;
        this.executionTime = executionTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getProjectTopic() {
        return projectTopic;
    }

    public void setProjectTopic(String projectTopic) {
        this.projectTopic = projectTopic;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(int executionTime) {
        this.executionTime = executionTime;
    }

    //Method: test executionTime
    public String testTime() {
        if (executionTime > 7) {
            return "Good";
        } else {
            return "Rather";
        }
    }

}
