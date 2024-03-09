public class Work {
    public String work_name;
    public String duration;
    public String name_in_charge;
    public String estado;

    public Work(String work_name, String duration, String name_in_charge, String estado) {
        this.work_name = work_name;
        this.duration = duration;
        this.name_in_charge = name_in_charge;
        this.estado = estado;
    }

    public String getWork_name() {
        return work_name;
    }

    public void setWork_name(String work_name) {
        this.work_name = work_name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getName_in_charge() {
        return name_in_charge;
    }

    public void setName_in_charge(String name_in_charge) {
        this.name_in_charge = name_in_charge;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Work [Nombre de la tarea=" + work_name + ", duracion=" + duration + ", Nombre del encargado=" + name_in_charge
                + ", Estado actual=" + estado + "]";
    }
}