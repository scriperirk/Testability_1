public class BonusMilesService {
    public int calculate(int cost) {
        int onemiles = 20;
        int miles = cost / onemiles;
        return miles;
    }
}
