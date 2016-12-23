public class Operacion
{
    //Se definen los atributos privados
    private float a; //a de tipo float
    private float b; //b de tipo float
    //Se definen los dos varibles de tipo float
    //porque al momento de realizar la division
    //el resultado por lo general sera decimal.
    
    public Operacion()
    {
        //En el contructor de la clase Operacion
        //se le asignaran los siguiente valores a
        //los atributos:
        a = 0;
        b = 0;
    }

    //Implementacion del metodo suma
    public float suma()
    {
        return a+b;
    }

    //Implementacion del metodo resta
    public float resta()
    {
        return a-b;
    }

    //Implementacion del metodo multiplicación
    public float multiplicacion()
    {
        return a*b;
    }

    //Implementacion del metodo división
    public float division()
    {
        return a/b;
    }

    //Implementacion de los metodos Setters y Getters ó
    //Modificadores y selectores

    //metodo modificador del atributo "a" se le asignara un
    //parametro de tipo float.
    public void setA(float val)
    {
        a = val;//se le asigna a "a" el valor de "val".
    }

    //metodo selector del atributo "a"
    public float getA()
    {
        return a;//retornara el valor de "a"
    }

    //metodo modificador del atributo "b" se le asignara un
    //parametro de tipo float.
    public void setB(float val)
    {
        b = val;//se le asigna a "b" el valor de "val".
    }

    //metodo selector del atributo "b"
    public float getB()
    {
        return b; //retornara el valor de "b"
    }
}