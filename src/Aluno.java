public class Aluno extends Pessoa {

    private String curso;
    private double[] notas;


    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }


    public boolean verificarAprovado(){
        return true;
    }

    public void  metodoQualquer(){
        super.setCpf("321.354.912-65");

        this.setCpf("321-654-10");
    }

    // Sobrecarga de método
    public String obterEtiquetaEndereco(){

        String s = "Endereço do aluno: ";
        s += super.getEndereco();

        return s;
    }
}