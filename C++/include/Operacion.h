#ifndef OPERACION_H
#define OPERACION_H


class Operacion
{
    public:
        Operacion();//Metodo constructor
        virtual ~Operacion();//Metodo destructor

        //Se definen los metodos publicos
        int suma();
        int resta();
        int multiplicacion();
        float division();
        //Se definen los metodos Setters y Getters
        //de los atributos a y b. (Encapsulamiento).
        void setA(float val);
        float getA();
        void setB(float val);
        float getB();
    protected:

    private:
        //Se definen los atributos privados
        float a; //a de tipo float
        float b; //b de tipo float
        //Se definen los dos varibles de tippo float
        //porque al momento de realizar la division
        //el resultado por lo general sera decimal.
};

#endif // OPERACION_H
