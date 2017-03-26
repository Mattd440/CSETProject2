package CSET.controller;

import CSET.controller.ElectiveUtils;
import CSET.model.Course;
import CSET.model.CourseData;
import CSET.model.Elective;
import CSET.model.ElectiveData;
import CSET.model.ElectiveName;
import java.util.HashMap;
import java.util.Map;

public class ElectiveUtils extends CourseUtils {
    private static ElectiveData electiveData = new ElectiveData();

    public  static int getElectiveCreditHours(String course){
        //split string in half .. first have is course type second is section Number
        try{
            if(course.length() == 8){
                String courseType = course.substring(0,4);
                int sectionNumber = Integer.parseInt(course.substring(4));

                // test for valid section number
                if(sectionNumber > 1000 && sectionNumber < 5000){
                    //switch to determine the type of course
                    switch(courseType.toLowerCase()){
                        case "cset":
                           return findHrs(electiveData.getCsetElectives(),sectionNumber);
                        case "cmmc":
                        case "bmgt":
                            return findHrs(electiveData.getCommElective(),sectionNumber);
                        case "buad":
                        case "blaw":
                        case "fina":
                            return findHrs(electiveData.getProDevElective(),sectionNumber);
                        case "kine":
                        case "biol":
                        case "chem":
                        case "phys":
                            return findHrs(electiveData.getNatSciElectives(),sectionNumber);
                        case "arth":
                        case "film":
                        case "hist":
                        case "engl":
                        case "musc":
                        case "reli":
                        case "thtr":
                            return  findHrs(electiveData.getHumanitiesElectives(),sectionNumber);
                        case "anth":
                        case "econ":
                        case "gepl":
                        case "psci":
                        case "psyc":
                        case "sowc":
                        case "soci":
                            return findHrs(electiveData.getSocSciElective(),sectionNumber);
                        default:
                            System.out.println("Invalid Course Number");
                    }
                }else{
                    System.out.println("Invalid Section Number");
                }}else {
                System.out.println("Course must be 8 characters long");
            }
        }
        catch(NumberFormatException nfe){
            nfe.printStackTrace();
        }

    return 0;

    }

    private static Boolean isMultiCultElective(int sectionNumber){
        for(Elective elective: electiveData.getHumanitiesElectives()){
            if(elective.getMultiCulturalElective() && elective.getSectionNumber() == sectionNumber){
                return true;
            }
        }
        for(Elective elective: electiveData.getSocSciElective()){
            if(elective.getMultiCulturalElective() && elective.getSectionNumber() == sectionNumber){
                return true;
            }
        }
        return false;
    }

    public static void printCreditData(HashMap<ElectiveName,Integer> creditData){
        for(HashMap.Entry<ElectiveName,Integer> c: creditData.entrySet()) {
            switch (c.getKey()) {
                case CSET:
                    System.out.printf("CSET: \t\t\t\t\t %d \n",c.getValue());
                    break;
                case PROF:
                    System.out.printf("Prof. Development: \t\t %d \n", c.getValue());
                    break;
                case COMM:
                    System.out.printf("Communication: \t\t\t %d \n",c.getValue());
                    break;
                case NSCI:
                    System.out.printf("Natural Science: \t\t %d \n",c.getValue());
                    break;
                case SSCI:
                    System.out.printf("Social Science: \t\t %d \n",c.getValue());
                    break;
                case HUMA:
                    System.out.printf("Humanities: \t\t\t %d \n",c.getValue());
                    break;
                case MULT:
                    System.out.printf("Multi Diversity: \t\t %d \n",c.getValue());
                    break;
            }
        }
    }

    public static void updateCreditsRemaining(HashMap<ElectiveName,Integer> electiveCredits,String courseType,int credits,int sectionNumber){

        switch (courseType.toLowerCase()) {
            case "cset":
                electiveCredits.replace(ElectiveName.CSET, electiveCredits.get(ElectiveName.CSET) - credits);
                break;
            case "cmmc":
            case "bmgt":
                electiveCredits.replace(ElectiveName.COMM, electiveCredits.get(ElectiveName.COMM) - credits);
                break;
            case "buad":
            case "blaw":
            case "fina":
                electiveCredits.replace(ElectiveName.PROF, electiveCredits.get(ElectiveName.PROF) - credits);
                break;
            case "kine":
            case "biol":
            case "chem":
            case "phys":
                electiveCredits.replace(ElectiveName.NSCI, electiveCredits.get(ElectiveName.NSCI) - credits);
                break;
            case "arth":
            case "film":
            case "hist":
            case "engl":
            case "musc":
            case "reli":
            case "thtr":
                electiveCredits.replace(ElectiveName.HUMA, electiveCredits.get(ElectiveName.HUMA) - credits);
                if (ElectiveUtils.isMultiCultElective(sectionNumber)) {
                    electiveCredits.replace(ElectiveName.MULT, electiveCredits.get(ElectiveName.MULT) - credits);
                }
                break;
            case "anth":
            case "econ":
            case "gepl":
            case "psci":
            case "psyc":
            case "sowc":
            case "soci":
                electiveCredits.replace(ElectiveName.SSCI, electiveCredits.get(ElectiveName.SSCI) - credits);
                if (ElectiveUtils.isMultiCultElective(sectionNumber)) {
                    electiveCredits.replace(ElectiveName.MULT, electiveCredits.get(ElectiveName.MULT) - credits);
                }
                break;
            default:
                //display error message
                System.out.println("Invalid Course Number");
        }
    }
}
