public class Rectangle {
    protected double width;
    protected double height;
    public Rectangle(){
        width=0;
        height=0;
    }
    public void setwidth(double w){
        if(w>0)
        width=w;
    }
    public void setheight(double l){
        if(l>0)
        height=l;
    }
    public double getwidth(){
        return width;
    }
    public double getheight(){
        return height;
    }
    public double getpre(){
        return (width+height)*2;
    }
    public double getarea(){
        return (width*height);
    }
}
