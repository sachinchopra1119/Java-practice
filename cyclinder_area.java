class cyc {
    public int radius ;
    public int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*3.14*radius+2*3.14*radius*height;
    }
}
  class Cyclinder_area{
    public static void main(String[] args) {
        cyc obj=new cyc();
        obj.setHeight(10);

        System.out.println("height of the cylinder: "+obj.getHeight());
        obj.setRadius(4);
        System.out.println("radius of the cylinder :"+obj.getRadius());
        System.out.println("surface area : " +obj.surfaceArea());


    }
}
