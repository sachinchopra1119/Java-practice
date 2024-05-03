 class MyEmployee{
     private int id;
     private String name;

     public String getName() {
         return name;
     }
     public void setName(String n) {
         name = n;
     }
     public void setId(int i) {
         id = i;
     }

     public int getId() {
         return id;
     }}

     public class stringPrac {
         public static void main(String[] args) {
             MyEmployee harry = new MyEmployee();
             harry.setName("sachin");
             System.out.println(harry.getName());
             harry.setId(90);
             System.out.println(harry.getId());
         }
     }
