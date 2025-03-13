package matematicas;

/**
 * Métodos matemáticos
 * */
public class mates {

    /**
     * 1.-Devuelve verdadero si el número que se pasa como parámetro
     * es capicúa y falso en caso contrario.
     *
     * @param x Número a comprobar
     *
     * @return Boolean
     * */
    public static boolean esCapicua (int x){
//        Var
        boolean es=false;
        int invert;

//        Body


        invert = voltea(x);


        //System.out.println(x+" "+invert);

        if(invert==x)
            es =true;

//        End
        return es;
    }

    /**
     * 2.- Devuelve verdadero si el número que se pasa como parámetro
     * es primo y falso en caso contrario.
     * @param x Número a comprobar
     *
     * @return Boolean
     * */
    public static boolean esPrimo (int x){
//        Var
        boolean es=true;
        int i, contador=0;

//        Body

        if((x>0) && (x<3));
        else {

        for (i=2 ; i < x; i++) {
            if((x%i)==0)
                contador++;
        }
        if (contador>0)
            es = false;
}

//        End
        return es;
    }

    /**
    * 3.-Devuelve el menor primo que es mayor al número que
    * se pasa como parámetro.
    * @param x Número desde el que se empieza a buscar el siguiente primo
    * @return Int, el siguiente numero primo
    * */
    public static int siguientePrimo(int x){
//        Var
        int siguientenum = x+1;
//        Body
        while (!esPrimo(siguientenum))
            siguientenum++;

//        End
        return siguientenum;
    }

    /**
     * 4.-Dada una base y un exponente devuelve la potencia.
     * @param base La base de la potencia
     * @param pot El exponente de la potencia
     * @return Int, el resultado de la potencia
     * */
    public static int potencia(int base, int pot){
//        Var
        int res=1, i;
//        Body
        for (i = 0; i < pot; i++) {
            res*=base;
        }
//        End
        return res;
    }

    /**
     * 5.-Cuenta el número de dígitos de un número entero.
     * @param x El número el cual se quiere saber el dígito
     * @return Int, la cantidad de digitos
     * */
    public static int digitos(int x){
//        Var
        int digitos=1, aux=9;

//        Body
        while (aux<x) {
            aux*=11;
            digitos+=1;

        }

//        End
        return digitos;
    }

    /**
     * 6.-Le da la vuelta a un número
     * @param x El número que se quiere voltear
     * @return Int, el número volteado
     * */
    public static int voltea(int x){
//        Var
        int vuelta=0, tamanio=9, cont=1, pos=10, aux;;
//        Body

        pos = potencia(10, digitos(x));
        tamanio = pos -1;
        //System.out.println(tamanio+" "+pos);

        aux = x;

        while (aux > 0){
            if(x>tamanio){
                vuelta += (aux/pos)*cont;
                aux -= (aux/pos)*pos;
                cont *=10;
            }
            pos /=10;
            tamanio/=10;

        }

//        End
        return vuelta;
    }

    /**
     * 7.-Devuelve el dígito que está en la posición n de un número entero.
     * Se empieza contando por el 0 y de izquierda a derecha.
     *
     * @param x El número en el que se busca
     * @param digi La posición en la que se encuentra
     * @return Int, el valor del digito especificado
     * */
    public static int digitoN(int x, int digi){
//        Var
        int digito, posDer, pos10=1, aux;
//        Body

        digi +=1;

        posDer = digitos(x) - digi;

        pos10 = potencia(10,posDer);

        aux = ((x/pos10)*pos10)-((x/(pos10*10))*(pos10*10));

        digito =aux/potencia(10,posDer);

//        End
        return digito;
    }

    /**
     * 8.-Da la posición de la primera ocurrencia de un dígito
     * dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param num Número en el que se busca
     * @param digi Número que se busca
     * @return Int, la posición en la que se encuentra (en el caso de que no se encuentre retorna -1)
     * */
    public static int posicionDeDigito(int num, int digi){
//        Var
        int  ret= -1, total;
//        Body

        total= digitos(num);

        for (int i = 0; i < total; i++) {
            if (digi==digitoN(num, i)){
                ret = i;
                break;
            }

        }

//        End
        return ret;
    }

    /**
     * 9.-Le quita a un número n dígitos por detrás (por la
     * derecha).
     * @param num Un número
     * @return Int, el número modificado
     * */
    public static int quitaPorDetras(int num){
//        Var
        int ret;
//        Body

        ret = (int)num/10;

//        End
        return ret;
    }

    /**
     * 10.-Le quita a un número n dígitos por delante (por la
     * izquierda).
     * @param num Un número
     * @return int, el número modificado
     * */
    public static int quitaPorDelante(int num){
//        Var
        int ret, origin;

//        Body
        origin = digitos(num)-1;

        ret = voltea(num);
        ret =quitaPorDetras(ret);
        ret = voltea(ret);

        if(origin!=digitos(ret)){
            ret= ret*(potencia(10,(origin-digitos(ret))));
        }

//        End
        return ret;
    }

    /**
     * Añade un dígito a un número por detrás.
     * @param num Un número
     * @param digi El número que se añadr detrás
     * @return Int, el número modificado
     * */
    public static int pegaPorDetras(int num, int digi){
//        Var
        int ret;
//        Body

        ret = num *10;
        ret += digi;

//        End
        return ret;
    }

    /**
     * Añade un dígito a un número por delante.
     * @param num Un número
     * @param digi El número que se añadirá delante
     * @return Int, El número modificado
     * */
    public static int pegaPorDelante(int num, int digi){
//        Var
        int ret, pos;
//        Body

        pos = potencia(10, digitos(num));

        ret = (pos*digi)+num;

//        End
        return ret;
    }

    /**
     * 13.-Toma como parámetros las posiciones inicial y final
     * dentro de un número y devuelve el trozo correspondiente.
     * @param num Un número
     * @return Int, el número modificado
     * */
    public static int trozoDeNumero(int num){
//        Var
        int ret;

//        Body

        ret = quitaPorDelante(num);
        ret = quitaPorDetras(ret);

//        End
        return ret;
    }

    /**
     * 14.-Pega dos números para formar uno.
     * @param num1 Primer número
     * @param num2 Segundo número
     * @return Int, la concatenación de los dos números
     * */
    public static int juntaNumeros(int num1, int num2){
//        Var
        int ret, pos;
//        Body

        pos = potencia(10, digitos(num2));
        num1*=pos;

        ret = num1+num2;

//        End
        return ret;
    }

}