package application;

import java.util.ArrayList;
import java.util.HashMap;

public class Database {
    public static HashMap<String, String> TrainerUserNameToPasswordHashmap;
    public static HashMap<String, String> UserNameToPasswordHashmap;
    public static HashMap<String,Integer> NametoID;
    public static ArrayList<Info> UserList;
    public static ArrayList<Info> TrainerList;
    public static ArrayList<Equipment> EquipmentList;
    public static int IDX=0;
    public static ArrayList<ExercisePlan>[] ExercisePlanList = new ArrayList[1000];
    public static ArrayList<ExercisePlan1> ExercisePlanList1;
    public static int ID = 0,EID=0;
    public Database(){
        TrainerUserNameToPasswordHashmap = new HashMap<>();
        UserNameToPasswordHashmap = new HashMap<>();
        NametoID = new HashMap<>();
        TrainerList = new ArrayList<>();
        UserList = new ArrayList<>();
        for(int i=0; i<1000; i++)
            ExercisePlanList[i] = new ArrayList<>();
        EquipmentList = new ArrayList<>();
        ExercisePlanList1=new ArrayList<>();

    }

}
