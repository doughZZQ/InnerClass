package StaticInnerClass;

public class ArrayAlg
{
    public static class Pair //静态内部类
    {
        private double first;
        private double second;

        public Pair(double first, double second)
        {
            this.first = first;
            this.second = second;
        }

        public double getFirst()
        {
            return first;
        }

        public double getSecond()
        {
            return second;
        }
    }

    public static Pair minmax(double[] values)
    {
        double min = Double.POSITIVE_INFINITY;
        double max = Double.NEGATIVE_INFINITY;
        for (double d : values)
        {
            if (d < min) min = d;
            if (d > max) max = d;
        }
        return new Pair(min, max);
    }
}
