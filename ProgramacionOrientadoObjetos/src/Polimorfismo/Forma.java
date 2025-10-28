package Polimorfismo;

public abstract class Forma {
        private String nombre;

        public Forma(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public abstract double calcularArea();
        public abstract double calcularPerimetro();

    }

