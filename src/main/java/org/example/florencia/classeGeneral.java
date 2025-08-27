package org.example.florencia;

public class classeGeneral {

        public static void main(String[] args) {
            trabajador t = new trabajador();
            t.setNombre("Diego");
            t.setApellido("Santos");
            t.setEdad(30);
            t.setGenero('M');

            System.out.println(t); // usa toString()
        }
}
