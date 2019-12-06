package ru.itpark;

public class CashbackService {
    public int calculateCashback (int purchaseAmount){
        int percent = 5;
        return percent * purchaseAmount / 100;
    }
}
