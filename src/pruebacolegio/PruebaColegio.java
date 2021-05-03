/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacolegio;

/**
 *
 * @author Asus
 */
public class PruebaColegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Materia ingles = new Materia(01, "Ingles I", 1);
        Materia mat = new Materia(02, "Matematicas", 1);
        Materia lab = new Materia(03, "Laboratorio I", 1);
        
        Alumno a1 = new Alumno(1001, "Lopez", "Martin");
        Alumno a2 = new Alumno(1002, "Martinez", "Brenda");
        
        a1.agregarMateria(mat);
        a1.agregarMateria(ingles);
        a1.agregarMateria(lab);
        
        a2.agregarMateria(mat);
        a2.agregarMateria(ingles);
        a2.agregarMateria(lab);
        a2.agregarMateria(lab);
        
        System.out.println("Las materias inscriptas de Lopez son: " + a1.calcularMaterias());
        System.out.println("Las materias inscriptas de Martinez son: " + a2.calcularMaterias());
    }
    
}
