class task7 {
    public static void main(String[] args) {
    // 2. Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate, using setter getter method and print the values.
    // simple_interest total=new simple_interest();
    // total.setPrinciple(100000);
    // total.setRate(3);
    // total.setTime(2);

    // int bbb=(100000*3*2)/100;
    // System.out.println("Total money :"+ bbb);



    // 3. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
    dd dog1 = new dd("Buddy", "Golden Retriever");
    dd dog2 = new dd("Max", "Bulldog");

    System.out.println("Dog 1 - Name: " + dog1.getName() + ", Breed: " + dog1.getBreed());
    System.out.println("Dog 2 - Name: " + dog2.getName() + ", Breed: " + dog2.getBreed());

    }
}


// class simple_interest{
//     private int principle;
//     private int time;
//     private int rate;

//     public int getPrinciple(){
//         return principle;
//     }
//     public void setPrinciple(int principle){
//         this.principle=principle;
//     }

//     public int getTime(){
//         return time;
//     }
//     public void setTime(int time){
//         this.time=time;
//     }

//     public int getRate(){
//         return rate;
//     }
//     public void setRate(int rate){
//         this.rate=rate;
//     }
// }


class dd{
    private String name;
    private String breed;

    public dd(String name, String breed){
        this.name=name;
        this.breed=breed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }

}