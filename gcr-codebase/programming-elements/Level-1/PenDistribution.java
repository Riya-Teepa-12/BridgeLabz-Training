class PenDistribution{
   public static void main(String []args){
     //Total numbers of pen
     int totalPens=14;
     //Number of students among this pen is distributed
     int studentNumber=3;
     //total distributed pens 
     int DistributedPens= 14/3;
     // total non-distributed pens 
     int nondistributedPens= 14%3;
     //displaying pen per student and the remaining pen 
     System.out.println("The Pen Per Student is" + DistributedPens + "and the remaining pen not distributed is" + nondistributedPens );
    }
}