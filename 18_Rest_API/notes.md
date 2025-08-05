CRUD Operations, REST API & API Status Codes
1. CRUD Operations in Spring Boot
CRUD stands for Create, Read, Update, Delete. These are the fundamental operations for interacting with a database in Spring Boot.

1.1 Common Annotations
Annotation	Description
@Entity	Defines a JPA entity (maps to a table).
@Id	Marks the primary key.
@GeneratedValue	Auto-generates primary key value.
@Repository	Marks the Data Access layer (DAO).
@Service	Marks a service class for business logic.
@RestController	Defines RESTful web service controller.
@RequestMapping	Maps HTTP requests at class or method level.

1.2 CRUD HTTP Methods
Operation	HTTP Method	Example Endpoint
Create	POST	/api/products
Read	GET	/api/products/{id}
Update	PUT	/api/products/{id}
Delete	DELETE	/api/products/{id}

1.3 Example Entity
java
Copy code
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    // Getters and Setters
}
1.4 Example Repository
java
Copy code
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
1.5 Example Service
java
Copy code
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    public Product updateProduct(Product product) {
        return repository.save(product);
    }

    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }
}
1.6 Example Controller
java
Copy code
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PutMapping
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id) {
        service.deleteProduct(id);
        return "Product deleted successfully";
    }
}
2. REST API in Spring Boot
2.1 What is REST?
REST (Representational State Transfer) is an architectural style for building web services.

Uses HTTP methods for CRUD operations.

Data is typically exchanged in JSON format.

2.2 REST Principles
Stateless – No session information is stored on the server.

Client-Server – Separation of UI and backend.

Cacheable – Responses can be cached to improve performance.

Layered System – APIs can be layered using intermediaries.

3. API Status Codes
Code	Meaning	Usage Example
200	OK	Successful GET/PUT/DELETE request.
201	Created	Successful POST request.
204	No Content	Successful DELETE request.
400	Bad Request	Invalid request from client.
401	Unauthorized	Authentication required.
403	Forbidden	User not allowed.
404	Not Found	Resource not found.
500	Internal Server Error	Server encountered an error.

3.1 Example with ResponseEntity
java
Copy code
@PostMapping
public ResponseEntity<Product> createProduct(@RequestBody Product product) {
    Product savedProduct = service.saveProduct(product);
    return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
}