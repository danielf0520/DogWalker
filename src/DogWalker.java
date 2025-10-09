public class DogWalker {
    private int maxDogs;
    private DogWalkCompany company;

    public DogWalker(int max, DogWalkCompany comp) {
        maxDogs = max;
        company = comp;
    }

    public int walkDogs(int hour) {
        int dogs = company.numAvailableDogs(hour);
        if (dogs < maxDogs)
        {
            company.updateDogs(hour, dogs);
            return dogs;
        }
        else
        {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
        
        }
    public int dogWalkShift(int startHour, int endHour) {
        int pay = 0;
        while(startHour <= endHour)
        {
            int dogs = walkDogs(startHour);
            pay += dogs * 5;
            startHour++;
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17)
                pay += 3;
            pay = pay;
        }
        return pay;
    }
}