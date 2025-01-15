package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "brands") // Database tablosunun adı
@Data // Lombok ile getter ve setter'ları ve parametresiz constructor oluşturduk
@AllArgsConstructor // Lombok ile parametreli constructor oluşturduk
// @Getter // Lombok ile getter oluşturduk
// @Setter // Lombok ile setter oluşturduk
@NoArgsConstructor // Lombok ile parametresiz constructor oluşturduk 

@Entity // Veritabanı nesnesi olduğunu belirttik
public class Brand {

    @Id // Veritabanı sütununun id olduğunu belirttik
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    // Id'nin otomatik artan olduğunu belirttik
    @Column(name = "id") // Veritabanı sütununun adı
    private int id;
    @Column(name = "name") // Veritabanı sütununun adı
    private String name;


    // // Constructors
//     public Brand() {}
    
//     public Brand(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

// // Getters and Setters
// public int getId() {
//     return id;
// }

// public void setId(int id) {
//     this.id = id;
// }

// public String getName() {
//     return name;
// }

// public void setName(String name) {
//     this.name = name;
// }

}
