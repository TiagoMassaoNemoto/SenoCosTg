package modelo;

public class Controle extends absPropriedade
{

    public Controle(String numero)
    {
        super(numero);
        this.Executar();
    }

    public void Executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.numero);
        if(validacao.mensagem.equals(""))
        {
            Calcular calcular = new Calcular(validacao.n1);
            this.mensagem = calcular.toString();
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
    
}
