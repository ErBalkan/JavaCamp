package kodlama.io.rentACar.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.IBrandService;
import kodlama.io.rentACar.business.dtos.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.dtos.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.dtos.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.dtos.responses.GetByIdBrandResponse;
import kodlama.io.rentACar.core.utilities.mappers.IModelMapperService;
import kodlama.io.rentACar.dataAccess.abstracts.IBrandRepository;
import kodlama.io.rentACar.entities.concretes.Brand;


@Service
// Bu annotation'ın amacı, Spring tarafından yönetilen sınıfların servis sınıfı olduğunu belirtmektir.
public class BrandManager implements IBrandService {

    private IBrandRepository brandRepository;
    private IModelMapperService modelMapperService;


    @Autowired
    // Bu annotation'ın amacı, Spring tarafından yönetilen sınıfların constructor, field ve method'lara otomatik olarak bağımlılıklarını enjekte etmektir.
    // Bu annotation'ın kullanımı ile bağımlılıkların enjekte edilmesi sağlanır.
    public BrandManager (
        IBrandRepository brandRepository,
        IModelMapperService modelMapperService
        ) {
        this.brandRepository = brandRepository;
        this.modelMapperService = modelMapperService;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = this.brandRepository.findAll();
        // ModelMapper
        List<GetAllBrandsResponse> brandsResponse = brands.stream()
            .map(brand -> this.modelMapperService.forResponse()
            .map(brand,GetAllBrandsResponse.class)).collect(Collectors.toList());
        return brandsResponse;
        /*
        Bu kod parçası, brands adlı bir listeyi işleyerek her bir öğeyi GetAllBrandsResponse türüne dönüştürüyor ve sonuçları yeni bir liste olarak döndürüyor. 
        İşte adım adım açıklaması:

        brands.stream(): brands listesini bir akışa (stream) dönüştürür. Bu, listedeki her bir öğe üzerinde işlem yapmayı sağlar.

        .map(brand -> this.modelMapperService.forResponse().map(brand, GetAllBrandsResponse.class)): Akıştaki her bir brand öğesini alır ve modelMapperService kullanarak GetAllBrandsResponse türüne dönüştürür. modelMapperService.forResponse().map metodu, brand nesnesini GetAllBrandsResponse sınıfına eşler.

        .collect(Collectors.toList()): Dönüştürülmüş öğeleri bir listeye toplar.

        return brandsResponse;: Oluşturulan GetAllBrandsResponse listesini döndürür.

        Bu kodun amacı, brands listesindeki her bir brand nesnesini GetAllBrandsResponse nesnesine dönüştürmek ve bu dönüştürülmüş nesneleri içeren bir liste döndürmektir.
         */

    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        // ModelMapper
        Brand brand = this.modelMapperService.forRequest().map(createBrandRequest,Brand.class);
        /*
         * Bu kod, createBrandRequest nesnesini Brand sınıfına dönüştürmek için ModelMapper kütüphanesini kullanıyor. Adım adım açıklayalım:
        
         this.modelMapperService.forRequest() çağrısı, ModelMapper nesnesini döndüren bir metodu çağırır. Bu metod, ModelMapper nesnesinin yapılandırmasını ayarlar ve döndürür.
        
        setAmbiguityIgnored(true): Aynı isimde birden fazla özellik varsa hata vermemesi için yapılandırma ayarı.
        
        setMatchingStrategy(MatchingStrategies.STANDARD): Özelliklerin birebir eşleşmesi gerektiğini belirten eşleştirme stratejisi.
        
        map(createBrandRequest, Brand.class) çağrısı, createBrandRequest nesnesini Brand sınıfına dönüştürür.

        createBrandRequest: Dönüştürülmek istenen kaynak nesne.
        Brand.class: Hedef sınıf tipi.
        Sonuç olarak, createBrandRequest nesnesindeki veriler Brand sınıfına ait bir nesneye dönüştürülür ve brand değişkenine atanır.
         * 
         */
        this.brandRepository.save(brand);
    }

