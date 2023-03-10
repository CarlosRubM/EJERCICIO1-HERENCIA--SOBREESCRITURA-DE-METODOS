public class Secretario extends Empleado{

    @Override
    public int getVacaciones() {
        return super.getVacaciones();
    }

    @Override
    public double getSalario() {
        return super.getSalario()+5000;
    }

    @Override
    public int getHoras() {
        return super.getHoras();
    }

    @Override
    public String getMesVacaciones() {
        return "Agosto";
    }

    public void mostrar(){
        System.out.println("Estoy en el tribunal");
    }


}
