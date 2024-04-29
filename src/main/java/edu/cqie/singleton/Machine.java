package edu.cqie.singleton;

import java.util.ArrayList;
import java.util.List;

public class Machine {
    //私有构造函数
    private Machine(){}

    private static Machine instance = null;

    public static Machine getInstance(){
    if(instance == null){
        synchronized (Machine.class){
            if(instance == null){
                instance = new Machine();
            }
        }
    }
        return instance;
    }

    private  List<Integer> numbers =  new ArrayList<>();

    private int sendIndex = 0;
    private  int callIndex = -1;
    //供顾客调用的取号
    public int sendNumber(){
        sendIndex++;
        numbers.add(sendIndex);
        return sendIndex;
    }
    //供工作人员呼号
    public  int nextNumber(){
        callIndex++;
        if(callIndex < sendIndex){
            return numbers.get(callIndex);
        }
        return -1;
    }

}
