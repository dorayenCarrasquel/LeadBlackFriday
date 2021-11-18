package br.com.zup.LeadBlackFriday.lead;

import br.com.zup.LeadBlackFriday.producto.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeadService {
    @Autowired
    LeadRepository leadRepository;
    @Autowired
    ProductoRepository productoRepository;

}
