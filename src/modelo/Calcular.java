package modelo;

public class Calcular extends absPropriedade
{

    public Calcular(double n1)
    {
        super(n1);
        this.Executar();
    }
    
    public void Executar()
    {
        this.n1 = Math.toRadians(this.n1);
        this.seno = Math.sin(this.n1);
        this.cosseno = Math.cos(this.n1);
        this.tangente = Math.tan(this.n1);
        this.toString();
    }
}
