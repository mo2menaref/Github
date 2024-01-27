public class Circle {
private double radius;
final private double pi=Math.PI;
public Circle(){
    radius=0;
}
public void setRadius(double rad) {
    if(rad>0){
    radius = rad;
    }
    else{
    radius=0;
    }
}
public double getRadius(){
    return radius;
}
public double getarea(){
    return radius*radius*pi;
}
public double getpre(){
    return 2*radius*pi;
}
}
