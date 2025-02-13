package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "models")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    // Model nesnesinin Brand nesnesi ile ilişkisi (ManyToOne)
    @JoinColumn(name = "brand_id") // Brand nesnesi ile ilişkisi olan sütunun adı
    private Brand brand; // Model nesnesinin Brand nesnesi ile ilişkisi (ManyToOne)

    @OneToMany(mappedBy = "model") 
    // Car nesnesi ile Model nesnesi arasında bire çok ilişki vardır.
    private List<Car> cars;
}
