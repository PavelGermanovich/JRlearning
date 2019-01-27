package lambdaLearning;

import javax.sound.sampled.Line;

public class LabmdaExercise1 {

    @FunctionalInterface
    public interface SomeInterface{
        public boolean returnBoolean(int i);
    }

    @FunctionalInterface
    public interface LineInterface{
        public String returnOneString(String s1, String s2);
    }

    @FunctionalInterface
    public interface FloatTake{
        public float returnFloat(float f1, float f2, float f3);

    }


    public static void main(String[] args){
        SomeInterface someInterface = (i)->{
            return (i%13)==0;
        };

        LineInterface lineInterface = (s1, s2) -> {
            return s1.length()>s2.length()? s1: s2;
        };



    }
}
