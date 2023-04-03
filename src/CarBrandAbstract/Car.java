package CarBrandAbstract;

public abstract class Car {
    public abstract String model();
}
abstract class Toyota extends Car {
    public abstract void motor();
}
abstract class Corolla extends Toyota{
    public String model(){
        return "Corolla";
    }
}
