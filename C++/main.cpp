#include <iostream>
//Se inclute a la clase Operacion para llamar despues
//sus metodos.
#include <Operacion.h>

using namespace std;

int main()
{
    //se crean las varibles va(valor de A) y vb
    //(valor de B) de tipo entero que seran las variables
    //que iran como argumentos o parametros en los metodos
    //de encapsulamiento.
    float va,vb;

    //Se crea un objeto de la clase Operacion (Instanciaciación)
    Operacion* obj = new Operacion();

    cout << "Digite A" << endl;//Se muestra en patalla que digite.
                               //el valor de A.
    cin >> va; //Se guarda el dato de "A" en la variable "va".
    obj->setA(va);//Se llama al metodo que encapsula el valor de A
                 //y se le asigna como parametro la variable va.

    cout << "Digite B" << endl;//Se muestra en patalla que digite.
                               //el valor de B.
    cin >> vb;//Se guarda el dato de "B" en la variable "vb".
    obj->setB(vb);//Se llama al metodo que encapsula el valor de B
                 //y se le asigna como parametro la variable vb.

    //Se llaman a los metodos getA(), getB, suma() y son mostrados en pantalla
    cout << "La suma de " << obj->getA() << " + " << obj->getB() << " = " << obj->suma() << endl;

    //Se llaman a los metodos getA(), getB, resta() y son mostrados en pantalla
    cout << "La suma de " << obj->getA() << " - " << obj->getB() << " = " << obj->resta() << endl;

    //Se llaman a los metodos getA(), getB, multiplicacion() y son mostrados en pantalla
    cout << "La suma de " << obj->getA() << " * " << obj->getB() << " = " << obj->multiplicacion() << endl;

    //Se llaman a los metodos getA(), getB, division() y son mostrados en pantalla
    cout << "La suma de " << obj->getA() << " / " << obj->getB() << " = " << obj->division() << endl;
    return 0;
}
