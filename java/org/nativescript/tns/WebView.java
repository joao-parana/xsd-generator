//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2015.09.12 às 11:28:18 PM BRT 
//


package org.nativescript.tns;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de WebView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="WebView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}webViewAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebView")
public class WebView
    extends View
{

    @XmlAttribute(name = "loadStarted")
    protected String loadStarted;
    @XmlAttribute(name = "loadFinished")
    protected String loadFinished;
    @XmlAttribute(name = "url")
    protected String url;
    @XmlAttribute(name = "src")
    protected String src;
    @XmlAttribute(name = "canGoBack")
    protected String canGoBack;
    @XmlAttribute(name = "canGoForward")
    protected String canGoForward;

    /**
     * Obtém o valor da propriedade loadStarted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadStarted() {
        return loadStarted;
    }

    /**
     * Define o valor da propriedade loadStarted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadStarted(String value) {
        this.loadStarted = value;
    }

    /**
     * Obtém o valor da propriedade loadFinished.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadFinished() {
        return loadFinished;
    }

    /**
     * Define o valor da propriedade loadFinished.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadFinished(String value) {
        this.loadFinished = value;
    }

    /**
     * Obtém o valor da propriedade url.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Define o valor da propriedade url.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Obtém o valor da propriedade src.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Define o valor da propriedade src.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

    /**
     * Obtém o valor da propriedade canGoBack.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanGoBack() {
        return canGoBack;
    }

    /**
     * Define o valor da propriedade canGoBack.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanGoBack(String value) {
        this.canGoBack = value;
    }

    /**
     * Obtém o valor da propriedade canGoForward.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanGoForward() {
        return canGoForward;
    }

    /**
     * Define o valor da propriedade canGoForward.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanGoForward(String value) {
        this.canGoForward = value;
    }

}
