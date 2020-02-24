package classes;

public class Funcionario {

    private String nome = "";
    private int numDeFilhos = 0;
    private float salarioMensal = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumDeFilhos() {
        return numDeFilhos;
    }

    public void setNumDeFilhos(int numDeFilhos) {
        this.numDeFilhos = numDeFilhos;
    }

    public float getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public float calcAumentoSalarial(float porcentagem)throws Exception {
    return this.salarioMensal+=(salarioMensal * porcentagem / 100);        
    }

    public float calcInss()throws Exception {        
        float inss = 0f;
        float baseMinima = 2545.00f;
        float diferencaInss = 0f;

        if (salarioMensal <= baseMinima) {
            inss = salarioMensal * 0.06f;
            
        } else if (salarioMensal > baseMinima) {
            diferencaInss = (salarioMensal - baseMinima) * 0.10f;
            inss = (baseMinima * 0.06f) + diferencaInss;
        }

        return inss;
    }
    public float calculaImpRenda()throws Exception{         
        float impostoRenda = 0;
        
        if( salarioMensal <= 1903.98){
            impostoRenda = 0;
        }else if (salarioMensal > 1903.98 && salarioMensal <= 2826.65){
            impostoRenda = salarioMensal * 0.075f;
        }else if (salarioMensal > 2826.65 && salarioMensal <= 3751.05){
            impostoRenda = salarioMensal * 0.15f;
        }else if (salarioMensal > 3751.05 && salarioMensal <= 4664.69){
            impostoRenda = salarioMensal * 0.225f;
        }else {
            impostoRenda = salarioMensal * 0.275f;
        } 
        
        return impostoRenda;
    }
    public float calculaIRPFmensal ()throws Exception{
        float result;
        result =  calculaImpRenda() - (545.00f * this.numDeFilhos);
        if(result > 0){
            result = result;
        }else {
            result = 0f;
        }
        
        return result;
    }

    
        

   
    

}
