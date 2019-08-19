
package com.amdocs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amdocs package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _SayHelloReturn_QNAME = new QName("http://amdocs.com", "sayHelloReturn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amdocs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://amdocs.com", name = "sayHelloReturn")
    public JAXBElement<String> createSayHelloReturn(String value) {
        return new JAXBElement<String>(_SayHelloReturn_QNAME, String.class, null, value);
    }

}
