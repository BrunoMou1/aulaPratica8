import java.util.ArrayList;

public class Deposito {
	private ArrayList<Object> list = new ArrayList<Object>();

	public ArrayList<Object> getList() {
		return list;
	}

	public void setList(ArrayList<Object> list) {
		this.list = list;
	}
	
	public void addProduto(Produto produto) {
		list.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		list.remove(produto);
	}
	
	public int quantidadeProdutos() {
		return list.size();
	}
	
	public boolean seDepositoEstaVazio () {
		if(list.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}

