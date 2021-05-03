package pruebacolegio;

public class Materia {

    private int idMateria;

    private String materia;

    private int anio;

    public Materia(int idMateria, String materia, int anio) {
        this.idMateria = idMateria;
        this.materia = materia;
        this.anio = anio;
    }

    @Override
    public String toString() {
        return materia;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.idMateria;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Materia other = (Materia) obj;
        if (this.idMateria != other.idMateria) {
            return false;
        }
        return true;
    }

    
    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
