package function;

import Bean.QRBean;

//Bean�֊e�w�Ȃ̒l���Z�b�g����N���X
public class DepartmentJudge{
    public void judge(String Department,QRBean qb){
        if(Department.equals("Architectural_director")){                       //���z�ē�
            qb.setJudgement("true",0);
        }else if(Department.equals("Architecture")){                           //���z
            qb.setJudgement("true",1);
        }else if(Department.equals("interior")){                               //�C���e���A
            qb.setJudgement("true",2);
        }else if(Department.equals("Information_processing")){                 //��񏈗�
            qb.setJudgement("true",3);
        }else if(Department.equals("game_programming")){                       //�Q�[���v���O���~���O
            qb.setJudgement("true",4);
        }else if(Department.equals("WEB_animation_creator")){                  //web����N���G�[�^�[
            qb.setJudgement("true",5);
        }else if(Department.equals("Environmental_technology")){               //���e�N�m���W�[
            qb.setJudgement("true",6);
        }else if(Department.equals("Biotechnology")){                          //�o�C�I�e�N�m���W�[
            qb.setJudgement("true",7);
        }else if(Department.equals("confirm")){                                //�J�[�h�����ς�
            qb.setJudgement("true",8);
        }
    }
}