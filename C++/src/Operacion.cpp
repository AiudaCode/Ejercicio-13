#include "Operacion.h"

Operacion::Operacion()
{
    //En el contructor de la clase Operacion
    //se le asignaran los siguiente valores a
    //los atributos:
    a = 0;
    b = 0;
}

Operacion::~Operacion()
{
    //dtor
}

//Implementacion del metodo suma
int Operacion::suma()
{
    return a+b;
}

int Operacion::resta()
{
    return a-b;
}

int Operacion::multiplicacion()
{
    return a*b;
}

float Operacion::division()
{
    return a/b;
}

void Operacion::setA(float val)
{
    a = val;
}

float Operacion::getA()
{
    return a;
}

void Operacion::setB(float val)
{
    b = val;
}

float Operacion::getB()
{
    return b;
}
