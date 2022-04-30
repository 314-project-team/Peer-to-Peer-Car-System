package ObjectsAndLogic;


/*
 *  NAME: YI WEI TAO
 *  Task: User, Admin, Customer,Assistant
 *
 */

import java.util.ArrayList;

public class Admin extends User  {



    private ArrayList<Assistant> CandidateList=getCandidateFromTable();//数据库中把所有 isPass=false的调用到这个List中



    public Admin(String name, int age, String account, String password, String AD_Account) {
        super(name, age, account, password);
    }

    public Admin(String name, int age, String account, String password) {
        super(name, age, account, password);
    }

    public Admin(String name, int age, String account, String password, double longitude, double latitude) {
        super(name, age, account, password, longitude, latitude);
    }





    public ArrayList<Assistant> getCandidateFromTable(){
    /*数据库中把所有Assistant中 isPass=false的调用到这个List中*/

        /*EX：*/
        ArrayList<Assistant> list=new ArrayList<Assistant>();

        return list;
    }


    //这个方法是创建一个assistant对象(他只是Candidate---->isPass = false )
    public void applyForCandidate(){

    //前端提供界面窗口，Admin 进行 新的Candidate的参数输入

    String name="null";
    int    age=0;
    String account="null";
    String password="null";

    /*调用 Assistant类中创建Candidate的构造参数  isFree=false, isPass = False  ， 经纬度不存在 */
        Assistant candidate=new Assistant(name,age,account,password);

    /* 将这个candidate加入数据库中*/
        CandidateList.add(candidate);

    }

    // 把Candidate变为assistant的方法，就是改变Assistant表中某个assistant中的isPass=true
    // 把Assistant的isPass = true; isFree=true,  (设施经纬度=0)
    public void qualifyCandidateToAssistant(String AssistantNumber){

        /*寻找特定的一个Candidate*/
        Assistant as=null;

        for(int i=0;i<CandidateList.size();i++){
            if(CandidateList.get(i).getAccount().equalsIgnoreCase(AssistantNumber)){
                as=CandidateList.get(i);
                //得到这个assistant，并删除掉掉这一列在DataBase
                //
            }
        }

        //对这个assistant进行参数修改，精度和纬度不用设置，默认是double=0;
        //但是当Candidate，成为真正的Assistant的时候，金纬度需要给出一个合理的参数。这个前端设定？
        as.setPass(true);
        as.setFree(true);
        //我在这里以防万一，给出一个0-->待定
        as.setLatitude(0);
        as.setLongitude(0);
        /*把这个新的Assistant 按照新的数据格式 再次放到database中的*Assistant表中*/

    }
    //找出一个特定的admin，从admin表中删除，并把这个admin创建一个基础属性放在Assistant表中
    public void qualifyAdminToAssistant(String AD_Account){
        /*提取所有的Admin从数据库 并放入adminList*/
        ArrayList<Admin> adminList=new ArrayList<Admin>();
        Admin ad=null;

        for(int i=0;i<adminList.size();i++){
            if(adminList.get(i).getAccount().equalsIgnoreCase(AD_Account)){
                ad=adminList.get(i);
                //得到这个admin，并删除掉掉这一列在DataBase 中的admin表中
                deleteAdmin(AD_Account);
            }
        }
        //此时就是一个Candidate类型的Assistant(isPass=false, isFree=false,没有经纬度)
        Assistant  as=new Assistant(ad.getName(),ad.getAge(),ad.getAccount(),ad.getPassword());
        //把这个新的assistant加入到Database中的Assistant表中

    }

    //把一个特定的Assistant从Assistant表中找出来，在Assistant表中删除，并按照这个Assistant的属性创建一个Admin放入Admin表
    public void qualifyAssistantToAdmin(String AS_Account){
        /*提取所有的Assistant从数据库 Assistant*/
        ArrayList<Assistant> assistantList=new ArrayList<Assistant>();
        Assistant as=null;

        for(int i=0;i<assistantList.size();i++){
            if(assistantList.get(i).getAccount().equalsIgnoreCase(AS_Account)){
                as=assistantList.get(i);
                //得到这个assistant，并删除掉掉这一列在DataBase 中的Assistant表中
                deleteAssistant(AS_Account);
            }
        }
        //(String name, int age, String account, String password, String AD_Account)
        //根据这个Assistant的数据 创建Admin
        Admin ad=new Admin(as.getName(),as.getAge(),as.getAccount(),as.getPassword(),"XX");

        //把这个Admin加入到数据库中的Admin表中
    }

    //根据Admin的ID找出这个特定的Admin，并把它从表中删除
    public  void  deleteAdmin(String AD_Account){

        //按照PK：AD_Account 在database中中的Admin表中删除这一列

    }
    //根据Assistant的ID找出这个特定的Assistant，并把它从Assistant表中删除
    public  void  deleteAssistant(String AC_Account){

       //按照PK：AC_Account 在database中中的表Assistant中删除这一列

    }


}
