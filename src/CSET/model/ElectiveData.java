package CSET.model;


import java.util.HashMap;

public class ElectiveData {

    private Elective[] csetElectives = {
            new Elective("Jr", "CSET", 3100, 3,false),
            new Elective("Jr", "CSET", 3200, 3,false),
            new Elective("Jr", "CSET", 3250, 3,false),
            new Elective("Jr", "CSET", 3400, 3,false),
            new Elective("Jr", "CSET", 4150, 3,false),
            new Elective("Sr", "CSET", 4200, 4,false),
            new Elective("Sr", "CSET", 4650, 4,false),
            new Elective("Sr", "CSET", 4850, 4,false)
    };

    private Elective[] commElective = {
            new Elective(null, "CMMC", 2600, 3,false),
            new Elective(null, "CMMC", 3810, 3,false),
            new Elective(null, "CMMC", 3840, 3,false),
            new Elective(null, "BMGT", 1500, 3,false),
    };

    private Elective[] proDevElective = {
            new Elective(null, "BUAD", 2040, 3,false),
            new Elective(null, "BUAD", 2050, 3,false),
            new Elective(null, "BUAD", 2080, 3,false),
            new Elective(null, "BUAD", 3010, 3,false),
            new Elective(null, "BUAD", 3020, 3,false),
            new Elective(null, "BUAD", 3030, 3,false),
            new Elective(null, "BUAD", 3040, 3,false),
            new Elective(null, "BUAD", 3470, 3,false),
            new Elective(null, "BLAW", 3570, 3,false),
            new Elective(null, "FINA", 3060, 3,false)
    };

    private Elective[] natSciElectives = {
            new Elective(null, "KINE", 2560, 4,false),
            new Elective(null, "KINE", 2570, 4,false),
            new Elective(null, "BIOL", 1120, 4,false),
            new Elective(null, "BIOL", 1140, 4,false),
            new Elective(null, "BIOL", 2170, 4,false),
            new Elective(null, "CHEM", 1120, 4,false),
            new Elective(null, "CHEM", 1230, 5,false),
            new Elective(null, "PHYS", 2130, 5,false),
            new Elective(null, "PHYS", 2140, 5,false)
    };

    private Elective[] socSciElective = {
            new Elective(null, "ANTH", 2800, 3,true),
            new Elective(null, "ECON", 1150, 3,false),
            new Elective(null, "ECON", 1200, 3,false),
            new Elective(null, "GEPL", 1010, 3,false),
            new Elective(null, "GEPL", 3050, 3,true),
            new Elective(null, "PSCI", 1100, 3,false),
            new Elective(null, "PSCI", 1200, 3,false),
            new Elective(null, "PSCI", 1710, 3,false),
            new Elective(null, "PSCI", 2300, 3,false),
            new Elective(null, "PSCI", 2700, 3,false),
            new Elective(null, "PSYC", 1010, 3,false),
            new Elective(null, "PSYC", 2100, 3,false),
            new Elective(null, "PSYC", 2200, 3,false),
            new Elective(null, "PSYC", 2500, 3,false),
            new Elective(null, "PSYC", 2510, 3,false),
            new Elective(null, "PSYC", 2700, 3,false),
            new Elective(null, "PSYC", 3110, 3,false),
            new Elective(null, "SOWC", 1020, 3,false),
            new Elective(null, "SOCI", 1010, 3,false),
            new Elective(null, "SOCI", 1750, 3,false),
            new Elective(null, "SOCI", 2150, 3,false),
            new Elective(null, "SOCI", 2640, 3,true)
    };

    private Elective[] humanitiesElectives = {
            new Elective(null, "ARTH", 1500, 3,false),
            new Elective(null, "FILM", 1310, 3,false),
            new Elective(null, "HIST", 1010, 3,false),
            new Elective(null, "HIST", 1020, 3,false),
            new Elective(null, "HIST", 2010, 3,true),
            new Elective(null, "HIST", 2020, 3,true),
            new Elective(null, "HIST", 2030, 3,true),
            new Elective(null, "HIST", 2040, 3,true),
            new Elective(null, "ENGL", 2760, 3,false),
            new Elective(null, "ENGL", 2710, 3,false),
            new Elective(null, "ENGL", 2730, 3,false),
            new Elective(null, "ENGL", 2720, 3,false),
            new Elective(null, "ENGL", 2740, 3,false),
//            new Course(null ,"ZLIT",1500,3),
//            new Course(null ,"ZLIT",1500,3),
//            new Course(null ,"ZLIT",1500,3),
            new Elective(null, "MUSC", 2420, 3,true),
            new Elective(null, "MUSC", 2210, 3,false),
            new Elective(null, "RELI", 1220, 3,true),
            new Elective(null, "THTR", 1100, 3,false)
    };

    public Elective[] getCommElective() {
        return commElective;
    }

    public Elective[] getCsetElectives() {
        return csetElectives;
    }

    public Elective[] getHumanitiesElectives() {
        return humanitiesElectives;
    }

    public Elective[] getNatSciElectives() {
        return natSciElectives;
    }

    public Elective[] getProDevElective() {
        return proDevElective;
    }

    public Elective[] getSocSciElective() {
        return socSciElective;
    }

}
