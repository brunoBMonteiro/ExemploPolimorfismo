public class Professor extends Pessoa {

    private double salario;
    private String nomeCurso;


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calculaSalarioLiquido(){
        return 0;
    }

    // Sobrecarga de método
    // se chamar só o get endereco ele retorna o endereco, mas se chamar o método ele retorna o metodo mais a sobrecarga
    public String obterEtiquetaEndereco(){

        String s = "Endereço do professor: ";
        s += super.getEndereco();

        return s;
    }
}