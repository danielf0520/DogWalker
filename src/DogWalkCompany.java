import java.util.Scanner;

public class DogWalkCompany {
    private int[] schedule;
    public DogWalkCompany() {
        schedule = new int[24];
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < schedule.length; i++)
        s += i + " " + schedule[i] + "\n";
    return s;
    }

    public int numAvailableDogs(int hour)
    {
        return schedule[hour];
    }

    public int addDogs()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("What Hour?");
        int hour =  s.nextInt();
        System.out.println("how many dogs?");
        int dogs = s.nextInt();
        schedule[hour] = dogs;
        return hour;

    }

}