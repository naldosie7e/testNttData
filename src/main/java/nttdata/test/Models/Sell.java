package nttdata.test.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "sell")
public class Sell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdVenta;

    @Column(nullable = false)
    String sellDescription;

    @Column(nullable = false)
    Float sellValue;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private Employee employee;

}
