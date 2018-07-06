public class GenericBounded {
    public static void main(String[] args) {
        Sum<Integer> sum1 = new Sum<Integer>(new Integer(1), new Integer(2));
        Sum<Integer> sum2 = new Sum<Integer>(2,5); //autoboxing
        Sum<Float> sum3 = new Sum<Float>(4.06f, 9.67f);
        Sum<Double> sum4 = new Sum<Double>(7.8, 5.66);
        Sum<Byte> sum5 = new Sum<Byte>((byte)0x1,(byte)0x2);

        System.out.println("The result of sum1: " + sum1.addNums());
        System.out.println("The result of sum2: " + sum2.addNums());
        System.out.println("The result of sum3: " + sum3.addNums());
        System.out.println("The result of sum4: " + sum4.addNums());
        System.out.println("The result of sum5: " + sum5.addNums());
    }
}

class Sum<T extends Number> {
    private T value1;
    private T value2;

    Sum(T val1, T val2) {
        this.value1 = val1;
        this.value2 = val2;
    }

    double addNums() {
        return (value1.doubleValue() + value2.doubleValue());
    }
}
