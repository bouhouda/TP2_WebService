
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

    private static final QName _ConversionEutoToDH_QNAME = new QName("http://ws/", "conversionEutoToDH");
    private static final QName _ConversionEutoToDHResponse_QNAME = new QName("http://ws/", "conversionEutoToDHResponse");
    private static final QName _ConvertDHToEuro_QNAME = new QName("http://ws/", "convertDHToEuro");
    private static final QName _ConvertDHToEuroResponse_QNAME = new QName("http://ws/", "convertDHToEuroResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private static final QName _ListComptes_QNAME = new QName("http://ws/", "listComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://ws/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConversionEutoToDH }
     * 
     * @return
     *     the new instance of {@link ConversionEutoToDH }
     */
    public ConversionEutoToDH createConversionEutoToDH() {
        return new ConversionEutoToDH();
    }

    /**
     * Create an instance of {@link ConversionEutoToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEutoToDHResponse }
     */
    public ConversionEutoToDHResponse createConversionEutoToDHResponse() {
        return new ConversionEutoToDHResponse();
    }

    /**
     * Create an instance of {@link ConvertDHToEuro }
     * 
     * @return
     *     the new instance of {@link ConvertDHToEuro }
     */
    public ConvertDHToEuro createConvertDHToEuro() {
        return new ConvertDHToEuro();
    }

    /**
     * Create an instance of {@link ConvertDHToEuroResponse }
     * 
     * @return
     *     the new instance of {@link ConvertDHToEuroResponse }
     */
    public ConvertDHToEuroResponse createConvertDHToEuroResponse() {
        return new ConvertDHToEuroResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEutoToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEutoToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEutoToDH")
    public JAXBElement<ConversionEutoToDH> createConversionEutoToDH(ConversionEutoToDH value) {
        return new JAXBElement<>(_ConversionEutoToDH_QNAME, ConversionEutoToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEutoToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEutoToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionEutoToDHResponse")
    public JAXBElement<ConversionEutoToDHResponse> createConversionEutoToDHResponse(ConversionEutoToDHResponse value) {
        return new JAXBElement<>(_ConversionEutoToDHResponse_QNAME, ConversionEutoToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHToEuro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHToEuro }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertDHToEuro")
    public JAXBElement<ConvertDHToEuro> createConvertDHToEuro(ConvertDHToEuro value) {
        return new JAXBElement<>(_ConvertDHToEuro_QNAME, ConvertDHToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertDHToEuroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertDHToEuroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertDHToEuroResponse")
    public JAXBElement<ConvertDHToEuroResponse> createConvertDHToEuroResponse(ConvertDHToEuroResponse value) {
        return new JAXBElement<>(_ConvertDHToEuroResponse_QNAME, ConvertDHToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
