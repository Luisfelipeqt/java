package applications;

public class OrderItem {
	private Integer quantidade;
	private Double valor;
	private Product product;

	public OrderItem() {

	}

	public OrderItem(Integer quantidade, Double valor, Product product) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.product = product;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public double subTotal() {
		return valor * quantidade;
	}
	
	@Override
	public String toString() {
		return getProduct().getNome()
				+ ", $"
				+ String.format("%.2f", valor)
				+ ", Quantity: "
				+ quantidade
				+ ", Subtotal: $"
				+ String.format("%.2f", subTotal());
				
		
	}
	
}
