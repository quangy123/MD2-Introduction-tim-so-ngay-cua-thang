package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("mời bạn nhập muốn tháng ? để tìm số ngày của tháng ! ");
        int month = scanner.nextInt();
         String daysInMonth;

        switch (month){
            case 2 :
                daysInMonth = "28 hoặc 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = " 31 ";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30  ";
                break;

            default:
                daysInMonth = "";
                break;
        }
        if (!daysInMonth.equals("")) System.out.printf("tháng '%d' có %s ngày!",month,daysInMonth);
        else System.out.print("!!!!không tìm thấy ! chỉ có từ tháng 1 -> tháng 12 ! ");
    }
}
