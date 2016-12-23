import javax.swing.JOptionPane;

public class Main
{
    public static void main(String[] args)
    {
        //se crean las varibles va(valor de A) y vb
        //(valor de B) de tipo float que seran las variables
        //que iran como argumentos o parametros en los metodos
        //de encapsulamiento.
        float va,vb;

        //Se crea un objeto de la clase Operacion (Instanciaciación)
        Operacion obj = new Operacion();
        
        //Se pide el dato "A" con el metodo showInputDialog que permite mostrar
        //un cuadro de dialog con una barra para ingresar el dato
        //Se debe convertir a Float porque el metodo showInputDialog convertira
        //el dato que se ingrese a Strin, es por eso que se utiliza el metodo
        //parseFloat para convertirlo y asi poder realizar operaciones como
        //la suma, resta, ect.
        va = Float.parseFloat(JOptionPane.showInputDialog(null, "Digita A"));
        obj.setA(va);//Se llama al metodo que encapsula el valor de A
                     //y se le asigna como parametro la variable va.

        vb = Float.parseFloat(JOptionPane.showInputDialog(null, "Digita B"));
        obj.setB(vb);//Se llama al metodo que encapsula el valor de B
                     //y se le asigna como parametro la variable vb.

        //Se llaman a los metodos getA(), getB, suma() y son mostrados en pantalla con el metodo
        //showMessageDialog()
        JOptionPane.showMessageDialog(null, "La suma de " + obj.getA() + " + " + obj.getB() + " = " + obj.suma());

        //Se llaman a los metodos getA(), getB, resta() y son mostrados en pantalla
        JOptionPane.showMessageDialog(null, "La resta de " + obj.getA() + " - " + obj.getB() + " = " + obj.resta());

        //Se llaman a los metodos getA(), getB, multiplicacion() y son mostrados en pantalla
        JOptionPane.showMessageDialog(null, "La multiplicacion de " + obj.getA() + " * " + obj.getB() + " = " + obj.multiplicacion());

        //Se llaman a los metodos getA(), getB, division() y son mostrados en pantalla
        JOptionPane.showMessageDialog(null, "La division de " + obj.getA() + " / " + obj.getB() + " = " + obj.division());
    }

}