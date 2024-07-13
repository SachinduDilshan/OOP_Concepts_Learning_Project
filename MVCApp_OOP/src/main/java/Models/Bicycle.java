package Models;

public class Bicycle { //identity(who am i)

    //what do i know(Data)
    private int Gear;
    private float Speed;
    //what can i do(methods)
    public Bicycle(int Gear, float Speed) {
        this.Gear = Gear;
        this.Speed = Speed;
    }

    public int getGear() {
        return Gear;
    }

    public float getSpeed() {
        return Speed;
    }

    public void applyBrakes(float decrement) {
        this.Speed -= decrement;
    }

    public void speedUp(float increment) {
        this.Speed += increment;
    }

    @Override
    public String toString() {
        return "Current Speed " + this.Speed + " Gear is " + this.Gear;
    }

}
