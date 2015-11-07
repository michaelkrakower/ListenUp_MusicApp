package musicnow.listenup;

/*
*  Person.class
*  Made to store information gathered from survey
*  @author mike krakower
*  11/6/2015
* */
public class Person {
    public int A; // tracks personality type A
    public int B; // tracks personality type B
    public int C; // tracks personality type C
    public Person() { // creates person object
        A=0; // sets A to 0
        B=0; // b to zero
        C=0; // c to zero
    }
    public int getA(){
        return A;
    } // function returns A value

    public int getB(){
        return B;
    } // returns B value

    public int getC(){
        return C;
    } // returns C value

    public void aInc(){
        A++;
    } // adds A points

    public void bInc(){ B++;} // adds B points

    public void cInc(){
        C++;
    } // adds C points
}
