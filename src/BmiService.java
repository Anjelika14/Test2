public class BmiService {


        public int calculate(int weightKg, double heightMeters) {
            double bmiIndex = weightKg / Math.pow (heightMeters, 2);
            return (int) bmiIndex;

        }


}
