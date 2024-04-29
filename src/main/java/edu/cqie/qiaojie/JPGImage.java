package edu.cqie.qiaojie;

public class JPGImage extends Image{
    @Override
    public void parseFile(String filename) {
        MAtrix m = new MAtrix();
        imp.doPaint(m);
        System.out.println(filename+",格式为JPG");
    }
}
