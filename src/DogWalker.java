public class DogWalker
{
    private int maxDogs;
    private DogWalkCompany company;

    public DogWalker(int max, DogWalkCompany comp)
    {
        this.maxDogs = max;
        this.company = comp;
    }


    public int walkDogs(int hour)
    {
        int dogsAvailable = company.numAvailableDogs(hour);
        if (maxDogs >= dogsAvailable) {
            company.updateDogs(hour, dogsAvailable);
            return dogsAvailable;
        } else {
            company.updateDogs(hour, maxDogs);
            return maxDogs;
        }
    }

    public int dogWalkShift(int startHour, int endHour)
    {
        int pay = 0;
        for (int currhour = startHour; currhour <= endHour; currhour++) {
            int dogs = walkDogs(startHour);
            pay += 5 * dogs;
            if (dogs == maxDogs || startHour >= 9 && startHour <= 17) {
                pay += 3;
            }
        }
        return pay;
    }

}