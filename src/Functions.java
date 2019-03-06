public class Functions {

 private double volumesphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3) * 4/3.0;
        return volume;
    }




    public static double areacircle(double radius){


        double area = 22/7.0 *radius*radius;
        System.out.println(area);
        return area;

    }

    public static void main(String[] args) {
   //objects== variables
        Functions f=new Functions();
        System.out.println(f.volumesphere(5));
        double v = f.volumesphere(11);











        /*     areacircle(7);
        areacircle(6.5);
        areacircle(106.43);

        double result = areacircle(11.1548);
        System.out.println(Math.round(result));
        System.out.println(result*3);
        */












    }
}
