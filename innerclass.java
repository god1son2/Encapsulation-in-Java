 class Emp{
    private int age;
    void setAge(int age)
    {
        if(age    >100)
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
    Emp e=new Emp();
    public static void main(String arg[])
    {
        Demo d=new Demo();
        d.e.setAge(50);
        int a= d.e.getAge();
        System.out.println(a);
    }
}

