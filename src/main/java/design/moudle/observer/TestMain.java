package design.moudle.observer;

/**
 * Created by zhuqiang on 16/10/23.
 */
public class TestMain {
    public static  void main(String[] args){
        Observer observer =new CurrentCondition();
        WatcherData subject=new WatcherData();

        subject.observerRegister(observer);
        subject.setDataChange("fr","s","rf");
        System.out.println("removed");
        subject.observerRemove(observer);
        subject.setDataChange("fr","s","rf");

    }
}
