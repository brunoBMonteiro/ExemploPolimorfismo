public class Teste {
    public static void main(String[] args){

        // Abstract, não se pode instanciar uma classe Pessoa por ser abstrata.
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        pessoa.setEndereco("Rua 1, num1");
        aluno.setEndereco("Rua 2, num2");
        professor.setEndereco("Rua 3, num3");

        // Encapsulamento acessando o atributo privado através do método
        pessoa.setNome("João");

        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.getEndereco());


        //Por causa da herança aluno e professor passam a ter acesso ao método
    }
}