
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CompteList_QNAME = new QName("http://ws.example.org/", "compteList");
    private static final QName _CompteListResponse_QNAME = new QName("http://ws.example.org/", "compteListResponse");
    private static final QName _ConersionEuroToFh_QNAME = new QName("http://ws.example.org/", "conersionEuroToFh");
    private static final QName _ConersionEuroToFhResponse_QNAME = new QName("http://ws.example.org/", "conersionEuroToFhResponse");
    private static final QName _GetCOmpte_QNAME = new QName("http://ws.example.org/", "getCOmpte");
    private static final QName _GetCOmpteResponse_QNAME = new QName("http://ws.example.org/", "getCOmpteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompteList }
     * 
     * @return
     *     the new instance of {@link CompteList }
     */
    public CompteList createCompteList() {
        return new CompteList();
    }

    /**
     * Create an instance of {@link CompteListResponse }
     * 
     * @return
     *     the new instance of {@link CompteListResponse }
     */
    public CompteListResponse createCompteListResponse() {
        return new CompteListResponse();
    }

    /**
     * Create an instance of {@link ConersionEuroToFh }
     * 
     * @return
     *     the new instance of {@link ConersionEuroToFh }
     */
    public ConersionEuroToFh createConersionEuroToFh() {
        return new ConersionEuroToFh();
    }

    /**
     * Create an instance of {@link ConersionEuroToFhResponse }
     * 
     * @return
     *     the new instance of {@link ConersionEuroToFhResponse }
     */
    public ConersionEuroToFhResponse createConersionEuroToFhResponse() {
        return new ConersionEuroToFhResponse();
    }

    /**
     * Create an instance of {@link GetCOmpte }
     * 
     * @return
     *     the new instance of {@link GetCOmpte }
     */
    public GetCOmpte createGetCOmpte() {
        return new GetCOmpte();
    }

    /**
     * Create an instance of {@link GetCOmpteResponse }
     * 
     * @return
     *     the new instance of {@link GetCOmpteResponse }
     */
    public GetCOmpteResponse createGetCOmpteResponse() {
        return new GetCOmpteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteList }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "compteList")
    public JAXBElement<CompteList> createCompteList(CompteList value) {
        return new JAXBElement<>(_CompteList_QNAME, CompteList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompteListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "compteListResponse")
    public JAXBElement<CompteListResponse> createCompteListResponse(CompteListResponse value) {
        return new JAXBElement<>(_CompteListResponse_QNAME, CompteListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConersionEuroToFh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConersionEuroToFh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "conersionEuroToFh")
    public JAXBElement<ConersionEuroToFh> createConersionEuroToFh(ConersionEuroToFh value) {
        return new JAXBElement<>(_ConersionEuroToFh_QNAME, ConersionEuroToFh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConersionEuroToFhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConersionEuroToFhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "conersionEuroToFhResponse")
    public JAXBElement<ConersionEuroToFhResponse> createConersionEuroToFhResponse(ConersionEuroToFhResponse value) {
        return new JAXBElement<>(_ConersionEuroToFhResponse_QNAME, ConersionEuroToFhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCOmpte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCOmpte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCOmpte")
    public JAXBElement<GetCOmpte> createGetCOmpte(GetCOmpte value) {
        return new JAXBElement<>(_GetCOmpte_QNAME, GetCOmpte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCOmpteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCOmpteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCOmpteResponse")
    public JAXBElement<GetCOmpteResponse> createGetCOmpteResponse(GetCOmpteResponse value) {
        return new JAXBElement<>(_GetCOmpteResponse_QNAME, GetCOmpteResponse.class, null, value);
    }

}
