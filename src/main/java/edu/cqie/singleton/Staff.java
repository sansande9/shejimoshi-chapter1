package edu.cqie.singleton;

public class Staff {
    public int windowNumber;
    public  Staff(int windowNumber){
        this.windowNumber = windowNumber;
    }
    public void callNumber(){
        int no = Machine.getInstance().nextNumber();
        if(0<no){
            System.out.println("请"+Machine.getInstance().nextNumber()+"号顾客到"+this.windowNumber+"窗口办理业务。");
        }
        System.out.println("没有顾客排队");
    }
}
