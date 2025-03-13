/**
 * <h1>GestorBanco.java</h1><hr>
 * <p>Esta clase represanta el main del programa</p>
 *
 * <pre>3. Define una clase abstracta Cuenta con los siguientes atributos:
 numerocuenta : entero largo
 saldo : double
 cliente : atributo de la clase Persona (que tiene nombre y apellidos, y NIF).
y con los siguientes métodos:
 Constructor parametrizado que recibe un cliente y un número de cuenta
 Accedentes para los tres atributos
 ingresar(double): permitirá ingresar una cantidad en la cuenta.
 abstract retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo). No se
implementa, depende del tipo de cuenta
 actualizarSaldo(): actualizará el saldo de la cuenta, pero cada cuenta lo hace de una forma
diferente
Define las subclases de Cuenta que se describen a continuación:
 CuentaCorriente: Cuenta normal con un interés fijo del 1.5%. Incluir constructor parametrizado
y método toString().
 CuentaAhorro: Esta cuenta tiene como atributos el interés variable a lo largo del año y un saldo
mínimo necesario. Al retirar dinero hay que tener en cuenta que no se sobrepase el saldo
mínimo. Incluir constructor parametrizado, método toString() y método para cambiar el interés.</pre>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 24-abr-2024
 */
public class GestorBanco {
    public static void main(String[] args) {

    }
}