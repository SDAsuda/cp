public class Constructor {
     private String name;
     private String color;
     private double weight;
     private int age;

     public static void main(String[] args) {
         Constructor val = new Constructor("suda", "red", 120, 23);
         System.out.println(val.getName());
     }

     public Constructor(String name, String color) {
         this.name = name;
         this.color = color;
     }

     public Constructor(String name, String color, double weight, int age) {
         this(name, color);
         this.weight = weight;
         this.age = age;         
     }

     public String getName() {
         return this.name;
     }
}