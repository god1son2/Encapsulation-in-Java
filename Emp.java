public class Emp{
    private int age;
    void setAge(int age)
    {
        if(age>100)
        this.age=100;
        else if(age<0)
        this.age=0;
        else
        this.age=age;
    }
    int getAge(){
        return age;
    }
}
class Demo{
    public static void main(String arg[])
    {

    
    Emp e=new Emp();
    e.setAge(200);
    int x=e.getAge();
    System.out.println(x);
    }
}