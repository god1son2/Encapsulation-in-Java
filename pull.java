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
        return age;}
 }
    