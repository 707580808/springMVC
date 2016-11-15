package design.moudle.observer;

import java.util.ArrayList;

/**
 * Created by zhuqiang on 16/10/23.
 */
public class WatcherData implements Subject {
    private ArrayList<Observer> arrayList;
    private String tem;
    private String hum;
    private  String pre;

    public WatcherData() {
        arrayList=new ArrayList<Observer>();
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPre() {
        return pre;
    }

    public void setPre(String pre) {
        this.pre = pre;
    }

    public String getTem() {

        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public void change(){
      this.notifyObserver();
    }

    public void observerRegister(Observer o) {
         arrayList.add(o);
    }

    public void observerRemove(Observer o) {
        if (arrayList.contains(o)){

        arrayList.remove(o);
    }
    }
    public void notifyObserver() {
       for (Observer observer:arrayList){
           observer.update(this.getTem(),this.getPre(),this.getTem());
       }
    }
    public  void setDataChange(String tem, String hum, String pre){
        this.setTem(tem);
        this.setHum(hum);
        this.setPre(pre);
        this.change();
    }
}
