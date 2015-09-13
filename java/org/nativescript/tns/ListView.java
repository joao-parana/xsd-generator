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
 * <p>Classe Java de ListView complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ListView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.nativescript.org/tns.xsd}View">
 *       &lt;attGroup ref="{http://www.nativescript.org/tns.xsd}listViewAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListView")
public class ListView
    extends View
{

    @XmlAttribute(name = "itemLoading")
    protected String itemLoading;
    @XmlAttribute(name = "itemTap")
    protected String itemTap;
    @XmlAttribute(name = "loadMoreItems")
    protected String loadMoreItems;
    @XmlAttribute(name = "isScrolling")
    protected String isScrolling;
    @XmlAttribute(name = "itemTemplate")
    protected String itemTemplate;
    @XmlAttribute(name = "separatorColor")
    protected String separatorColor;

    /**
     * Obtém o valor da propriedade itemLoading.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLoading() {
        return itemLoading;
    }

    /**
     * Define o valor da propriedade itemLoading.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLoading(String value) {
        this.itemLoading = value;
    }

    /**
     * Obtém o valor da propriedade itemTap.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTap() {
        return itemTap;
    }

    /**
     * Define o valor da propriedade itemTap.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTap(String value) {
        this.itemTap = value;
    }

    /**
     * Obtém o valor da propriedade loadMoreItems.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadMoreItems() {
        return loadMoreItems;
    }

    /**
     * Define o valor da propriedade loadMoreItems.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadMoreItems(String value) {
        this.loadMoreItems = value;
    }

    /**
     * Obtém o valor da propriedade isScrolling.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsScrolling() {
        return isScrolling;
    }

    /**
     * Define o valor da propriedade isScrolling.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsScrolling(String value) {
        this.isScrolling = value;
    }

    /**
     * Obtém o valor da propriedade itemTemplate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemTemplate() {
        return itemTemplate;
    }

    /**
     * Define o valor da propriedade itemTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemTemplate(String value) {
        this.itemTemplate = value;
    }

    /**
     * Obtém o valor da propriedade separatorColor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeparatorColor() {
        return separatorColor;
    }

    /**
     * Define o valor da propriedade separatorColor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeparatorColor(String value) {
        this.separatorColor = value;
    }

}
