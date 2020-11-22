/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fosalud;

import java.util.LinkedList;

/**
 *
 * @author NeoPunk
 */
public class Administrar {

    //LinkedList que guardara las unidades
    LinkedList<Unidades> listUnidades = new LinkedList<>();

    //Constructor que carga la lista
    public Administrar() {
        //Unidades de Cabañas
        AgregarUnidad("UCSF Cinquera", "Cabañas", "Cinquera", "2389-5718", "Final Calle principal del municipio, Cinquera, Cabañas.");
        AgregarUnidad("UCSF Jutiapa", "Cabañas", "Jutiapa", "2389-4009", "Entrada a Jutiapa, Cabañas.");
        AgregarUnidad("UCSF Sensuntepeque", "Cabañas", "Sensuntepeque", "2382-1340", "5ta. Av. Sur, Bo. El Calvario, Contiguo a Centro de Gob., Sensuntepeque.");
        AgregarUnidad("UCSF Ciudad Dolores", "Cabañas", "Ciudad Dolores", "2389-9020", "Final Av. Libertad, Bo. El Calvario, Dolores, Cabañas.");
        //Unidades de La Paz
        AgregarUnidad("UCSF Olocuilta", "La Paz", "Olocuilta", "2330-6006", "Av. Demtrio Hernández, Bo. El Calvario, Olocuilta, La Paz.");
        AgregarUnidad("UCSF San Luis Talpa", "La Paz", "San Luis Talpa", "2355-8869", "Carretera Litoral, Bo. El Calvario, San Luis Talpa.");
        AgregarUnidad("UCSF San Luis La Herradura", "La Paz", "San Luis La Herradura", "2365-0045", "Prolongación Calle Principal, Barrio Guadalupe #19, San Luis La Herradura.");
        AgregarUnidad("UCSF El Zapote - Costa del Sol", "La Paz", "San Luis La Herradura", "2338-0257", "KM.70, Boulevard Costa del Sol, cantón El Zapote, La Paz.");
        AgregarUnidad("UCSF San Juan Nonualco", "La Paz", "San Juan Nonualco", "2330-1010", "Calle al Golfo, Barrio Santa Rita, San Juan Nonualco.");
        AgregarUnidad("UCSF Periférica de Zacatecoluca", "La Paz", "Zacatecoluca", "2334-1941", "Cantón El Espino Arriba, Km. 84, Carretera a San Vicente, Zacatecoluca.");
        AgregarUnidad("UCSF San Emigdio", "La Paz", "San Emigdio", "2379-2574", "Calle principal, Bo. El Centro, contiguo a Iglesia Católica, San Emigdio.");
        //Unidades de San Vicente
        AgregarUnidad("UCSF San Sebastián", "San Vicente", "San Sebastián", "2333-9002", "Col.Santa Cecelia, Bo.Guadalupe, San Sebastián, San Vicente.");
        AgregarUnidad("UCSF Santa Clara", "San Vicente", "Santa Clara", "2389-7151", "Bo. Concepción, salida a San Indelfonso, Santa Clara, San Vicente.");
        AgregarUnidad("UCSF San Esteban Catarina", "San Vicente", "San Esteban Catarina", "2362-7003", "Bo. Concepción, Fin 6a. Av. Nte., San Esteban Catarina, San Vicente.");
        AgregarUnidad("UCSF Apastepeque", "San Vicente", "Apastepeque", "2362-5205", "2ª.Av. Sur, Bo. los Angeles, Apastepeque, San Vicente.");
        AgregarUnidad("UCSF Periférica de San Vicente", "San Vicente", "San Vicente", "2393-1246", "Final 5ª Calle Ote. Bo. El Santuario, frente a INDES, San Vicente.");
        AgregarUnidad("UCSF Verapaz", "San Vicente", "Verapaz", "2396-3012", "Bo. Mercedes, Verapaz, Salida a Guadalupe, San Vicente.");
        AgregarUnidad("UCSF Tecoluca", "San Vicente", "Tecoluca", "2362-4206", "Kilómetro 72, carretera de Zacatecoluca a San Vicente, B° Las Flores, Tecoluca, San Vicente.");
        AgregarUnidad("UCSF San Nicolás Lempa", "San Vicente", "Tecoluca", "2632-2732", "Carretera del Litoral Km.87, C/San Nicolás Lempa, Tecoluca San Vicente.");
    }

    //Metodo que almacena las unidades
    public final void AgregarUnidad(String nombre, String depto, String municipio, String telefono, String direccion) {
        Unidades unidad = new Unidades(nombre, depto, municipio, telefono, direccion);
        listUnidades.add(unidad);
    }

    //Metodo que busca (y devuelve) todas las unidades que sean del municipio especificado
    public LinkedList<Unidades> BuscarUnidades(String dpto) {
        LinkedList<Unidades> unidadesxDpto = new LinkedList<>();

        for (Unidades unidad : listUnidades) {
            if (unidad.getDepartamento().equals(dpto)) {
                unidadesxDpto.add(unidad);
            }
        }
        
        //Retorno de la lista con "N" unidades
        return unidadesxDpto;
    }
}
