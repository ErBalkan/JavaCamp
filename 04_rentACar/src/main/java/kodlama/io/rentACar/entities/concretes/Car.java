package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "cars")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "plate", unique = true) // Bu değer bir daha tekrar edemez.
    private String plate;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "modelYear")
    private String modelYear;

    @Column(name = "state")
    private int state; // Satışa hazır - Kiralık - Bakımda

    @ManyToOne // Car nesnesinin Model nesnesi ile ilişkisi (ManyToOne)
    @JoinColumn(name = "model_id") // Model nesnesi ile ilişkisi olan sütunun adı
    private Model model; 

}