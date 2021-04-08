package clases;

import java.util.ArrayList;

public class Arreglo_Empleado {

    private ArrayList<Empleado> lista;

    public Arreglo_Empleado() {

        lista = new ArrayList();

        lista.add(new Programador(4, "JavaScript", 24, "Alexander", 1200));
        lista.add(new Programador(4, "React", 21, "Fiorela", 1600));
        lista.add(new Programador(4, "Angular", 25, "Juan", 1800));
        lista.add(new Programador(4, "Vue", 26, "Carla", 2100));
        lista.add(new Programador(4, "NodeJS", 22, "Paul", 2450));
        lista.add(new Programador(4, "Python", 30, "Flor", 2500));
        lista.add(new Programador(4, "Java", 20, "Maricielo", 2800));

    }

    public void adi_Programador(Programador p) {

        lista.add(p);
    }

    public ArrayList<Empleado> listado() {

        return lista;
    }

    public Empleado busca(int cod) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).codigo == cod) {

                return lista.get(i);

            }

        }

        return null;
    }

}
