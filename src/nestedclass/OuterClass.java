package nestedclass;

public class OuterClass {
    InnerClassA innerA = new InnerClassA();


    public void outerMethodA(){
        System.out.println("OuterClassA MethodA");
        innerA.innerAMethodA();
    }
    public void outerMethodB(){
        System.out.println("OuterClassB MethodB");
    }

    public class InnerClassA{

        public void innerAMethodA(){
            System.out.println("InnerA Method");

        }

        private void innerAMethodB(){
            System.out.println("InnerA Method");
        }

    }

    public class InnerClassB{

        public void innerBMethodA(){
            System.out.println("InnerB Method");

        }

        public void innerBMethodB(){
            System.out.println("InnerB Method");
        }

    }
}
