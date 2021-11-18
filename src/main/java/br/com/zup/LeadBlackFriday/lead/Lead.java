package br.com.zup.LeadBlackFriday.lead;

import br.com.zup.LeadBlackFriday.producto.Producto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "leads")
public class Lead {
    @Id
    @Column(unique = true)
    private String email;
    private String nome;
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Producto> productos;

    public Lead() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
