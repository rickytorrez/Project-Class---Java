public class ProjectTest{
    public static void main(String[] args){

        Project project1 = new Project();
        Project project2 = new Project("name");
        Project project3 = new Project("Cleveland Dojo", "to train thousands of programmers", 100000);
        Project project4 = new Project("Dojo International", "to educate people abroad", 1000000);
        
        System.out.println(project1.getName());
        System.out.println(project2.elevatorPitch());
        System.out.println(project3.elevatorPitch());
        System.out.println(project4.elevatorPitch());
        

    }
}