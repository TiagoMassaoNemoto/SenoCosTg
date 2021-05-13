package modelo;

public class Calcular extends absPropriedade
{

    public Calcular(double n1)
    {
        super(n1);
    }
    
    public void Executar()
    {
        this.n1 = Math.toRadians(this.n1);
        this.seno = Math.sin(this.n1);
        this.cosseno = Math.cos(this.n1);
        this.tangente = Math.tan(this.n1);
        if (this.n1 == Math.toRadians(90))
        {
            this.cosseno = 0.0;
            this.tangente = 1.0/0;
        }
        else if (this.n1 == Math.toRadians(180))
        {
            this.seno = 0.0;
            this.tangente = 0.0/1;
        }
        else if (this.n1 == Math.toRadians(270))
        {
            this.cosseno = 0.0;
            this.tangente = 1.0/0;
        }
        else if (this.n1 == Math.toRadians(360))
        {
            this.seno = 0.0;
            this.tangente = 0.0/1;
        }
        this.toString();
    }
}
