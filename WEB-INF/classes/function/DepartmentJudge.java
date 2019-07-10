package function;

import Bean.QRBean;

public class DepartmentJudge{
    public void judge(String Department,QRBean qb){
        if(Department.equals("Architectural_director")){
            qb.setJudgement("true",0);
        }else if(Department.equals("Architecture")){
            qb.setJudgement("true",1);
        }else if(Department.equals("interior")){
            qb.setJudgement("true",2);
        }else if(Department.equals("Information_processing")){
            qb.setJudgement("true",3);
        }else if(Department.equals("game_programming")){
            qb.setJudgement("true",4);
        }else if(Department.equals("WEB_animation_creator")){
            qb.setJudgement("true",5);
        }else if(Department.equals("Environmental_technology")){
            qb.setJudgement("true",6);
        }else if(Department.equals("Biotechnology")){
            qb.setJudgement("true",7);
        }
    }
}