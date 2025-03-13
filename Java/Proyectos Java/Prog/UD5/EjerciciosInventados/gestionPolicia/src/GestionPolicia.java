import Policia.Arma;
import Policia.Oficina;

/**
 * <h1>GestionPolicia.java</h1><hr>
 * <p>Esta clase represanta el main del programa, en el que vamos a gestionar varias centrales de polica</p>
 * <pre>Estación de policía

    Clases:

    Vehiculos
    Oficinas
    Armas
    Agentes
    Equipos



    --Agente--
    Atributos
    - String nombre
    - int edad
    - float salario(mensual)

    Metodos
    - (solo tostring)

    -------------

    -- Armas --
    Atributos
    - Tipo ((enum) rifle, cuchillo, pistola)
    - Balas Rifle = 100, cuchillo = 0 pistola = 50)(usariamos constantes para balas y asi recargar, veremos mas tarde)

    Metodos
    + Disparar(boolean true false)(Se activa con un random de 50%)(gastar un random entre 10 y 20 en caso de ser rifle o pistola)

    --------------

    --Equipo--
    Atributos
    - Agente[5]
    - UltimoInforme

    Metodos
    - Añadir agentes
    - generar informe

    --------------

    --Armas--

    Atributos
    - Tipo ((enum) rifle, cuchillo, pistola)
    - Balas Rifle = 100, cuchillo = 0 pistola = 50)(usariamos constantes para balas y asi recargar, veremos mas tarde)

    Metodos
    + Disparar(boolean true false)(Se activa con un random de 50%)(gastar un random entre 10 y 20 en caso de ser rifle o pistola)

    --------------

    --Vehiculos--

    Atributos
    - Matricula (obligar al usuario a que sean 4 numeros seguidos de 3 letras) 1234ABC
    - tipo(Todoterreno, Moto, Coche)(enum)
    - Autonomia (Todoterreno = 100km, coche = 200km, Moto = 150km)(usariamos constantes para autonomia, y asi recargar el tanque, veremos mas tarde)

    Metodos

    + Conducir (random de distancia, entre 10 y 30, si la distancia es mayor a la autonomia, es necesario rellenar el tanque)
    + RellenarTanque()

    --------------

    --Oficinas--

    Atributos
    Const Localidad
    Equipos[3]
    Armas[50]
    Vehiculos[10]
    Sueldos

    Metodos
    Crear equipo
    Comprar armas(lote de un random de entre 10 y 30 armas, que se crearan automaticamente
    Comprar coches(lote de un random de entre 1 y 6 vehiculos que se crearan automaticamente
    Contratar agente
    Ir de mision(2 agentes del mismo equipo, 2 armas y 1 coches)
    (dentro de este, interactuaran las armas y los vehiculos segun lo establecido)
    (mostrar informe al final)

    Transferir agente (De un equipo a otro)

    NOTA: como solo habra 3 tipos de vehiculos y 3 tipos de armas, solo se mostraran los 3 tipos y su cantidad que hay de ellos con autonomia suficiente para la mision</pre>
 *
 * @author Adrián Suárez Valdayo
 * @vesrion 16-abr-2024
 */
public class GestionPolicia {
    public static void main(String[] args) {

        Oficina oficina = new Oficina();





    }
}