    @Override
    public GetByIdBrandResponse getById(int id) {
        Brand brand = this.brandRepository.findById(id).orElseThrow();
        GetByIdBrandResponse response = 
            this.modelMapperService.forResponse()
            .map(brand,GetByIdBrandResponse.class);
        
        return response;

        /*
        Bu kod parçası, belirli bir id ile bir Brand nesnesi bulur ve bu nesneyi bir GetByIdBrandResponse nesnesine dönüştürür. İşte adım adım açıklaması:

        Brand brand = this.brandRepository.findById(id).orElseThrow();

        brandRepository nesnesi kullanılarak, verilen id ile bir Brand nesnesi aranır.
        
        findById(id) metodu, belirtilen id ile eşleşen bir Brand nesnesi döndürür.
        
        Eğer belirtilen id ile eşleşen bir Brand bulunamazsa, orElseThrow() metodu bir istisna fırlatır.
        
        GetByIdBrandResponse response = this.modelMapperService.forResponse().map(brand, GetByIdBrandResponse.class);

        modelMapperService nesnesi kullanılarak, Brand nesnesi (brand) bir GetByIdBrandResponse nesnesine dönüştürülür.

        forResponse() metodu, dönüşüm işlemi için gerekli olan yapılandırmayı sağlar.
        
        map(brand, GetByIdBrandResponse.class) metodu, brand nesnesini GetByIdBrandResponse sınıfına dönüştürür.
        
        return response;
        Dönüştürülen GetByIdBrandResponse nesnesi geri döndürülür.
        Bu kod parçası, bir Brand nesnesini veritabanından alır ve bu nesneyi bir GetByIdBrandResponse nesnesine dönüştürerek geri döndürür. 
        Bu işlem, genellikle bir API çağrısının parçası olarak kullanılır ve istemciye belirli bir Brand nesnesinin detaylarını döndürmek için kullanılır.
         */

    }

    @Override
    public void update(UpdateBrandRequest updateBrandRequest) {
        Brand brand = this.modelMapperService.forRequest().map(updateBrandRequest,Brand.class);
        this.brandRepository.save(brand);

        /*
        Bu kod parçası, updateBrandRequest nesnesini bir Brand nesnesine dönüştürüp, ardından bu Brand nesnesini veritabanına kaydediyor. Adım adım açıklayalım:

        this.modelMapperService.forRequest() çağrısı, ModelMapper nesnesinin konfigürasyonunu ayarlayan bir metodu çağırır. 
        Bu metod, ModelMapper'ın özellik eşleştirme stratejisini ve belirsizlik durumlarını nasıl ele alacağını belirler.
        
        map(updateBrandRequest, Brand.class) kısmı, updateBrandRequest nesnesini Brand sınıfına dönüştürür. 
        Bu, updateBrandRequest nesnesindeki verilerin Brand sınıfındaki uygun alanlara kopyalanmasını sağlar.

        Veritabanına Kaydetme:

        this.brandRepository.save(brand) çağrısı, Brand nesnesini veritabanına kaydeder. save metodu, nesnenin yeni olup olmadığını kontrol eder. 
        Eğer yeni bir nesne ise persist, değilse merge işlemi yapılır.
        
        Bu kodun amacı, bir güncelleme isteğini alıp, bu isteği bir Brand nesnesine dönüştürmek ve ardından bu nesneyi veritabanına kaydetmektir. 
        Bu işlem, genellikle bir REST API'den gelen güncelleme isteklerini işlemek için kullanılır.
         */


    }

    @Override
    public void delete(int id) {
        this.brandRepository.deleteById(id);
        // Bu kod parçası, belirli bir id ile bir Brand nesnesini veritabanından siler.
        // brandRepository.deleteById(id) metodu, belirtilen id ile eşleşen bir Brand nesnesini veritabanından siler.
        // Bu kodun amacı, belirli bir id ile bir Brand nesnesini veritabanından silmektir. Bu işlem, genellikle bir REST API'den gelen silme isteklerini işlemek için kullanılır. 
    }

}
