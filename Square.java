public class Square extends Rectangle {
  Square(){
    super();
  }
public double getarea(){
  if(width==height)
  return width*width;
  else{
    return 0;
  }
}
    public double getpre(){
      if(width==height)
    return width*4 ;
    else{
      return 0;
    }
}
}
