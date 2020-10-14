class Avenger
{
   
       String name,weapon,planet,power;
       int age;
    public static void main(String[] args) {
        Avenger []obj=new Avenger[5];
      
       for(int i=0;i<=4;i++)
       {
           obj[i]=new Avenger();
       }
       obj[0].getDetails("Ironman","Intelligence","A.I","Earth",40);
       obj[0].displayDetails();
       obj[1].getDetails("Hulk","Strength","Gama","Earth",38);
       obj[1].displayDetails();
       obj[2].getDetails("Dr.Strange","Magic","TimeStone","Earth",41);
       obj[2].displayDetails();
       obj[3].getDetails("Antman","Nulear","Physics","Earth",44);
       obj[3].displayDetails();
       obj[4].getDetails("CaptainAmerica","Strenth","Shield","Earth",100);
       obj[4].displayDetails();
     
       
     
     
     
       


    }
       public void getDetails(String name,String power,String weapon,String planet,int age) 
       {
           this.name=name;
           this.power=power;
           this.weapon=weapon;
           this.planet=planet;
           this.age=age;
           

       
       } 
       public void displayDetails() 
       {
           System.out.println("1]Name: "+ name +" 2]Power: "+ power +" 3]Planet: "+ planet + " 4]Weapon: "+ weapon +" 5]Age: "+ age);
        //    System.out.println("Power "+power);
        //    System.out.println("Planet "+planet);
        //    System.out.println("Weapon "+weapon);
       // System.out.println("Age "+age);
       
       } 
}