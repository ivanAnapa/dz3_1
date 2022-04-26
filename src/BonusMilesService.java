public class BonusMilesService {

    public int calculate(int price) {
        int bonusCoefficient = 20;
        int miles = price / bonusCoefficient;
        return miles;
    }
}
