public class BonusMilesService {
    public int calculate(int cost) {
        int oneMiles = 20;
        int miles = cost / oneMiles;
        return miles;
    }
}
