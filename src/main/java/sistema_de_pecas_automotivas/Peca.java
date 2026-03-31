import java.util.Objects;

public class Peca {
  private String nome;
  private String codigo;
  private double preco;

  public Peca() {
  }

  public Peca(String nome, String codigo, double preco) {
    this.nome = nome;
    this.codigo = codigo;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public void aplicarDesconto(double porcentagem) {
    this.preco = this.preco - (this.preco * (porcentagem / 100.0));
  }

  @Override
  public String toString() {
    return "Peca [codigo=" + codigo + ", nome=" + nome + ", preco=R$" + preco + "]";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Peca peca = (Peca) o;
    return Objects.equals(codigo, peca.codigo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo);
  }
}