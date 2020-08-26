package project.logic;

import project.logic.model.User;

public class UserDetails {


    public static String FullName(User user){
        String fullName=user.getfName()+" "+user.getlName();

        return fullName;
    }

    public static Boolean VerifyCountry(User user){
        String country=user.getAddress().getCountry();
        if(country=="CA"){
            return true;
        }
        else {
            return false;
        }
    }

    // TODO : RQ - 2
    public static Double SalaryAccumulated(User user){
        int remainingAge=0;
        String country=user.getAddress().getProvince();
        //Adding code for RQ-2 to accumulate salary based on province
        if(country=="Quebec")
        {
            remainingAge = 55-user.getAge();
        }
        else if(country=="Ontario")
        {
            remainingAge = 58-user.getAge();
        }
        double salaryHike=0,totalSalary=0;
        salaryHike=user.getSalary();
        for(int i=1;i<=remainingAge;i++){
            salaryHike=salaryHike+salaryHike*0.02 ;
            totalSalary+=salaryHike;
        }
        return totalSalary;
    }


}
