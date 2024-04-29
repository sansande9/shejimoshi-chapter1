package edu.cqie.shipeiqi;

public class ComputerAdapter extends ElectricSource implements ComputerElectricRequest{
    private ElectricSource electricSource;

    public void setElectricSource(ElectricSource electricSource) {
        this.electricSource = electricSource;
    }



    @Override
    public int input() {
        //int out = super.outPut();
        int out = this.electricSource.outPut();
        int in = out/11;
        System.out.println("输出笔记本电脑需要"+in+"v的电压");
        return in;
    }
}
