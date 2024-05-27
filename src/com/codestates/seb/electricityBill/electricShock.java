package com.codestates.seb.electricityBill;

public class electricShock {


    public static double calculateUsedPower(int usedKwh, double calculate) {

        if (usedKwh <= 100) {
            calculate = usedKwh * 60.7;
        } else if (usedKwh <= 200) {
            calculate = 6070 + (usedKwh - 100) * 125.9;
        } else if (usedKwh <= 300) {
            calculate = 18660 + (usedKwh - 200) * 187.9;
        } else if (usedKwh <= 400) {
            calculate = 37450 + (usedKwh - 300) * 280.6;
        } else if (usedKwh <= 500) {
            calculate = 65510 + (usedKwh - 400) * 417.7;
        } else {
            calculate = 107280 + (usedKwh - 500) * 670.6;
        }
        System.out.println(usedKwh+"kwh의 전기 요금은 "+ calculate+"원입니다.");
        return calculate;
    }
}
