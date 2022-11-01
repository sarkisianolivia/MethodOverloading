public class Challenge {

    public static void main(String[] args) {

       double centimeters = calcFeetAndInchesToCentimeters(6.0,  0.0);
       if (centimeters < 0.0) {
           System.out.println("Invalid Parameters");
       }

       calcFeetAndInchesToCentimeters(157);

    }
    public static double calcFeetAndInchesToCentimeters(double feet,double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid Feet or Inches Parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54; //+= : adding something to the existing value of centimeters
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);

    }

}
