public class DogWalkCompany {
    private int[] schedule;
    public DogWalkCompany() {
        schedule = new int[24];
    }
}
 public String toString() {
    String s = "";
    for (int i = 0; i < schedule.length; i++)
        s += i + " " + schedule[i] + "\n";
    return s;
 }

void main() {
}