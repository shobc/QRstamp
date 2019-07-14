package function;

import Bean.QRBean;

//Beanへ各学科の値をセットするクラス
public class DepartmentJudge{
    public void judge(String Department,QRBean qb){
        if(Department.equals("Architectural_director")){                       //建築監督
            qb.setJudgement("true",0);
        }else if(Department.equals("Architecture")){                           //建築
            qb.setJudgement("true",1);
        }else if(Department.equals("interior")){                               //インテリア
            qb.setJudgement("true",2);
        }else if(Department.equals("Information_processing")){                 //情報処理
            qb.setJudgement("true",3);
        }else if(Department.equals("game_programming")){                       //ゲームプログラミング
            qb.setJudgement("true",4);
        }else if(Department.equals("WEB_animation_creator")){                  //web動画クリエーター
            qb.setJudgement("true",5);
        }else if(Department.equals("Environmental_technology")){               //環境テクノロジー
            qb.setJudgement("true",6);
        }else if(Department.equals("Biotechnology")){                          //バイオテクノロジー
            qb.setJudgement("true",7);
        }else if(Department.equals("confirm")){                                //カード交換済み
            qb.setJudgement("true",8);
        }
    }
}