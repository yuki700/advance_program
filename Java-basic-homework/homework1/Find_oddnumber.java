public class Find_oddnumber {
    public static void main(String[] args) {
        int totalOFoddnumber = 0;
        for (int i = 0; i < 51; ++i) {
            if (i % 2 == 1) {
                String formula = i + "+" + totalOFoddnumber;
                totalOFoddnumber = totalOFoddnumber + i;
                System.out.println(formula);
            }
        }
        System.out.println("totalOFoddnumber is" + " " + totalOFoddnumber);
    }
}