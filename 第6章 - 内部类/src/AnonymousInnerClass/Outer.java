package AnonymousInnerClass;

public class Outer
{
    public void method()
    {
        IA tiger = new IA()
        {
            @Override
            public void cry()
            {
                System.out.println("老虎叫唤...");
            }
        };

        tiger.cry();
        System.out.println(tiger.getClass());

        IA dog = new IA()
        {
            @Override
            public void cry()
            {
                System.out.println("小狗汪汪...");
            }
        };


        dog.cry();

        System.out.println(dog.getClass());
    }
}


interface IA
{
    //public static final int ABC =10;
    public void cry();
}
