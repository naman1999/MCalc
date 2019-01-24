package com.naman.mcalc;

public class MortgageModel{
    private double principle;
    private double amortization;
    private double intrest;

    public MortgageModel(String p, String a, String i){
        this.principle = Double.parseDouble(p);
        this.amortization = Double.parseDouble(a);
        this.intrest = Double.parseDouble(i);
    }

    public String computePayment(){
        Double demIn = 1 + this.intrest/1200;
        Double pow = -1 * this.amortization*12;
        Double dempo = Math.pow(demIn,pow);
        Double dem = 1 - dempo;
        Double num = this.intrest/1200 * this.principle;
        Double index = num/dem;
        String result = String.format("$%.2f", index);
        return result;
    }

    public static void main(String[] args) {
        MortgageModel myModel = new MortgageModel("700000","25","2.75");
        System.out.println(myModel.computePayment());

        myModel = new MortgageModel("300000", "20", "4.50");
        System.out.println(myModel.computePayment());
    }
}
