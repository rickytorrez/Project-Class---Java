class Project {
    private String name;
    private String description;
    private double initialCost = 0;
    // Sets Project Name and Description if they're not provided
    public Project(){
        this.name = "Project Title";
        this.description = "Project Information";
    }
    // Sets Project Description if it's not provided
    public Project(String name){
        this.name = name;
        this.description = "Project Description";
    }
    // Gets Project Name and Description from ProjectTest.java
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    // Gets Project Name, Description and Initial Cost from ProjectTest.java
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }
    // Setters and Getters for Name
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    // Setters and Getters for Description
    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
    // Setters and Getters for Initial Cost
    public void setinitialCost(double initialCost){
        this.initialCost = initialCost;
    }

    public double getinitialCost(){
        return this.initialCost;
    }
    // Method for the Elevator Pitch
    public String elevatorPitch(){
        return "The project name is " + this.name + " " + "The project description is " + this.description + " " + "The cost for the project is " + this.initialCost;

    }
}