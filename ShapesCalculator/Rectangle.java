public class Rectangle {
    protected double width;
    protected double height;
    public Rectangle(){
        width=0;
        height=0;
    }
    public Rectangle(double width, double height) {
        if(width>0 && height>0){
            this.width = width;
            this.height = height;
        }  
    }
    public void setwidth(double w){
        if(w>0)
        width=w;
        else{
            width=0;
        }
    }
    public void setheight(double l){
        if(l>0)
        height=l;
        else{
            height=0;
        }
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
