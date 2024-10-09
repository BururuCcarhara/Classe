package relacao.atividade;

public class PrincipalEM {

    public static void main(String[] args) {
        
        Departamento departamento = new Departamento("Thurusbago");
        Empresa empresa = new Empresa("thurusbango",departamento);
        
        System.out.println("Empresa é: " + empresa.getNome() + "\nDepartamento: " + departamento.getNome());
    }

}