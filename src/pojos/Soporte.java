package pojos;

public class Soporte {
    private Empresa empresa;
    private Tecnologico producto;
    private Double precio;

    public Soporte(Empresa empresa, Tecnologico producto, Double precio) {
        this.setEmpresa(empresa);
        this.setProducto(producto);
        this.setPrecio(precio);
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Tecnologico getProducto() {
        return producto;
    }

    public void setProducto(Tecnologico producto) {
        this.producto = producto;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
