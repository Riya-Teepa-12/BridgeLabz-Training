class VolumeOfEarth{
   public static void main(String []args){
      //declaring the radius of earth
      int earthRadius=6378;
      //calculating volume of earth in kilometer
      double earthVolumeInKm= (double)(4/3)*Math.PI*Math.pow(earthRadius,3);
     // calculating volume of earth in miles
      double earthVolumeInMiles= earthVolumeInKm * 0.621371;
     //displaying the volume of earth in cubic kilometers and in cubic miles
      System.out.println("The volume of earth in cubic kilometers is" + earthVolumeInKm + "and cubic miles is" + earthVolumeInMiles);
   }
}