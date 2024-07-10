public class ArmstrongNumbers {
    public void checkIsArmstringNumber(int stopCount) {
      try {
        DataBase dataBase = new DataBase();
        System.out.println("Armstrong Number Execution Started");
        int count = 0;
        int number = 0;
        while (count < stopCount) {
            dataBase.setoriginalNum(number);
            dataBase.setn(String.valueOf(number).length());
            dataBase.setResult(0);

            while (dataBase.getoriginalNum() != 0) {
                int remainder = dataBase.getoriginalNum() % 10;
                dataBase.setResult(dataBase.getResult()+Math.pow(remainder, dataBase.getn()));
                dataBase.setoriginalNum(dataBase.getoriginalNum() / 10);
            }

            if (number == dataBase.getResult()) {
                System.out.println(number);
                count++;
            }
            number++;
        }
        System.out.println("Execution Completed");
        System.out.println();
        System.out.println();
      } catch (Exception e) {
        System.err.println(e);
        System.err.println("ArmstrongNumber Executon Failed");
        throw e;
      }
        
    }   
}
