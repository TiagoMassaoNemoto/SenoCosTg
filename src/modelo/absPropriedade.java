package modelo;

public abstract class absPropriedade implements intMetodos
{
    public String mensagem;
    protected String numero;
    protected Double n1;
    protected Double seno;
    protected Double cosseno;
    protected Double tangente;
    protected String resposta;
    
    public absPropriedade(String numero)
    {
        this.numero = numero;
    }
    
    public absPropriedade(double n1)
    {
        this.n1 = n1;
    }

    @Override
    public String toString()
    {
        return this.mensagem ="<html>" + "Seno = " + this.seno
                + "<br>" + "Cosseno = " + this.cosseno
                + "<br>" + "Tangente = " + this.tangente + "<html>";
    }

    @Override
    public abstract void Executar();
}
