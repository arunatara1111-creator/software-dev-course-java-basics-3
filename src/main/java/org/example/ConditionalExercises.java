package org.example;

public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Return true if x is less than 5
        if (x < 5) {
            return true;
        } else {
            return false;
        }
    }

    public String getAgeGroup(int age) {
        // Return child, teen, or adult
        if (age < 13) {
            return "child";
        } else if (age > 12 && age < 20) {
            return "teen";
        } else if(age >= 20 && age <= 64){
            return "adult";
        }
        return "";

    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();
         // Return true if password has at least 8 characters
          if (passwordLength >= 8) {
               return true;
          } else {
              return false;
          }

    }
}
