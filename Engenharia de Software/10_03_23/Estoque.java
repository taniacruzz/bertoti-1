public class Estoque {
    private List<Produto> produtos;

    public void addProduto (Produto produto) {
        produtos.add(produto);
    }
    public List<Produto> buscaProdutoNome (String nome) {
        List<Produto> result = new List<Produto>();
        for (int i = 0; i < this.produtos.length(); i++) {
            if this.produtos[i].name == nome { 
                result.add(this.produtos[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
		
	}
}