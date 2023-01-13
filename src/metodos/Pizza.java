package metodos;

import telas.ViewPizza;

public class Pizza extends ViewPizza implements Produtos {

    //taxa de entrega
    public static final double TAXA_ENTREGA = 5.0;

    private int orderno;
    private int qty;
    private String custname;
    private double rate;
    private double topamt;
    private double totalpayable;


    @Override
    public double getTotalpayable() {
        return totalpayable;
    }

    @Override
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setTotalpayable(double totalpayable) {
        this.totalpayable = totalpayable + TAXA_ENTREGA;
    }

    @Override
    public double getTopamt() {
        return topamt;
    }

    public void setTopamt(double topamt) {
        this.topamt = topamt;
    }

    public Pizza(int orderno, String custname, int qty, double rate, double topamt, double totalpayable) {
        this.orderno = orderno;
        this.qty = qty;
        this.custname = custname;
        this.rate = rate;
        this.topamt = topamt;
        this.totalpayable = totalpayable;
    }

    @Override
    public int getOrderno() {
        return orderno;
    }

    public void setOrderno(int orderno) {
        this.orderno = orderno;
    }

    @Override
    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    @Override
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Id do pedido: " + orderno + "\nCliente: " + custname + "\nValor: " + totalpayable;
        // return "Id do Pedido: " + orderno + "\nNome: " + custname + "\nValor: " + totalpayable);

    }

}