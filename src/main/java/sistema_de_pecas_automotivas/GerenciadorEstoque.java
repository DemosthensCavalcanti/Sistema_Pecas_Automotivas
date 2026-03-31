import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {
  private List<Peca> pecas;

  public GerenciadorEstoque() {
    this.pecas = new ArrayList<>();
  }

  public void adicionarPeca(Peca peca) {
    this.pecas.add(peca);
  }

  public void listarPecas() {
    for (Peca p : pecas) {
      System.out.println(p.toString());
    }
  }

  public Peca buscarPorCodigo(String codigo) throws PecaNaoEncontradaException {
    for (Peca p : pecas) {
      if (p.getCodigo().equals(codigo)) {
        return p;
      }
    }
    throw new PecaNaoEncontradaException("A peca com codigo " + codigo + " nao existe no estoque.");
  }
}