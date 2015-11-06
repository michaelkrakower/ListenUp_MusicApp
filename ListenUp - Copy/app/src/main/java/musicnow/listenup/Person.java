package musicnow.listenup;

/**
 * Created by Michael on 11/5/2015.
 */
public class Person {
    public int A;
    public int B;
    public int C;
    public Person() {
        A=0;
        B=0;
        C=0;
    }
    public int getA(){
        return A;
    }

    public int getB(){
        return B;
    }

    public int getC(){
        return C;
    }

    public void plusA(){
        A++;
    }

    public void plusB(){
        B++;
    }

    public void plusC(){
        C++;
    }
}
