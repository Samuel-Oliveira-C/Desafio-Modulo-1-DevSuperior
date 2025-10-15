package com.desafio.desafioModulo1.entities;

public class Order {
    private int code;
    private double basic;
    private double discount;
    
    
    public Order(int code, double basic, double discount) {
        this.code = code;
        this.basic = basic;
        this.discount = discount;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getBasic() {
        return basic;
    }
    public void setBasic(double basic) {
        this.basic = basic;
    }
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }


    @Override
    public String toString() {
        return "Order [code=" + code + ", basic=" + basic + ", discount=" + discount + ", hashCode()=" + hashCode()
                + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + code;
        long temp;
        temp = Double.doubleToLongBits(basic);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(discount);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (code != other.code)
            return false;
        if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
            return false;
        if (Double.doubleToLongBits(discount) != Double.doubleToLongBits(other.discount))
            return false;
        return true;
    }
}
/* Para esse Desafio não é necessário hashCode, equals nem toString,
 * mas para o aprendizado já que Order é uma entidade deixei mesmo assim
 */