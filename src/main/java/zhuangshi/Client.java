package zhuangshi;

public class Client {
    public static void main(String[] args) {
        Picture dogpic = new DogPhoto();
        PhotoFrame blueFrame = new BlueFrame();
        PhotoFrame redFrame = new RedFrame();
        blueFrame.setPicture(dogpic);
        redFrame.setPicture(blueFrame);
//        blueFrame.show();
        redFrame.show();



    }
}
