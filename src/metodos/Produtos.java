package metodos;

public interface Produtos {
	
    public double getTotalpayable();
    public int getQty();

    public double getTopamt();

    public int getOrderno();

    public String getCustname();

    public double getRate();

    @Override
     public String toString();
	
}