package jenerics;

public class OuterClassesLearning {

    public  void doSmth(){
         int pit = 3;
         class Path{
             static final int p = 3;

        }
        System.out.println("main class");
    }

    public class OuterClass{

        public int i ;
        public void doSmth(){
            int odf =3;
            OuterClassesLearning.this.doSmth();
            System.out.println("outer class"+odf);
        }
        public  class InnerClass{
              int i =3;
            public void doSmth(){
                System.out.println(i);
                OuterClass.this.doSmth();
            }
        }
    }

    public static void main(String[] args){
        OuterClassesLearning out =new OuterClassesLearning();
        out.new OuterClass().doSmth();
    }
}
