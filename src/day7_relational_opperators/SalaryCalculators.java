package day7_relational_opperators;

public class SalaryCalculators {
    public static void main(String[] args) {
 /*
    create a class SalaryCalculator
    add a main method
    declare and assign these variables:
       salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
    Sample date:
       100000 (salary)
       0.08 (state tax rate)
       0.21 (federal tax rate)
    Hint: use tax rates of 0.08 and 0.21 for 8% and 21%
    Print the tax rates, your total salary, the amount of tax for state and federal, the total tax amount, and your salary after all taxes
     */

//        double salary=100_000;
//        double stateTaxRate=0.08; //8%
//        double federalTaxRate=0.21, //21%
//                stateTax,federalTax,salaryAfterTax,totalTax;
//
//        stateTax=salary*stateTaxRate;
//        federalTax=salary*federalTaxRate;
//        totalTax=stateTax+federalTax;
//        salaryAfterTax=salary-totalTax;
//
//        String taxReport="State tax rate: "+stateTaxRate+ "\n Federal tax rate: "+federalTaxRate+ "\n Total salary "+salary+ " \n Amount of tax for state: "+stateTax+ " \n Federal tax "+federalTax+ " \n Total tax: "+totalTax+ " \n Salary after tax "+salaryAfterTax;
//
//        System.out.println(taxReport);





//        public static void main(String[] args) {
//
            double salary = 100_000;
            double stateTaxRate = 0.08; // 8 %
            double federalTaxRate = 0.21; // 21 %
            double stateTax, federalTax, totalTax, salaryAfterTax;

            stateTax = salary * stateTaxRate;
            federalTax = salary * federalTaxRate;
            totalTax = stateTax + federalTax;
            salaryAfterTax = salary - totalTax;

            String taxReport = "State tax rate: " + stateTaxRate + ", Federal tax rate: " + federalTaxRate + " , base salary: $" + salary + "\nTax amounts: " + stateTax + " for state tax and " + federalTax + " for federal tax, coming to a total of " + totalTax + "\nAfter tax your salary is " + salaryAfterTax;

            System.out.println(taxReport);

    }
}
