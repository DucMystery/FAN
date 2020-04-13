public class FAN {

    final int SLOW =1;
    final int MEDIUM =2;
    final int FAST =3;

    private int speed =SLOW;
    private boolean status =false;

    private double raidus =5;
    private String color ="Blue";

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMEDIUM() {
        return  this.MEDIUM;
    }

    public int getFAST() {
        return this.FAST;
    }

    public int getSLOW() {
        return this.SLOW;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public FAN(boolean status,int speed,double raidus,String color){
        this.status =status;
        this.speed =speed;
        this.raidus =raidus;
        this.color =color;
    }
    public void display(){
        if (status){
            System.out.printf("FAN cua ban co mau  %s co ban kinh la %f va toc do %d dang trang thai on",this.color,this.raidus,this.speed);
        }else {
            System.out.printf("FAN cua ban  co ban kinh %f va mau sac la %s",this.raidus,this.color);
        }
    }

}
