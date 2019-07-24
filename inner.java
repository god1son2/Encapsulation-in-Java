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

