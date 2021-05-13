package modelo;

public class Validacao extends absPropriedade
{

    public Validacao(String numero)
    {
        super(numero);
    }

    public void Executar()
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.parseDouble(this.numero);
            
            if (this.n1 < -360)
                this.mensagem = "Digite um número maior que -360";
            
            else if (this.n1 > 360)
                this.mensagem = "Digite um número menor que 360" ;               
        }
        catch (Exception e)
        {
            this.mensagem = "Número invalido";
        }
    }
    
}
