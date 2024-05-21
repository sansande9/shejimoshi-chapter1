package edu.cqie.zhuangshi;

public abstract class PhotoFrame extends Picture{
    protected Picture picture;

    public void setPicture(Picture picture) {
        this.picture = picture;
    }

    @Override
    public void show(){
        if(picture!=null){
            this.picture.show();
        }
        this.frameShow();
    }
    public abstract void frameShow();
}
