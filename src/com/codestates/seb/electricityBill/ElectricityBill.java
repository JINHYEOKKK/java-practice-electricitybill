package com.codestates.seb.electricityBill;

public class ElectricityBill {
  public static void main(String[] args) {
    System.out.println("=".repeat(25));
    System.out.println(" 주택용 전기요금(저압) 계산기 ");
    System.out.println("=".repeat(25));



    electricShock.calculateUsedPower(99, 0);
    electricShock.calculateUsedPower(150, 0);
    electricShock.calculateUsedPower(250, 0);
    electricShock.calculateUsedPower(301, 0);
    electricShock.calculateUsedPower(450, 0);
    electricShock.calculateUsedPower(510, 0);
    //TODO:

    // 1, 100 이하인 경우 전력당 60.7 원이 부가됩니다. (사용한 전력 100 kWh 이하일 경)
//    int usedKwh = 600;
//    double calculate = 0;
//    if (usedKwh <= 100) {
//      calculate = usedKwh * 60.7;
//    } else if (usedKwh <= 200) {
//      calculate = 6070 + (usedKwh - 100) * 125.9;
//    } else if (usedKwh <= 300) {
//      calculate = 18660 + (usedKwh - 200) * 187.9;
//    } else if (usedKwh <= 400) {
//      calculate = 37450 + (usedKwh - 300) * 280.6;
//    } else if (usedKwh <= 500) {
//      calculate = 65510 + (usedKwh - 400) * 417.7;
//    } else {
//      calculate = 132570 + (usedKwh - 500) * 670.6;
//    }

//      usedKwh = 99;
//      System.out.println(usedKwh+"kwh의 전기 요금은 "+ calculate+"원입니다.");
//      usedKwh = 150;
//      System.out.println(usedKwh+"kwh의 전기 요금은 "+ calculate+"원입니다.");

      // 2, 100 이하인 경우 전력당 60.7원 부과, 100 초과인 경우 125.9원 부과 (사용한 전력이 100 kWh 초과일 경우)



  }
}
