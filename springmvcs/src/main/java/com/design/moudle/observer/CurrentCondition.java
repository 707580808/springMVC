package com.design.moudle.observer;

/**
 * Created by zhuqiang on 16/10/23.
 */
public class CurrentCondition implements Observer {
    private String tem;
    private String hum;
    private  String pre;

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
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

    public void update(String tem, String hum, String pre) {
       this.setTem(tem);
        this.setHum(hum);
        this.setPre(pre);
        this.display();
    }

    @Override
    public String toString() {
        return "CurrentCondition{" +
                "tem='" + tem + '\'' +
                ", hum='" + hum + '\'' +
                ", pre='" + pre + '\'' +
                '}';
    }
    public  void display(){
        System.out.println(this.toString());
    }
}
