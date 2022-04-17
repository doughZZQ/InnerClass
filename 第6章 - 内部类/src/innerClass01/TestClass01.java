package innerClass01;

public class TestClass01
{
    private String name;
    private int age;

    public TestClass01(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public  TestClass01()
    {

    }

    {
        System.out.println("初始化块。");
    }
    static
    {
        System.out.println("静态初始化块。");
    }

    public void method01()
    {
        class Inner01 //局部内部类
        {
            private String name = "zyq";

            public void func01()
            {
                System.out.println("name = " + TestClass01.this.name + ", age = " + age);
                System.out.println(this.name);
                method02();
            }
        }

        Inner01 in = new Inner01();
        in.func01();
    }

    public void method02()
    {
        System.out.println("method02()");
    }

//    public class InnerClass01
//    {
//        public InnerClass01()
//        {
//
//        }
//
//        public void Test1()
//        {
//            System.out.println(name + "：" + age);
//        }
//    }
}
